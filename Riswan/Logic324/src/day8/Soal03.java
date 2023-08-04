package day8;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Konversi : ");
        String konversi = input.nextLine();

        String[] konversi1 = konversi.split(" ");
        for (int i = 0; i < konversi1.length; i++) {
            System.out.println(konversi1[i] +" ke "+i);
        }
        if (konversi1[1].equalsIgnoreCase("botol")){
            if (konversi1[4].equalsIgnoreCase("teko")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 0.2;
                System.out.println( "botol = "+ angka +" teko ");

            }else if (konversi1[4].equalsIgnoreCase("cangkir")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 5;
                System.out.println( "botol = "+ angka +" cangkir ");
            }else if (konversi1[4].equalsIgnoreCase("gelas")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 2;
                System.out.println( "botol = "+ angka +" gelas ");
            }
        }else if (konversi1[1].equalsIgnoreCase("cangkir")){
            if (konversi1[4].equalsIgnoreCase("teko")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 0.02;
                System.out.println( "cangkir = "+ angka +" teko ");

            }else if (konversi1[4].equalsIgnoreCase("botol")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 0.2;
                System.out.println( "cangkir = "+ angka +" botol ");
            }else if (konversi1[4].equalsIgnoreCase("gelas")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 0.4;
                System.out.println( "cangkir = "+ angka +" gelas ");
            }
        }else if (konversi1[1].equalsIgnoreCase("gelas")){
            if (konversi1[4].equalsIgnoreCase("teko")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 0.1;
                System.out.println( "gelas = "+ angka +" teko ");
            }else if (konversi1[4].equalsIgnoreCase("cangkir")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 2.5;
                System.out.println( "gelas = "+ angka +" cangkir ");
            }else if (konversi1[4].equalsIgnoreCase("botol")){
                double angka = Double.parseDouble(konversi1[0]);
                //double angka1 = Double.parseDouble(konversi1[3]);
                angka = angka * 0.5;
                System.out.println( "gelas = "+ angka +" botol ");
            }
        }else if (konversi1[1].equalsIgnoreCase("teko")){
            if (konversi1[4].equalsIgnoreCase("botol")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 10.0;
                System.out.println( "teko = "+ angka +" botol ");
            }else if (konversi1[4].equalsIgnoreCase("cangkir")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 25.0;
                System.out.println( "teko = "+ angka +" cangkir ");
            }else if (konversi1[4].equalsIgnoreCase("gelas")){
                double angka = Double.parseDouble(konversi1[0]);
                angka = angka * 5.0;
                System.out.println("teko = "+ angka +" gelas ");
            }
        }
    }
}
