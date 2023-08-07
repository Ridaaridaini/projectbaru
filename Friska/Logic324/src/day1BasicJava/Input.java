package day1BasicJava;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //instansiasi
        Scanner input = new Scanner(System.in);
        System.out.print("Nama :");
        String nama = input.nextLine();

        System.out.print("Umur:");
        int umur = input.nextInt();

        System.out.print("Alamat :");
        String alamat = input.nextLine();

        input.close();
        System.out.println(nama);
        System.out.println(umur);
        System.out.println(umur);

    }
}
