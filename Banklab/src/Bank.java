import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    private double bal;
    private double amount;

    public Bank() {
        this.bal = 0;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(){
        System.out.println("Enter the amount to be deposited");
        amount=scanner.nextDouble();
        bal=bal+amount;
        System.out.println("you hav added  "+bal+"  rupees, available balance is "+getBal());

    }

    public void withdraw(){
        System.out.println("Enter amount to be withdrawn");
        amount=scanner.nextDouble();
        if(amount>bal){
            System.out.println("Sorry bro,teri aukat meh raho");
            System.out.println("you have total of"+getBal());
        }
        else {
            bal=bal-amount;
            System.out.println("withdrawn but stil u need to get a life");
            System.out.println("you hav withdrawn  "+amount+"  rupees, available balance is "+getBal());
        }
    }
}
