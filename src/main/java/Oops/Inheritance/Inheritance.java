package Oops.Inheritance;


//The process of the child class acquiring all the states and behaviour from parent class is known as inheritance
//Child class is also known as subclass or derived class and parent class is also known as super class or base class

class Father{
     int FatherMoney = 5000;
    public void FatherBehaviour(){
        System.out.println("Father Style Also Son Style");
    }

}
class Son extends Father{

}

public class Inheritance {
    public static void main(String[] args) {
        Son ref = new Son();
        System.out.println("Father Money also son money " + ref.FatherMoney);
        ref.FatherBehaviour();

        P2 ref1 = new P2 ();
        System.out.println(ref1.i);
    }
}

//How to achieve inheritance
//With the help of extends Keywords //With the help of implements keyword

//With the help of extends keyword we can inherit only one class we cannot inherit more than one class
//We can inherit static members

//Even oops is non-static we can use static keyword

//Inheritance
class P1 {
    static {
        System.out.println("sib superclass"); //executed first
    }
}
class P2 extends P1 {
    static  int i = 10 ; //executed third
    static {

        System.out.println("sib subclass"); //executed second
    }
}

//Types of Inheritance
//1.Single level Inheritance (Inheritance of only one level(one parent one child) is known as Single level Inheritance)
//2.Multi level Inheritance (Inheritance of multi level is known as Multilevel Inheritance)
//3.Hierarchical Inheritance (Super class is having more than one subclass at same level)
//4.Multiple Inheritance(Subclass is having more than one super class)
//5.Hybrid Inheritance()

//Does java support multiple inheritance
//Yes java support multiple inheritance with class it is not possible but with help of interface it is possible

//Diamond Problem?
//The confusion arises in multiple inheritance is called as diamond problem
//reason for this : confusion with respect to class loading process and object loading process





