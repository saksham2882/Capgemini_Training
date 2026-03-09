package overriding_concept;

public class Animal {
    public void eat(){
        System.out.println("Animal Class");
    }
}


class Dog extends Animal {
    public void eat(){
        System.out.println("Dog Class");
    }

    public void bark(){
        System.out.println("Dog Bark");
    }
}


class Cat extends Animal {
    public void eat(){
        System.out.println("Cat Class");
    }

    public void meow(){
        System.out.println("Cat Meow");
    }
}


class Main {
    public static void main(String[] args) {

//        Question 1:
//        Dog d = new Dog();
//        d.eat();
//
//        ((Animal)d).eat();


//        Question 2:
//        Animal arr[] = {new Animal(), new Dog(), new Cat()};
//
//        for (Animal obj : arr) {
//            obj.eat();
//
//            if(obj instanceof Dog){
//                ((Dog)obj).bark();
//            }
//
//            if(obj instanceof Cat){
//                ((Cat)obj).meow();
//            }
//        }


//        Question 3:
//        Animal animal = new Animal();
//        animal.eat();
//        ((Dog)animal).bark();
    }
}