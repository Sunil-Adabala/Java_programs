import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Bank obj=new Bank();
        boolean quit=false;

        while(!quit) {
        System.out.println("1.deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Exit");
        System.out.println("Ur choicw?");
        int ch=scanner.nextInt();
            switch (ch) {
                case 1:
                    obj.deposit();
                    break;
                case 2:
                    obj.withdraw();
                    break;
                case 3: quit=true;
                    break;

            }
        }


    }
}
