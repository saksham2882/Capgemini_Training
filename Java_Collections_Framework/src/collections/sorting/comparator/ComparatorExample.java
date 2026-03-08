package collections.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
    public static void main(String[] args) {

        ArrayList<Job> jobs = new ArrayList<Job>();
        jobs.add(new Job("Job 1", 3, 500.00));
        jobs.add(new Job("Job 2", 1, 200.00));
        jobs.add(new Job("Job 3", 2, 800.00));

        System.out.println("Before sorting:");
        for (Job job : jobs) {
            System.out.println(job.priority + " | " + job.salary);
        }

        Collections.sort(jobs, new PriorityComparator());

        System.out.println("After sorting:");
        for (Job job : jobs) {
            System.out.println(job.priority + " | " + job.salary);
        }
    }
}