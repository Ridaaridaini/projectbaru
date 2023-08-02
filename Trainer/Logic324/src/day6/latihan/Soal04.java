package day6.latihan;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = scanner.nextLine(); //"Liv Rundgren Tyler"
        kalimat = kalimat.toUpperCase(); //"LIV RUNDGREN TYLER"
        String[] arrKalimat = kalimat.split(" ");//{"LIV","RUNDGREN","TYLER"}

        for (int i = 0; i < arrKalimat.length; i++) {
            String kata = arrKalimat[i];
            //Cetak Awalan
            System.out.print(kata.charAt(0));
            //Cetak Bintang sesuai panjang kata
            for (int j = 0; j < kata.length(); j++) {
                System.out.print("*");
            }
            //Cetak Akhiran
            System.out.println(kata.charAt(kata.length() - 1));
        }

        //LIV
//        System.out.print(arrKalimat[0].charAt(0)); //L
//        for (int i = 0; i < arrKalimat[0].length(); i++) {
//            System.out.print("*");
//        }
//        System.out.println(arrKalimat[0].charAt(arrKalimat[0].length()-1)); //V

        //RUNDGREN
//        System.out.print(arrKalimat[1].charAt(0)); //R
//        for (int i = 0; i < arrKalimat[1].length(); i++) {
//            System.out.print("*");
//        }
//        System.out.println(arrKalimat[1].charAt(arrKalimat[0].length()-1)); //N

        //TYLER
//        System.out.print(arrKalimat[2].charAt(0)); //T
//        for (int i = 0; i < arrKalimat[2].length(); i++) {
//            System.out.print("*");
//        }
//        System.out.println(arrKalimat[2].charAt(arrKalimat[0].length()-1)); //R


    }

}
