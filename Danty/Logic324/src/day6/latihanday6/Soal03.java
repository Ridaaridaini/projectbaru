package day6.latihanday6;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = input.nextLine();
        //String kalimat = "Dwayne Doughlas Johnson";

        //kalimat di uppercase
        kalimat = kalimat.toUpperCase(); //"DWAYNE DOUGHLAS JOHNSON"


        //di split berdasarkan spasi
        String [] arrKalimat = kalimat.split(" ");
        //{"DWAYNE", "DOUGHLAS", "JOHNSON"}


        //di charAt
//        char kata1 = arrKalimat[0].charAt(0);
//        System.out.print(kata1);
//
//        char kata2 = arrKalimat[1].charAt(0);
//        System.out.print(kata2);
//
//        char kata3 = arrKalimat[2].charAt(0);
//        System.out.print(kata3);

        for (int i = 0; i < arrKalimat.length; i++) {
            char kata1 = arrKalimat[i].charAt(0);
            System.out.print(kata1);

        }







           }

        }



