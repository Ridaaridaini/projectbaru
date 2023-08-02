package day6.latihan6;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kalimat: ");
        String str = input.nextLine();

        //ngesplit kalimat
        String[] strSplit = str.split(" ");
        for (int i = 0; i < strSplit.length; i++) {
//            System.out.println(strSplit[i]);
        }

        for (int i = 0; i < strSplit.length; i++) {
            String str1 = strSplit[i];
            char str1At = str1.charAt(0);
            System.out.print(str1At);

            //cetak bintang
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            //belakang
            String str2 = strSplit[i].toLowerCase();
            char str2At = str2.charAt(strSplit[i].length() - 1);
            System.out.print(str2At + " ");
        }
    }
}