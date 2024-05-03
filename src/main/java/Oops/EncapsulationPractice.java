package Oops;
//practice here

class Attm {
    private int money =5000;
    public void withdraw(){
        System.out.println("this is your amount ");
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money=money;
    }
}
public class EncapsulationPractice {
    public static void main(String[] args) {
        Attm ref = new Attm();
        System.out.println("this is my money "+ ref.getMoney());
        ref.withdraw();
        ref.setMoney(1000);
        System.out.println("this is my updated money "+ ref.getMoney());
    }
}
