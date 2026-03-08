package collections.sorting.comparator;

public class Job{
    String title;
    int priority;
    double salary;

    public Job(String title, int priority, double salary){
        this.title = title;
        this.priority = priority;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return title + " | priority: " + priority + " | salary: " + salary;
    }
}