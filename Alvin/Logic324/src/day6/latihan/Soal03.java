package day6.latihan;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nama: ");
        String myName = scanner.nextLine();

        String[] strSplit = myName.split(" ");

        for (int i = 0; i < strSplit.length; i++) {

            char x = strSplit[i].charAt(0);

            String nickName = "";

            nickName += x;

            nickName = nickName.toUpperCase();

            System.out.print(nickName);
        }

    }

}
