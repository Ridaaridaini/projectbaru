package day6.latihan6;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("masukan kalimat: ");
        String str = input.nextLine();

        String[] strSplit = str.split(" ");

        String strChar = null;
        for (int i = 0; i < strSplit.length; i++) {
            System.out.println(strSplit[i]);
            strChar = strSplit[i];
        }

//        String str1 = strSplit[0];
//        char str1At = str1.charAt(0);
//        System.out.print(str1At);
//
//        String str2 = strSplit[1];
//        char str2At = str2.charAt(0);
//        System.out.print(str2At);
//
//        String str3 = strSplit[2];
//        char str3At = str3.charAt(0);
//        System.out.print(str3At);

        for (int i = 0; i < 3; i++) {
            String str1 = strSplit[i];
            char str1At = str1.charAt(0);
            System.out.print(str1At);
        }
    }
}
