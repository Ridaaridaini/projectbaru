package day6.latihan;

import java.util.Scanner;

public class soal04 {
    public static void main(String[] args) {
        //"Diinputkan sebuah nama, cetak huruf kapital awalan dan akhiran.
        //Di antara awalan dan akhiran, sertakan pattern bintang sepanjang tiap kata.
        //
        //Input :
        //Kalimat : Liv Rundgren Tyler
        //
        //output :
        //L***V
        //R********N
        //T*****R"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();
        String kalimat1 = kalimat.toUpperCase();
        String output1;

       String[] output=kalimat1.split(" ");

        for (int i = 0; i < output.length; i++) {
            String[] output2 = output[i].split("");

            for (int j = 0; j < output[i].length(); j++) {
                if(j==0){
                    System.out.print(output2[j]);
                }
            }

            for (int j = 0; j < output[i].length(); j++) {
                System.out.print("*");

            }

            for (int j = 0; j < output[i].length() ; j++) {
                if(j == output2.length-1){
                    System.out.print(output2[j]);
                }

            }
            System.out.println();

        }
//
//        for (int i = 0; i < output.length; i++) {
//            char depan=output[i].charAt(0);
//            char belakang=output[i].charAt((output.length));
//            System.out.println(depan);
//            System.out.println(belakang);
//
//        }


    }
}
