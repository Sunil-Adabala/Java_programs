import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8801 343595");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action : (6 to show available actions");
            int action = scanner.nextInt();
            switch(action){
                case 0 :
                    System.out.println(" \n shutting down....");
                    quit = true;
                    break;
                case 1 :
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){

//        System.out.println("Enter phone number - ");
//        String phone = scanner.nextLine();
//        System.out.println("Enter new contact name - \n" );
//        String name = scanner.nextLine();
        System.out.println("Enter new contact name - \n");
        String name = scanner.nextLine();
        String nname =scanner.nextLine();
        System.out.println("Enter phone number\n");
        String phoneNumber = scanner.nextLine();

        Contact newContact = Contact.createContact(nname,phoneNumber);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("new contact added "+nname+"--phone: "+phoneNumber);
        }
        else {
            System.out.println("cannot add, contact "+nname+" already exists");
        }

    }

    private static void updateContact(){
        System.out.println("enter the contact name which u want to update");
        String name = scanner.nextLine();
        System.out.println("new contact name");
        Contact existingRecord =mobilePhone.queryContact(name);
        if(existingRecord==null){
            System.out.println("contact not found");
            return;
        }
        System.out.println("enter new contact name--");
        String newName = scanner.nextLine();
        System.out.println("enteere new contact number -- ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingRecord,newContact)){
            System.out.println("succefully updated record");
        }
        else{
            System.out.println("Error!!!!!!!");
        }
    }

    private static void removeContact(){
        System.out.println("enter the contact name which u want to update");
        String name = scanner.nextLine();
        System.out.println("new contact name");
        Contact existingRecord =mobilePhone.queryContact(name);
        if(existingRecord==null){
            System.out.println("contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingRecord)){
            System.out.println("successfully deleted");
            return;
        }else{
            System.out.println("error");
        }

    }

    private static void queryContact() {
        System.out.println("enter the contact name which u want to update");
        String name = scanner.nextLine();
        System.out.println("new contact name");
        Contact existingRecord = mobilePhone.queryContact(name);
        if (existingRecord == null) {
            System.out.println("contact not found");
            return;
        }
        System.out.println("name  " + existingRecord.getName() + "phone numberi is" + existingRecord);
        return;
    }


    private static void startPhone(){
        System.out.println("Starting phone....");
    }
    private static void printActions() {
        System.out.println("\n available actions\npress");
        System.out.println("0 - shutdown\n" +
                "1 - to print contacts\n" + "2 - to add a new contact\n" +
                "3 - to update existing contact\n" +
                "4- to remove a existing contact\n" +
                "5 - query if an exiting contact exits\n" +
                "6 - to print a list of available actons\n");
        //System.out.println("Choose ur action : ");
    }
}
