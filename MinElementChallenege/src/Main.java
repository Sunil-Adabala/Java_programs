import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter capacity of array");
        int number=scanner.nextInt();
        scanner.nextLine();
        System.out.println("capacity is  "+number);
        int[] myarray = readIntegers(number);
        int minArray=findMin(myarray);
        System.out.println("min values is  "+minArray);

    }
    public static int[] readIntegers(int number){
        int[] array=new int[number];
        System.out.println("Enter "+array.length+" element(s)" );
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] myarray){
        int min=Integer.MAX_VALUE;
        int[] newarray=new int[myarray.length];
        for(int i=0;i<myarray.length;i++){
            newarray[i]=myarray[i];
           // System.out.println(+newarray[i]);
            int temp=newarray[i];
            if(temp<min){
                min=newarray[i];
            }
        }

        return min;
    }
}
