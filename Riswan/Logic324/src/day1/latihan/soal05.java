package day1.latihan;

import java.util.Scanner;

public class soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai X : ");
        int X = input.nextInt();
        System.out.print("Nilai Y : ");
        int Y = input.nextInt();
        int HasilX = X % Y;
        int HasilY = Y % X;

        System.out.println("Hasil bagi X : " + HasilX);
        System.out.println("Hasil bagi Y : " + HasilY);
    }
}
