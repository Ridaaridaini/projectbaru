package latihanFT1;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       //Konversi semua benda ke cangkir
        double botol = 5;
        double teko = 5 * botol;
        double gelas = 0.1 * teko;

        System.out.print("benda : ");
        String benda = input.nextLine();


        if(benda.equalsIgnoreCase("botol")){

            System.out.print( "1 botol = " + (1*botol) +   " cangkir");
        }

        else if(benda.equalsIgnoreCase(" teko")) {


            System.out.print("1 teko = " + (1*teko) + " cangkir");

        } else if(benda.equalsIgnoreCase("gelas")){


            System.out.print("1 gelas = " + 1*gelas + " cangkir");
        }

        //Konversi semua benda ke gelas
        double botol1 = 2;
        double teko1 = 5 * botol1;
        double cangkir1= 0.04 * teko1;

        if(benda.equalsIgnoreCase("botol1")){

            System.out.print("1 botol = " + 1*botol1 + " gelas");

        } else if(benda.equalsIgnoreCase("teko1")){


            System.out.print("1 teko = " + 1*teko1 + " gelas");

        } else if(benda.equalsIgnoreCase("cangkir1")){


            System.out.print("1 cangkir = " + 1*cangkir1 + " gelas");
        }



















    }
}
