public class Complex {
    public int real ;
    public int img;

    public Complex(){

    }

    public Complex(int real, int img) {

        this.real = real;
        this.img = img;
    }

   public Complex addComplex(Complex c1,Complex c2 ){
       Complex csum = new Complex();
       csum.real=real=c1.real+c2.real;
       csum.img =(c1.real)+c1.img+c2.img;
       return csum;


   }
}
