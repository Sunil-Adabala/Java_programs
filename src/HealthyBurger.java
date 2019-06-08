public class HealthyBurger extends Hamburger{
    private String HealthAddition1Name;
    private double HealthAddition1Price;

    private String HealthAddition2Name;
    private double HealthAddition2Price;


    public HealthyBurger(String meat, double price) {
        super("brown rye", meat, price, "Healthy");

    }

    public void HealthyBurgerAddition1(String name,double price){
        this.HealthAddition1Name=name;
        this.HealthAddition1Price=price;

    }

    public void HealthyBurgerAddition2(String name,double price){
        this.HealthAddition2Name=name;
        this.HealthAddition2Price=price;

    }

    @Override
    public double orderHamBurger() {
        double HealthyBurgerPrice=super.orderHamBurger();
        if(this.HealthAddition1Name!=null){
            HealthyBurgerPrice+=HealthAddition1Price;
            System.out.println("added  "+this.HealthAddition1Name+"  of price  "+this.HealthAddition1Price);
        }
        if(this.HealthAddition2Name!=null){
            HealthyBurgerPrice+=HealthAddition2Price;
            System.out.println("added  "+this.HealthAddition2Name+"  of price  "+this.HealthAddition2Price);
        }

        return HealthyBurgerPrice;
    }
}
