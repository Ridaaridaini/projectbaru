package day6.latihan;

import java.util.Scanner;

public class soal02 {
    public static void main(String[] args) {

        //"Diinputkan sebuah kalimat cetak per karakter ke bawah (selain spasi)
        //Input :
        //Kalimat : aku koe
        //output :
        //a
        //k
        //u
        //k
        //o
        //e"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        String[] output = kalimat.replace(" ","").split("");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}
