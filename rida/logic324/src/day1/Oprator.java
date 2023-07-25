package day1;

public class Oprator {
    public static void main(String[] args) {
        //bilangan bulat (+ -* / %)
        int a = 13 +2 -5 *9 /2;
        System.out.println(a);
        int hasil1 =3%2;
        int hasil2 =15%6;

        //bilangan desimal ( + - * /%)
        double b= 1.1 +3.2 *1 / 3.1;
        System.out.println(b);
        //pembulatan angka di belakang koma
        System.out.printf("%.3f",b);
        System.out.println();
        //boolean (&& || !)
        boolean boA = true || false;
        boolean boB = true&& false ||true;
        boolean boC = !((true || false) && false);
        //string (+)
        System.out.println("aku "+ "karo " + "koe ");
        //tambahan
        //string + integer
        //"Hey" + 123 = "Hey123"
        //int/int
        //3/2=2
        //int/ double atau double/int
        //3.0/2 = 2.5
        //3 /2.0 = 2.5


    }
}
