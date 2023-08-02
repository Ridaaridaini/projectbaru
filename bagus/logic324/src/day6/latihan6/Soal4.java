package day6.latihan6;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kalimat: ");
        String str = input.nextLine();

        //ngesplit kalimat
        String[] strSplit = str.split(" ");
        for (int i = 0; i < strSplit.length; i++) {
//            System.out.println(strSplit[i]);
        }
//        String strUp1 = strSplit[0].toUpperCase();
//        System.out.println(strUp1);
//
//        String strUp2 = strSplit[1].toUpperCase();
//        System.out.println(strUp2);
//
//        String strUp3 = strSplit[2].toUpperCase();
//        System.out.println(strUp3);


        //nge-upper case kalimat yang udah di split
        for (int i = 0; i < strSplit.length; i++) {
            String strUp1 = strSplit[i].toUpperCase();
//            System.out.println(strUp1);

        }

            //depan
        for (int i = 0; i < strSplit.length; i++) {
            String str1 = strSplit[i];
            char str1At = str1.charAt(0);
            System.out.print(str1At);

            //cetak bintang
            for (int j = 0; j < strSplit[i].length(); j++) {
                System.out.print("*");
            }
            //belakang
            String str2 = strSplit[i].toUpperCase();
            char str2At = str2.charAt(strSplit[i].length()-1);
            System.out.println(str2At);

        }

//        String str1 = strSplit[0].toUpperCase();
//        char str1At = str1.charAt(strSplit[0].length()-1);
//        System.out.println(str1At);
//
//
//
//        String str3 = strSplit[2].toUpperCase();
//        char str3At = str3.charAt(strSplit[2].length()-1);
//        System.out.println(str3At);



    }
}
