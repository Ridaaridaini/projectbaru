package day6.latihan;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata pertama: ");
        String[] inputString = scanner.nextLine().toLowerCase().split("");

        System.out.print("Masukkan kata pertama: ");
        String inputString2 = scanner.nextLine().toLowerCase();

        boolean sameChar = false;
        for (int i = 0; i < inputString.length; i++) {
            if(inputString2.contains(inputString[i])){
                sameChar = true;
            }
        }

        if(sameChar){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
