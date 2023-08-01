package day6.latihanday6;

import java.util.Scanner;

public class Soal04 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String nama = input.nextLine();

        nama = nama.toUpperCase();
        String [] arrNama = nama.split(" ");

        for (int i = 0; i < arrNama.length; i++) {
            System.out.println(arrNama[i]);

        }


        //        for (int i = 0; i < arrNama2.length; i++) {
//            if(i == 0 || i == arrNama2.length-1) {
//                System.out.println(arrNama2[i]);
//            }
//           else {
//               System.out.print("*");
    }
}
