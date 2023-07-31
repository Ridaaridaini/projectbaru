package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Class Scanner

        System.out.print("n = ");
        int n = input.nextInt();

        int nyawaKomputer = n;
        int nyawaPlayer = n;

        System.out.print("m = ");
        int m = input.nextInt();

        Random rG = new Random(); //Class Random

        int kotakA = rG.nextInt(10); //ini batasnya 0-9 yaaa, tapi memang ditulis 10
        int kotakB = rG.nextInt(10);


        System.out.print("Pilih Kotak : ");
        String namaKotak = input.nextLine();


        while (nyawaPlayer > 0) {
            if (namaKotak.equals("A")) {
                System.out.print("Kotak A = " + kotakA);
                System.out.print("Kotak B = " + kotakB);
                if (kotakA > kotakB) {
                    nyawaPlayer = nyawaPlayer + nyawaKomputer;
                    continue;
                } else if (kotakA < kotakB) {
                    nyawaPlayer = nyawaPlayer - nyawaKomputer;
                    continue;
                }
            }
            if (namaKotak.equals("B")) {
                System.out.print("Kotak A = " + kotakA);
                System.out.print("Kotak B = " + kotakB);
                if (kotakB > kotakA) {
                    nyawaPlayer = nyawaPlayer + nyawaKomputer;
                    continue;
                } else if (kotakB < kotakA) {
                    nyawaPlayer = nyawaPlayer - nyawaKomputer;
                    continue;
                }
                }
            if (nyawaKomputer == 0) {
                System.out.print("YOU WIN");
                }
            if (nyawaPlayer == 0) {
                System.out.print("YOU LOSE");


            }
        }
    }
}




//           else if(kotakA < kotakB){
//                int nyawaPlayer = nyawaKomputer - nyawaPlayer;
//                System.out.print(nyawaPlayer);

//            int player = n+m;
//            System.out.print(player);
//
//        }else if(kotakA < m){
//            int computer = m-n;
//            System.out.print(computer);


        //        System.out.println();
//
////        int kotakB = rG.nextInt(9);
////        System.out.print("Kotak B : " + kotakB);

            //System.out.print("Kotak A : " + kotakA);











