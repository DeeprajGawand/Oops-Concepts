package Oops.Polymorphism;


//An ability of an object to execute more than one form is known as ploymorphism or same nambut different behaviour
//Types of polymorphism
//1. Compile time polymorphism(binding happens during compile time
//        ex 1. constructor overloading
//        2.variable shadowing
//        3. Method shadowing
//        4. Method OverLoading)



//2. Run time ploymorphism(binding happens during runtime
//        1.Method Overriding )

//1. Variable shadowing
//Subclass and Superclass is having static or non-static variable with same name is known as variable shadowing
class p1{
    int i = 10;
}
class p2 extends p1{
    int i = 20;
}

//METHOD SHADOWING
//Subclass and superclass having static method with same name and same formal argument is known as method shadowing

class m1{
   public static void test(){
       System.out.println("super-class test");
   }

}
class m2 extends m1{
    public static void test(){
        System.out.println("sub-class test");
    }
}


public class Ploymorphism {
    public static void main(String[] args) {
        p1 ref = new p1();
        System.out.println("i =" + ref.i);

        p2 ref1 = new p2();
        System.out.println("i =" + ref1.i);

        p1 ref3 = new p2();
        System.out.println("i ="+ ref3.i);

        m1 refm = new m1();
        refm.test();

        m2 refm2 = new m2();
        refm2.test();

        m1 refm3 = new m2();
        refm3.test();

    }
}

