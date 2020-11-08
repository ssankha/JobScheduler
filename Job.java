public class Job implements Comparable{

    private String name;
    private int deadline;
    private int duration;

    public Job(String name, int deadline, int duration) {
        this.name = name;
        this.deadline = deadline;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public int compareTo(Object o) {

        Job other = (Job) o;

        return other.deadline - deadline;
    }
}
