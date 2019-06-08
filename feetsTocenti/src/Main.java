public class Main {
    public static void main(String args[]){
        double feet=6;
        double inches=0;
        double centimeters=calcFeetAndInchesToCentimeters(feet,inches);
        System.out.println("centimeters "+centimeters);
        double feet1=calcFeetAndInchesToCentimeters(8);
        System.out.println("feet "+feet1);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if(feet>=0 && (inches>=0 && inches<=12)){
            double inches1=feet*12;
            inches=inches+inches1;
            return inches*2.54;

        }
        else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = 20;
            feet = feet*12;
            return feet+inches;

        } else {
            return -1;
        }
    }
}
