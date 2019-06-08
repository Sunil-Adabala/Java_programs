public class Main {
    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("White roll","Steak",99.9,"basic");
        hamburger.addition1("tomato",15);
        hamburger.setAddition2Name("cheese",25);
        hamburger.setAddition3Name("lettuce",10);
        System.out.println("total price is"+hamburger.orderHamBurger());

        HealthyBurger healthyBurger=new HealthyBurger("Fish",150);
        healthyBurger.HealthyBurgerAddition1("caps",40);
        healthyBurger.HealthyBurgerAddition2("onions",50);
        System.out.println("total price is  "+healthyBurger.orderHamBurger());


    }
}





















