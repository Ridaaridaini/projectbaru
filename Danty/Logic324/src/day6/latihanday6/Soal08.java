package day6.latihanday6;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Kalimat : ");
        String kalimat = input.nextLine();

        //Di Uppercase
        kalimat = kalimat.toUpperCase();

        //Split berdasarkan Spasi
        String[] arrK = kalimat.split(" ");

        //Mengambil Karakter Awal untuk inputan
        //char huruf1 = arrK[0].charAt(0);
        //System.out.println(huruf1);


        //Mengambil Karakter terakhir dengan huruf kecil untuk inputan
        //char huruf2 = arrK[0].toLowerCase().charAt(arrK[0].length()-1);
        //ini karena karakter terakhir berada dalam indeks (panjang string-1)
        //System.out.println(huruf2);

        //Membuat Perulangan
        for (int i = 0; i < arrK.length; i++) {
            char huruf1 = arrK[i].charAt(0);
            System.out.print(huruf1);

            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            char huruf2 = arrK[i].toLowerCase().charAt(arrK[i].length()-1);
            System.out.print(huruf2 + " ");
        }




    }
}
