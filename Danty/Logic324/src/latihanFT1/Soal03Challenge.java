package latihanFT1;

import java.util.Scanner;

public class Soal03Challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Konversi semua benda ke cangkir
        double nilaiBotol = 5;
        double nilaiTeko = 25;
        double nilaiGelas = 2.5;

        String botol = "botol";
        String gelas = "gelas";
        String cangkir = "cangkir";
        String teko = "teko";

        System.out.print("Benda : ");
        String benda = input.nextLine();

        System.out.print("Konversi ke : ");
        String konversi = input.nextLine();

        int b;
        int g;
        int c;
        int t;


        if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(cangkir)){

            System.out.print("Banyak botol = ");
            b = input.nextInt();

            System.out.print(b + " botol = " + (b*nilaiBotol) +   " cangkir");
        }

        else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(cangkir)) {

            System.out.print("Banyak teko = ");
            t = input.nextInt();

            System.out.print(t + " teko = " + (t*nilaiTeko) + " cangkir");

        } else if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(cangkir)){

            System.out.print("Banyak gelas = ");
            g = input.nextInt();

            System.out.print(g + " gelas = " + (g*nilaiGelas) + " cangkir");
        }

        //Konversi semua benda ke gelas
        double nilaiBotol1 = 2;
        double nilaiTeko1 = 10;
        double nilaiCangkir1= 0.4;

        if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(gelas)){

            System.out.print("Banyak botol = ");
            b = input.nextInt();

            System.out.print(b + " botol = " + (b*nilaiBotol1) + " gelas");

        } else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(gelas)){

            System.out.print("Banyak teko = ");
            t = input.nextInt();

            System.out.print(t + " teko = " + (t*nilaiTeko1) + " gelas");

        } else if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(gelas)){

            System.out.print("Banyak cangkir = ");
            c = input.nextInt();

            System.out.print(c + " cangkir = " + (c*nilaiCangkir1) + " gelas");
        }

        //Konversi semua benda ke botol
        double nilaiCangkir2 = 0.2;
        double nilaiGelas2 = 0.5;
        double nilaiTeko2 = 5;

        if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(botol)){

            System.out.print("Banyak cangkir = ");
            c = input.nextInt();

            System.out.print(c + " cangkir = " + (c*nilaiCangkir2) + " botol");

        } else if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(botol)){

            System.out.print("Banyak gelas = ");
            g = input.nextInt();

            System.out.print(g + " gelas = " + (g*nilaiGelas2) + " botol");

        } else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(botol)){


            System.out.print("Banyak teko = ");
            t = input.nextInt();


            System.out.print(t + " teko = " + (t*nilaiTeko2) + " botol");
        }

        //Konversi semua benda ke teko

        double nilaiGelas3 = 0.1;
        double nilaiCangkir3 = 0.04;
        double nilaiBotol3 = 0.2;

        if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(teko)){

            System.out.print("Banyak gelas = ");
            g = input.nextInt();

            System.out.print(g + " gelas = " + (g*nilaiGelas3) + " teko");

        } else if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(teko)){

            System.out.print("Banyak cangkir = ");
            c = input.nextInt();

            System.out.print(c + " cangkir = " + (c*nilaiCangkir3) + " teko");

        } else if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(teko)){

            System.out.print("Banyak botol = ");
            b = input.nextInt();

            System.out.print(b + " botol = " + (b*nilaiBotol3) + " teko");
        }

    }

}
