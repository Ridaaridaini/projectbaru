package day1BasicJava;

public class Operator {
    public static void main(String[] args) {
        //Bilangan bulat
        int  a = 13 + 2 - 4 / 2;
        System.out.println(a);

        int hasil = 3 % 2;

        //Bilangan Desimal
        double b = 1.1 + 3.2 * 1/3.1;
        System.out.println(b);
        System.out.printf("%.2f",b);
        System.out.println();

        //Boolean
        boolean bolA = true|| false;
        boolean bolB = true && false|| true;
        boolean bolC = !(true || false && false);
        boolean bolD =!((true || false )&& false);

        //String
        System.out.println("Aku"+" Karo"+" Koe");

        //Tambahan
        //String + integer
        //"Hey" + 123 = "Hey123"

        //int/int
        // 5/2 = 2
        //float = 5/2

        //int / double atau double / int
        //5.0 / 2 = 2.5
        //5 /2.0 = 2.5
        //
    }
}
