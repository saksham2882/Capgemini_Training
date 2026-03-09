package inheritance_example;

public class Main {
    public static void main(String[] args) {

        Cat obj = new Cat();

//        System.out.println(obj instanceof Animal);     // true
//        System.out.println(obj instanceof Dog);        // java: incompatible types: OverriddingConcept.Cat cannot be converted to OverriddingConcept.Dog

//        System.out.println(obj instanceof Car);

        System.out.println(obj instanceof Sizeable);     // interface -> no error because interface is 100% reusable
    }
}