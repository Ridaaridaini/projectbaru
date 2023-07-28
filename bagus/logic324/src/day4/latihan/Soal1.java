package day4.latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama: ");
        String input = scan.nextLine();


        System.out.print("Quotes: ");
        String quotes = scan.nextLine();

        System.out.print("Repeat: ");
        int repeat = scan.nextInt();

        for(int i=0; i<repeat; i++){
            System.out.println(input+ " say, " + quotes);
        }



    }
}
