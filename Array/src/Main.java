import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortedIntergers(myIntegers);
        printIntegers(sorted);
    }

    public static int[] getIntegers(int number){

        int[] values = new int[number];
        System.out.println("Enter "+number+" array elements");
        for (int i=0; i<values.length; i++) {
        values[i] = scanner.nextInt();
        }
       // System.out.println("yoo");
    return values;
    }


    public static void printIntegers(int[] values){
        for (int i = 0; i< values.length; i++) {
            //System.out.println("print");
        System.out.println("value of " +i + " element is  " + values[i]);
        }
    }

    public static int[] sortedIntergers(int[] values) {
        //System.out.println("hey");
        int[] sortedArray = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            sortedArray[i] = values[i];
            System.out.println("haha");
        }
        boolean flag = true;
        int temp;
        while (flag) {
            flag=false;
        for (int i = 0; i < sortedArray.length-1;i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}


