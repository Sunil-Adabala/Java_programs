public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5,5);
        Complex c2 = new Complex(1,1);
        Complex c = new Complex();
        Complex e = c.addComplex(c1,c2);
        System.out.println("result = "+c.real+"+i"+c.img);
    }
}
