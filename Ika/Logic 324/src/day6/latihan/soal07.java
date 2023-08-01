package day6.latihan;

import java.util.Scanner;

public class soal07 {
    public static void main(String[] args) {
        //"Hitung karakter unik!
        //Input Sembarang teks kalimat
        //          Contoh : Halo Apa Kabarmu?
        //Output Hitung jumlah karakter uniknya (selain spasi)
        //halopkbrmu?
        //11 karakter"

        Scanner scanner = new Scanner(System.in);
        System.out.print("input teks: ");
        String input = scanner.nextLine();

        String a =input.toLowerCase();
        String[] output=a.replace(" ","").split("");

        String j="";//halo
        for (int i = 0; i < output.length; i++) {//i=0 1  4
            if( !j.contains(output[i]) ){
                j= j+ output[i];
            }

        }

        System.out.println("panjang karakter unik "+j.length());

    }
}
