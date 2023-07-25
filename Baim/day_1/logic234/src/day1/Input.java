package day1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Instansiasi
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.println("nama anda:" + nama);

        input.close();
    }
}
