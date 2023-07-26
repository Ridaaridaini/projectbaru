package day1;

public class Operator {

    public static void main(String[] args) {

        //Bilangan Bulat (+ - * % )

        int hasil = 15 % 6; // hasil sisa baginya 3

        //Bilangan desimal ( = - * % )
        double b = 1.1 + 3.2 * 1 / 3.1;
        System.out.println(b);

        System.out.printf("%.3f",b);
        System.out.println();
        //Boolean (&& || !)

        boolean bolA = true || false; // true
        boolean bolB = true && false || true; // true
        boolean bolC = !(true || false && false); //false
        boolean bolD = !((true || false) && false); //true
        System.out.println(bolA + " " + bolB);


        //string (+)
        System.out.println("aku " + "karo " + "koe");

        // tambahan
        //string +string
        //" hey +123 = "hey123";

        //int /int
        // 5/2 = 2

        //int /double atau double / int = untuk hasil bilangan ada dibelakang koma
        // 5.0 / 2 = 2.5

    }
}
