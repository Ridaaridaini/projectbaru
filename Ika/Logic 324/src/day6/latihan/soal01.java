package day6.latihan;

import java.util.Scanner;

public class soal01 {
    public static void main(String[] args) {
        //"Diinputkan sebuah kalimat cetak per kata ke bawah.
        //Input :
        //Kalimat : dia jalan jalan berdua
        //output :
        //dia
        //jalan
        //jalan
        //berdua"

        Scanner scanner = new Scanner(System.in);
        System.out.print("input kalimat: ");
        String kalimat = scanner.nextLine();

        String output[] = kalimat.split(" ");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i]);

        }

    }
}
