package collections.sorting.comparator;

import java.util.Comparator;

public class PriorityComparator implements Comparator<Job> {
    @Override
    public int compare(Job job1, Job job2) {
        return Integer.compare(job1.priority, job2.priority);
    }
}