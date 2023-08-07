package latihanFT1;

import java.util.Scanner;

public class Soal03Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Konversi semua benda ke cangkir
        double botol = 5;
        double teko = 5 * botol;
        double gelas = 0.1 * teko;

        System.out.print("Benda : ");
        String benda = input.nextLine();


        if(benda.equalsIgnoreCase("botol")){

            System.out.print("Banyak Botol = ");
            int b = input.nextInt();

            System.out.print( b + " botol = " + (b*botol) +   " cangkir");
        }

        else if(benda.equalsIgnoreCase(" teko")) {

            System.out.print("Banyak Teko = ");
            int t = input.nextInt();

            System.out.print(t +  " teko = " + (t*teko) + " cangkir");

        } else if(benda.equalsIgnoreCase("gelas")){

            System.out.print("Banyak Gelas = ");
            int g = input.nextInt();

            System.out.print( g + " gelas = " + (g*gelas) + " cangkir");
        }

        //Konversi semua benda ke gelas
        double botol1 = 2;
        double teko1 = 5 * botol1;
        double cangkir1= 0.04 * teko1;

        if(benda.equalsIgnoreCase("botol1")){

            System.out.print("Banyak Botol = ");
            int b1 = input.nextInt();

            System.out.print(b1 + " botol = " + (b1*botol1) + " gelas");

        } else if(benda.equalsIgnoreCase("teko1")){

            System.out.print("Banyak Teko = ");
            int t1 = input.nextInt();

            System.out.print(t1 + " teko = " + (t1*teko1) + " gelas");

        } else if(benda.equalsIgnoreCase("cangkir1")){

            System.out.print("Banyak Cangkir = ");
            int c1 = input.nextInt();


            System.out.print(c1 + " cangkir = " + (c1*cangkir1) + " gelas");
        }

    }

}
