package day1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("umur : ");
        int umur = input.nextInt();
        input.close();
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
    }
}
