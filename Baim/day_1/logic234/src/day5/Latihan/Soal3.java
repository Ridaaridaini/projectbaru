package day5.Latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrA = {3, 2, 1, 5, 8};

        System.out.println("Nilai yang dicari: ");
        int nilai = scanner.nextInt();

        for (int i = 0; i < arrA.length; i++) {
            if(i == arrA.length - 1){
                System.out.print("dan " + i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
