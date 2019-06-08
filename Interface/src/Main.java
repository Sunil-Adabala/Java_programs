import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("sunil",100,99);
        System.out.println(player1.toString());
        saveObject(player1);
        player1.setHitpoints(95);
        System.out.println(player1);
        player1.setWeapon("Blaster");
        saveObject(player1);
        loadObject(player1);
        System.out.println(player1);

        Monster seamonster = new Monster("Hydra",88,80);
        System.out.println(seamonster.toString());
        saveObject(seamonster);
        seamonster.setHitPoints(65);
        saveObject(seamonster);
        loadObject(seamonster);
        saveObject(seamonster);


    }
    public static ArrayList<String> readvalues(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("1.To quit\n"+"2.To enter into record\n"+"3.to print values");
        while(!quit){
            System.out.println("Choose an option");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    quit = true;
                    break;
                case 2:
                    System.out.println("Enter a string");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
                case 3:
                    System.out.println("printing values entered");
                    for(int i = 0;i<values.size();i++){
                        System.out.println(values.get(i));
                    }


            }
        }
        return values;
    }

    public static void saveObject(Saveable objectToSave){
        for(int i=0;i<objectToSave.write().size();i++){
            System.out.println("saving,  "+objectToSave.write().get(i)+"  as saved device");
        }
    }
    public static void loadObject(Saveable objectToSave){
        ArrayList<String> values = readvalues();

    }
}


