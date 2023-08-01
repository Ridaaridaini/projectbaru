package day6.latihan;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {
        String reverseWord = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("palindrom: ");
        String word = scanner.nextLine();

        String[] arrWord = word.split("");

        for (int i = (arrWord.length-1); i>=0 ; i--) {
            reverseWord = reverseWord + arrWord[i];
        }

        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println("kata palindrom");
        }else{
            System.out.println("bukan kata palindrom");
        }

    }

}
