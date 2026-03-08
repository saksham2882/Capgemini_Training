package collections.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Job> jobs = new ArrayList<>();

        jobs.add(new Job("Developer", 2, 60000));
        jobs.add(new Job("Manager", 1, 90000));
        jobs.add(new Job("Tester", 3, 50000));
        jobs.add(new Job("Analyst", 4, 55000));

        System.out.println("Before Sorting:");
        for (Job j : jobs) {
            System.out.println(j);
        }

        // sorting using Comparable
        Collections.sort(jobs);

        System.out.println("\nAfter Sorting (by Title):");
        for (Job j : jobs) {
            System.out.println(j);
        }
    }
}