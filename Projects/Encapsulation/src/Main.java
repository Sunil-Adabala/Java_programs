public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(40,true);
        System.out.println("initial page count is "+p.getPagesPrinted());
        int pagesPrinted =  p.printPages(4);
        System.out.println("page printed was"+pagesPrinted+"pages printed is"+p.getPagesPrinted());
    }
}
