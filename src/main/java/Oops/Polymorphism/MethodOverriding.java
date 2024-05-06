package Oops.Polymorphism;
//example of runtime polymorphism
//Subclass method override super class method is call methodoverriding

class Animal{
    void makeSound(){
        System.out.println("animal makes sound");
    }
}
class Dog extends Animal  {

    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal ref = new Animal();
        Dog dog = new Dog();

        ref.makeSound();
        dog.makeSound();
    }

}
