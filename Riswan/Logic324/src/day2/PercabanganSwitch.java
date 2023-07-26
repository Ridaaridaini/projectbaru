package day2;

import java.util.Scanner;

public class PercabanganSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai A : ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1 :
                System.out.println("cetak 1");
                break;
            case 2 :
                System.out.println("Cetak 2");
                break;
            default:
                System.out.println("input anda salah");
                break;
        }
    }
}
