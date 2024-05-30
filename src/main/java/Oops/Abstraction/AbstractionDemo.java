package Oops.Abstraction;

//the process of hiding the complex implementation details of a system or component and exposing only the
//        essential features or behaviors to the outside world.
//or
//the process of displaying the things which are required and hiding the things which are not required is called
//        abstraction

//Abstract method does not contain any logic
//Abstract class are the class contain abstract method and class prefix with abstract

//Concrete methods are which contains logic body
// Concrete class are which contains concrete method

 abstract class Insta{
     abstract public void login();

 }

 class Instagram extends Insta{
     public  void login(){
         System.out.println("insta/instagram");
     }
 }

public class AbstractionDemo {
    public static void main(String[] args) {

         Insta in =new Instagram();
         in.login();

    }
}
//This demonstrates the concept of abstraction where Insta defines the login()
// method signature, and Instagram provides the specific implementation of that method.
