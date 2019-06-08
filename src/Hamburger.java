public class Hamburger {
   public String breadType;
   public String meat;
   public double price;
   public String name;

   private String addition1Name;
   private double addition1price;
   private String addition2Name;
   private double addition2Price;
   private String addition3Name;
   private double addition3Price;
   private String addition4Name;
   private double addition4Price;




    public Hamburger(String breadType, String meat, double price, String name) {
        this.breadType = breadType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void addition1(String addition1Name,double addition1price){
        this.addition1Name=name;
        this.addition1price=price;
    }

    public void setAddition2Name(String addition2Name,double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void setAddition3Name(String addition3name,double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void setAddition4Name(String addition4name,double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double orderHamBurger(){
        double hamburgerPrice=this.price;
        System.out.println(this.name+"    on a "+this.breadType+"  with   "+this.meat+",price is   "+hamburgerPrice);
        if(addition1Name!= null){
            hamburgerPrice += this.addition1price;
            System.out.println("added"+"\t"+this.addition1Name+"  for an extra"+"\t"+this.addition1price);
        }
        if(addition2Name!=null){
            hamburgerPrice += this.addition2Price;
            System.out.println("added"+"\t"+this.addition2Name+"  for an extra"+"\t"+this.addition1price);
        }

        if(addition3Name!=null){
            hamburgerPrice+=addition3Price;
            System.out.println("added"+"\t"+this.addition3Name+"  for an extra"+"\t"+this.addition3Price);
        }

        if(addition4Name!=null){
            hamburgerPrice += this.addition4Price;
            System.out.println("added"+"\t"+this.addition4Name+"  for an extra"+"\t"+this.addition4Price);
        }
        return hamburgerPrice;
    }


}



