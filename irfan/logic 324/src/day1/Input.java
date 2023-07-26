package day1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        int a=10;
        //Instansiasi
        Scanner input = new Scanner(System.in);

        System.out.print("nama: ");
        String nama = input.nextLine();

        System.out.print("Umur: ");
        input.nextLine();

        input.close();

        System.out.println(nama);
    }
}
