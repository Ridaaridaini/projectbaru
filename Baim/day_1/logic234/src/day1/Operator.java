package day1;

public class Operator {
    public static void main(String[] args) {

        // Bilangan bulat (+ - * / %)
        int a = 3 - 1 + 2 * 4 / 2;
        System.out.println(a);

        int hasil1 = 3 % 2;
        System.out.println(hasil1);

        // Bilangan pecahan (+ - * / %)
        double b = 3.0 - 1.4 + 2.0 * 4.0 / 2.0;
        System.out.println(b);
        System.out.printf("%.2f\n", b);

        //Boolean (&& || !)
        boolean benar = true;
        boolean salah = false;

        boolean hasil2 = benar && salah;
        System.out.println(hasil2);

        boolean hasil3 = benar || salah;
        System.out.println(hasil3);

        boolean hasil4 = !benar;
        System.out.println(hasil4);

        boolean hasil5 = !(true || false && false);
        System.out.println(hasil5);

        // String (+)
        String c = "Hello" + " " + "world!";
        System.out.println(c);

        float d = 5f / 2;
        System.out.println(d);
    }
}
