package day1.latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        input.nextInt();

        input.nextLine();

        System.out.print("Motohidup: ");
        String Motohidup = input.nextLine();

        input.close();
    }
}
