package day4.latihan.loop;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        //"Buatlah program untuk mencetak pola berikut seperti pada contoh berikut.
        //
        //Input
        //Nama : Terminator
        //Quotes : Hello World!
        //Repeat : 3
        //
        //Output
        //Terminator say, Hello World!
        //Terminator say, Hello World!
        //Terminator say, Hello World!"



        Scanner scan = new Scanner(System.in);

        System.out.print("masukan nama: ");
        String nama = scan.nextLine();

        System.out.print("masukan quotes: ");
        String quotes = scan.nextLine();

        System.out.print("masukan perulangan: ");
        int repeat = scan.nextInt();

        scan.close();

        System.out.println();

        for (int i = 0; i < repeat; i++) {
            System.out.println(nama + " say, " + quotes);

        }
    }
}
