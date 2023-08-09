package latihanFT1;

import java.util.Scanner;

public class Soal03 {

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


        if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(cangkir)){

            System.out.print( "1 botol = " + nilaiBotol +   " cangkir");
        }

        else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(cangkir)) {


            System.out.print("1 teko = " + nilaiTeko + " cangkir");

        } else if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(cangkir)){


            System.out.print("1 gelas = " + nilaiGelas + " cangkir");
        }

        //Konversi semua benda ke gelas
        double nilaiBotol1 = 2;
        double nilaiTeko1 = 10;
        double nilaiCangkir1= 0.4;

        if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(gelas)){

            System.out.print("1 botol = " + nilaiBotol1 + " gelas");

        } else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(gelas)){


            System.out.print("1 teko = " + nilaiTeko1 + " gelas");

        } else if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(gelas)){


            System.out.print("1 cangkir = " + nilaiCangkir1+ " gelas");
        }

        //Konversi semua benda ke botol
        double nilaiCangkir2 = 0.2;
        double nilaiGelas2 = 0.5;
        double nilaiTeko2 = 5;

        if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(botol)){

            System.out.print("1 cangkir = " + nilaiCangkir2 + " botol");

        } else if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(botol)){


            System.out.print("1 gelas = " + nilaiGelas2 + " botol");

        } else if(benda.equalsIgnoreCase(teko) && konversi.equalsIgnoreCase(botol)){


            System.out.print("1 teko = " + nilaiTeko2 + " botol");
        }

        //Konversi semua benda ke teko

        double nilaiGelas3 = 0.1;
        double nilaiCangkir3 = 0.04;
        double nilaiBotol3 = 0.2;

        if(benda.equalsIgnoreCase(gelas) && konversi.equalsIgnoreCase(teko)){

            System.out.print("1 gelas = " + nilaiGelas3 + " teko");

        } else if(benda.equalsIgnoreCase(cangkir) && konversi.equalsIgnoreCase(teko)){


            System.out.print("1 cangkir = " + nilaiCangkir3 + " teko");

        } else if(benda.equalsIgnoreCase(botol) && konversi.equalsIgnoreCase(teko)){


            System.out.print("1 botol = " + nilaiBotol3 + " teko");
        }





















    }
}
