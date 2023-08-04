package day7.soalSimulasi;

import java.util.Scanner;

public class Challange2A {
    public static void main(String[] args) {
        String toko = "toko";
        String tempat1 ="tempat1";
        String tempat2 ="tempat2";
        String tempat3 ="tempat3";
        String tempat4 ="tempat4";
        double jarak = 0;
        double bensin = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rute : ");
        String rute = input.nextLine();
        String[] arrRute = rute.split("");



        if(awal.equalsIgnoreCase("tempat1") && (akhir.equalsIgnoreCase("tempat2"))){
            jarak = (2 + 0.5) * 2;
            bensin = jarak / 2.5;
            System.out.println(bensin+ " liter");

        } else if (awal.equalsIgnoreCase("tempat1") && (akhir.equalsIgnoreCase("tempat3"))) {
            jarak = (2 + 0.5 + 1.5) * 2;
            bensin = jarak / 2.5;
            System.out.println(bensin+ " liter");


        }else if (awal.equalsIgnoreCase("tempat1")&& (akhir.equalsIgnoreCase("tempat4"))){
            jarak = (2 + 0.5 + 1.5 + 2.5) * 2;
            bensin = jarak / 2.5;
            System.out.println(bensin+ " liter");
        }


    }
}
