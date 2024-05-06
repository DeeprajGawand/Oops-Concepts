package Oops.Polymorphism;
//example of compile time polymorphism
//Class having more than one method with same name but different formal argument
public class MethodOverloading
{
 static void display(int num){
    System.out.println("display num"+ num);
}
static void display (double num){
    System.out.println("display num"+ num);
}
static void display(String str1, String str2) {
        System.out.println("Displaying strings: " + str1 + " and " + str2);
 }

    public static void main(String[] args) {
        System.out.println("hello");
        display(10);
        display(10);
        display("dsasa", "sdad");
    }
}
