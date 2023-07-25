package day1.Latihan;

public class Soal15 {
    public static void main(String[] args) {
        /*
        125gr terigu, 100gr gula pasir, 100mL susu adalah resep untuk membuat 15 cupcake.
        Berapa takaran terigu, gula & susu untuk membuat sebanyak n cupcake?
        */

        int terigu, gulaPasir, susu;
        double cupcake;
        terigu = 125;
        gulaPasir = 100;
        susu= 100;
        cupcake = 15.0;

        System.out.printf("banyaknya tepung yang digunakan untuk membuat n buah cupcake adalah %.2f \n", terigu/cupcake);
        System.out.printf("banyaknya gula pasir yang digunakan untuk membuat n buah cupcake adalah %.2f\n", gulaPasir/cupcake);
        System.out.printf("banyaknya susu yang digunakan untuk membuat n buah cupcake adalah %.2f", susu/cupcake);


    }
}
