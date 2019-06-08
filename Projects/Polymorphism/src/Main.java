class Car{
    private Boolean engine;
    private String cylinders;
    private int wheels;

    public Car(Boolean engine, String cylinders, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

Ā



    public String startEngine(){
        return "Engine has been started";
    }

    public String accelerate(){
        return "accelerated";

    }

    public String brake(){
        return "brake applied";
    }
}

class Porche extends Car{
    public Porche(){
        super(true,"BS-4",4);
    }

    @Override
    public String startEngine() {
        return "Porche engine started";
    }

    @Override
    public String accelerate() {
        return "porche accelrated";
    }

    @Override
    public String brake() {
        return "porche brake applied";
    }

}

class Lambo extends Car{
    public Lambo(){
        super(true,"Bs-8",4);
    }

    @Override
    public String startEngine() {
        return "lamborghini started";

    }
}

class Royce extends Car{
    public Royce(){
        super(true,"bs-6,",6);
    }

    @Override
    public String accelerate() {
        return "Accelarated Royce";
    }

    @Override
    public String brake() {
        return "royce brake applied" ;
    }
}

public class Main {
    public static void main(String[] args) {



    }

    public static Car randomCar(){
        int randomNumeber = (int)(Math.random()*10)+1;
        System.out.println("random number generated is"+randomNumeber);
        switch (randomNumeber){
            case 1: return new Porche();

            case 2 : return  new Lambo();

            case 3: return new Royce();

        }
        return null;

    }
}
