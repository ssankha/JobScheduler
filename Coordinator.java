import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coordinator {

    private static ArrayList<Job> jobs = new ArrayList<Job>();

    public static void main(String[] args) {

        // initialize scanner


        // print menu


        // actions based on menu selection

    }

    public static void addJob(Scanner scan) {
        System.out.println("What is the name of the job you want to add?");
        String name = scan.nextLine();

        System.out.println("How long do you have to do this job on a scale of 1 to 10");
        int deadline = Integer.parseInt(scan.nextLine());

        System.out.println("How long will this job take to complete on a scale of 1 to 10");
        int duration = Integer.parseInt(scan.nextLine());

        jobs.add(new Job(name, deadline, duration));
    }

    public static void removeJob(Scanner scan) {
        System.out.println("What is the name of the job you want to remove?");
        String name = scan.nextLine();

        boolean found = false;
        int index = -1;

        if(jobs.get(0) != null) {

            for(Job j : jobs) {
                if(j.getName().equals(name)) {
                    found = true;
                    jobs.remove(j);

                    break;
                }
            }
        }

        if(found) {
            System.out.println("Job has been removed!");
        }
        else {
            System.out.println("A job with name was not found!");
        }

    }

    public static void printSchedule(){

    }

    public static void computeSchedule() {
        if(jobs.get(0) == null) {
            System.out.println("No jobs to create schedule!");

            return;
        }

        // sort jobs by descending order
        Collections.sort(jobs);

    }

    public static void showMenu() {

    }
}
