package day1.Latihan;

import java.util.Scanner;

public class Soal14 {
    public static void main(String[] args) {
        //Mbah Jambrong punya beberapa uang pecahan sepuluh ribu, lima ribu dan dua puluh ribu.
        //Hitunglah total uang yang dimiliki jambrong, jika setiap pecahan uang tersebut adalah inputan user.


        Scanner input = new Scanner(System.in);
        System.out.print("masukan jumlah pecahan uang Rp5000 : ");
        long uang1 = input.nextLong();

        System.out.print("masukan jumlah pecahan uang Rp10000: ");
        long uang2 = input.nextLong();

        System.out.print("masukan jumlah pecahan uang Rp20000: ");
        long uang3 = input.nextLong();

        long jumlahUang = 5000*uang1 + 10000*uang2 + 20000*uang3;
        System.out.println();

        input.close();

        System.out.println("jumlah uang yang dimiliki oleh mbah Jamrong adalah " + jumlahUang);



    }
}
