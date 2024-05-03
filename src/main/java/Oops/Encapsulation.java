package Oops;


//Encapsulation
//The process of binding states and behaviour of an object is known as encapsulation

// Class is used to achieve encapsulation

 class Atm {
 int  money = 85000; //state is data
 public void withdraw(){ // behaviour is method
     System.out.println("withdraw money ");
 }

 }
public class Encapsulation {
    public static void main(String[] args) {
//     Atm ref  = new Atm();
//        System.out.println("total amt " + ref.money);
//        ref.withdraw();

        //imp code
        Atmm refr = new Atmm();
        System.out.println("total amt " + refr.getMoney());
        refr.setMoney(1000);
        refr.withdraw();
        System.out.println("updated amt " + refr.getMoney());

    }
}

//Why do we need Encapsulation ?
//-> In order to achieve data hiding we used encapsulation.

//What is Data hiding?
//-> The process of avoiding direct access but providing controlled access is data hiding.

//How to achieve data Hiding?
//With the help of private access specifier we can achive data hiding

//Steps to achieve data hiding.
//step1. all the data member should be private
//step2. to access the private data getter() method should be created.
//step3. to set or modify the data we need to create setter() method.



class Atmm { //actual code

     private int money = 50000; //data
     public void withdraw(){
         System.out.println("you can withdraw your money ");
     }
     public int getMoney(){
         return money;
     }
     public void setMoney( int money){
         this.money=money;
     }

}

