package day1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //instansiasi
        Scanner input = new Scanner(System.in); //input nnt disebut sebagai objek bukan fungsi lagi
        System.out.print("Nama: ");
        String Nama = input.nextLine();// nextLine untuk String

        System.out.print("Umur: ");
        int Umur = input.nextInt(); // nextInt untuk Intiger


        input.close();
        System.out.println(Nama);
        System.out.println(Umur);

    }

}
