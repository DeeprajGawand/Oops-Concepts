package Oops.Inheritance;


class Fatherr{
    int money = 10000;
    public void behaviour(){
        System.out.println("walking");
    }
}

class sonn extends Fatherr{
int mymoney = 1000;
}

public class InheritancePractice {
    public static void main(String[] args) {
        sonn ref1 = new sonn();
        System.out.println("father money also son money" + ref1.money );
        System.out.println("son money" + ref1.mymoney );
        ref1.behaviour();
    }
}
