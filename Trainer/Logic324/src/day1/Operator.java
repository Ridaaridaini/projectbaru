package day1;

public class Operator {

    public static void main(String[] args) {
        //Bilangan bulat (+ - * / %)
        int a = 13 + 2 - 5 * 9 / 2;
        System.out.println(a);

        int hasil1 = 3 % 2; // hasilnya 1
        int hasil2 = 15 % 6; // hasilnya 3

        //Bilangan desimal (+ - * / %)
        double b = 1.1 + 3.2 * 1 / 3.1;
        System.out.println(b);

        //Membulatkan 2 angka dibelakang koma
        System.out.printf("%.3f",b);
        System.out.println();

        //Boolean (&& || !)
        boolean bolA = true || false; //true
        boolean bolB = true && false || true; //true
        boolean bolC = !(true || false && false); //false
        boolean bolD = !((true || false) && false); //true
        System.out.println(bolA + " " + bolB);

        //String (+)
        System.out.println("Aku " + "karo " + "koe");

        //Tambahan
        //String + Integer
        //"Hey" + 123 = "Hey123";

        //int / int
        // 5 / 2 = 2
        // float a = 5 / 2

        // int / double atau double / int
        // 5.0 / 2 = 2.5
        // 5 / 2.0 = 2.5


    }
}
