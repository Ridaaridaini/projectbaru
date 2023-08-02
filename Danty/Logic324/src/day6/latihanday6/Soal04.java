package day6.latihanday6;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String nama = input.nextLine(); //"Liv Rundgren Tyler"

        nama = nama.toUpperCase(); //"LIV RUNDGREN TYLER"
        String[] arrNama = nama.split(" ");  //{"LIV", "RUNDGREN", "TYLER"}


//        //Liv
//        System.out.print(arrNama[0].charAt(0));
//        System.out.println(arrNama[0].charAt(arrNama[0].length()-1));
//
//        //Rundgren
//        System.out.print(arrNama[1].charAt(0));
//        System.out.println(arrNama[1].charAt(arrNama[1].length()-1));
//
//        //Tyler
//        System.out.print(arrNama[2].charAt(0));
//        System.out.println(arrNama[2].charAt(arrNama[2].length()-1));


       for (int i = 0; i < arrNama.length; i++) {
           String kata = arrNama[i];
           System.out.print(kata.charAt(0));

           for (int j = 0; j < kata.length(); j++) {
               System.out.print("*");

           }
           System.out.println(kata.charAt(kata.length()-1));
       }

        }


    }

