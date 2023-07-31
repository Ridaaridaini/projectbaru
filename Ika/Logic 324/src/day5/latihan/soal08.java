package day5.latihan;

import java.util.Scanner;

public class soal08 {
    public static void main(String[] args) {
        //"Buatlah deret angka yang terbentuk dari bilangan ganjil dan bilangan genap.
        //Angka pada index ganjil dari kedua deret bilangan tersebut saling dijumlahkan. Dan angka pada index dari
        //kedua deret bilangan tersebut juga saling dijumlahkan.
        //Index dimulai dari angka 0.
        //Input : Panjang array/panjang deret
        //Contoh : Dibawah ini hanya sekedar contoh yang menggunakan deret genap dan ganjil.
        //
        //Input Panjang deret : 5
        //Deret genap : 0 2 4 6 8
        //Deret ganjil : 1 3 5 7 9
        //0 + 1 ; 2 + 3 ; 4 + 5 ; 6 + 7 ; 8 + 9
        //
        //Output : 1, 5, 9, 13, 17"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int b = scanner.nextInt();
        int[] deret= new int[b];
        int genap=0;
        int ganjil =1;
        int genap1[] = new int[b];
        int ganjil1[] = new int[b];
        int jumlah;

        for (int i = 0; i < genap1.length; i++) {
            genap1[i] = genap;
            genap =genap+2;
            System.out.print(genap1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < ganjil1.length ; i++) {
            ganjil1[i]= ganjil;
            ganjil = ganjil+2;
            System.out.print(ganjil1[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < deret.length; i++) {
            jumlah= genap1[i] + ganjil1[i];
            System.out.print( jumlah + ", ");
        }

    }
}
