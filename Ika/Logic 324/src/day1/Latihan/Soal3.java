package day1.Latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        //latihan mengimput nama, umur, motoo hidup dengan menggunakan Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String Nama = input.nextLine();

        System.out.print("Umur: ");
        int Umur  = input.nextInt();

        input.nextLine();
        System.out.print("Motto Hidup: ");
        String mottoHidup = input.nextLine();

        input.close();
        System.out.println(Nama);
        System.out.println(Umur);
        System.out.println(mottoHidup);

    }
}
