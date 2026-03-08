package collections.sorting.comparable;

public class Job implements Comparable<Job> {

    String title;
    int priority;
    double salary;

    Job(String title, int priority, double salary) {
        this.title = title;
        this.priority = priority;
        this.salary = salary;
    }

    // Natural sorting using Comparable
    @Override
    public int compareTo(Job other) {
        // Sorting based on job title
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title + " | priority: " + priority + " | salary: " + salary;
    }
}