import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coordinator {

    private static ArrayList<Job> jobs = new ArrayList<Job>();

    public static void main(String[] args) {

        // initialize scanner
        Scanner scan = new Scanner(System.in);

        // print menu
        boolean runAgain = false;

        do {
            runAgain = true;

            showMenu();

            String choice = scan.nextLine();

            if (choice.equals("1")) {
                addJob(scan);
            } else if (choice.equals("2")) {
                removeJob(scan);
            } else if (choice.equals("3")) {
                printSchedule();
            } else if (choice.equals("4")) {
                System.out.println("Now exiting the Job Scheduler...");
                runAgain = false;
            } else {
                System.out.println("Please select a valid option!");
            }
        } while (runAgain);


    }

    public static void addJob(Scanner scan) {
        System.out.println("What is the name of the job you want to add?");
        String name = scan.nextLine();

        System.out.println("How long do you have to do this job on a scale of 1 to 10");
        int deadline = Integer.parseInt(scan.nextLine());

        System.out.println("How long will this job take to complete on a scale of 1 to 10");
        int duration = Integer.parseInt(scan.nextLine());

        jobs.add(new Job(name, deadline, duration));

        computeSchedule();
    }

    public static void removeJob(Scanner scan) {

        if (jobs.size() == 0) {
            System.out.println("There are no jobs to remove!");

            return;
        }

        System.out.println("What is the name of the job you want to remove?");
        String name = scan.nextLine();

        boolean found = false;
        int index = -1;


        for (Job j : jobs) {

            if (j.getName().equals(name)) {
                found = true;
                jobs.remove(j);

                break;
            }
        }

        computeSchedule();


        if (found) {
            System.out.println("Job has been removed!");
        } else {
            System.out.println("A job with that name was not found!");
        }

    }

    public static void printSchedule() {

        if (jobs.size() == 0) {
            System.out.println("There are no jobs to display!");

            return;
        }

        int counter = 0;

        for (Job j : jobs) {
            System.out.println(++counter + ") " + j.getName());
        }
    }

    public static void computeSchedule() {
        if (jobs.size() == 0) {
            System.out.println("No jobs to create schedule!");

            return;
        }

        // sort jobs based on deadline (with the longest ones at the end)
        Collections.sort(jobs);

        // initialize a temp[] to hold the jobs



    }

    public static void showMenu() {
        System.out.println("***********************");
        System.out.println("Welcome to the Job Scheduler!");
        System.out.println("Please select from one of the options below");
        System.out.println("1) Add a job");
        System.out.println("2) Remove a job");
        System.out.println("3) Print out the current schedule");
        System.out.println("4) Exit");
        System.out.println("***********************");
    }
}
