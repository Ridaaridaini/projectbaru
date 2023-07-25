package day1.Latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukan uang pecahan pertama: ");
        long uang1 = input.nextLong();

        System.out.print("masukan uang pecahan kedua: ");
        long uang2 = input.nextLong();

        System.out.print("masukan uang pecahan ketiga: ");
        long uang3 = input.nextLong();

        long jumlahUang = uang1 + uang2 + uang3;
        System.out.println();

        input.close();

        System.out.println("jumlah uang yang dimiliki oleh mbah Jamrong adalah " + jumlahUang);



    }
}
