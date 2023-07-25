package day1;

public class Operator {
    public static void main(String[] args) {
        //bilangan bulat(+ - * / %)
        int a = 13 + 2 -5 * 9 / 2;
        System.out.println(a);
        //bilangan desimal (+ - * / %)
        double b = 1.1 + 3.2 * 1/3.1;
        System.out.printf("%.2f", b);
        System.out.println();
        // boolean (&& || !)
        boolean bolA = true || false;//true
        boolean bolB = true && false || true;//true
        boolean bolC = !(true || false && false);//false
        boolean bolD = !((true || false) && false);//true
        // String (+)
        System.out.println("Aku "+ "karo "+"koe");
        //tambahan
        //String + Integer
        //"hey" + 123 = "Hey123"

        //int/int
        // 5/2 = 2;
        // float a= 5/2

        // int/double atau double / int
        // 5.0 /2 = 2.5
        // 5/2.0 = 2.5
        // 5/2f = 2.5

        System.out.println(5.0/2);
    }
}
