package CollectionsExample;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public int hashCode(){
        System.out.println("hashCode method called");
        return name.length();      // our hashcode() - check hashcode using the length
    }

    public boolean equals(Object obj){
        System.out.println("equals method called");
        if(obj instanceof Employee && this.name == ((Employee)obj).name){
            return true;
        }
        else {
            return false;
        }
    }
}