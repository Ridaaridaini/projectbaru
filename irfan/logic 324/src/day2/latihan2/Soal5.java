package day2.latihan2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        int x;
        Scanner input = new Scanner(System.in);

        System.out.print("inputan x = ");
        x = input.nextInt();

        switch (x%7){
            case (1):
                System.out.println("Senin");
                break;
            case (2):
                System.out.println("Selasa");
                break;
            case (3):
                System.out.println("Rabu");
                break;
            case (4):
                System.out.println("Kamis");
                break;
            case (5):
                System.out.println("Jumat");
                break;
            case (6):
                System.out.println("Sabtu");
                break;
            case (7):
                System.out.println("Minggu");
                break;
            default:
                System.out.println("error");
        }
    }
}
