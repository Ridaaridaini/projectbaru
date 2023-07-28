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

        int kotakA = rG.nextInt(10);
        int kotakB = rG.nextInt(10);


        System.out.print("Pilih Kotak : ");
        String namaKotak = input.nextLine();

        input.nextLine();


//        if(namaKotak.equals("A")){
//            if(kotakA > kotakB ){
//                int nyawaPlayer = nyawaPlayer + nyawaKomputer;
//                System.out.print(nyawaPlayer);
//                continue;
//
//            }else if(kotakA < kotakB){
//                int nyawaPlayer = nyawaKomputer - nyawaPlayer;
//                System.out.print(nyawaPlayer);
            }



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
        }






    }
}


