package day1;

public class Operator {
    public static void main(String[] args) {
        // bilangan bulat (+ - * /  %)
        int a= 13+2-5*9/2;
        System.out.println(a);

        int hasil1 = 3%2;
        int hasil2 = 15%6;

        // bilangan desimal (+ - : * %)
        double b= 1.1 +2.2 + 1 /3.1;
        System.out.println(b);

        //membulatkan 2 angka dibelakang koma
        System.out.printf("%.2f \n",b);

        // boolean (&& || negasi(!))
        boolean bolA = true || false; // true
        boolean bolB = true && false || true; //true
        boolean bolC = !(true || false && false); //(didahulukan yang && baru ke ||) false
        boolean bolC1 = !((true || false) && false); // true
        System.out.println(bolA + " " + bolB);

        // String (+)
        System.out.println("aku " + "karo " + "kowe");

        //Tambahan
        //String + integer
        // "hey" +123 = "hey123"  --> jadi String (semua yang dioperasikan dengan string akan menjadi string)

        //int /int misal = 5/2 = 2 --> diambil floornya/dikebawahkan
        // int / double || double/int
        // 5.0 /2 = 2.5 --> jika mau ada hasil yang pecahan salah satu diubah menjadi double atau menjadi float
        // 5/ 2.0

        //contoh
        int e = 5;
        double d= 2.0;
        float f= 2f;
        System.out.println(e/d);
        System.out.println(e/f);




    }
}
