package latihan;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama:");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur:");
        int umur = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan Motto Hidup: ");
        String motto = input.nextLine();

        input.close();

        System.out.println("============================");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Motto Hidup: " + motto);
        System.out.println("============================");
    }
}
