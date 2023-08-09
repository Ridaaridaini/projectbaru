package latihanFT1;

import java.util.Scanner;

public class Soal02Challenge {

    public static void main(String[] args) {

        //CHALLENGE : SETIAP SAMPAI TOKO BERHENTI

        Scanner input = new Scanner (System.in);

        System.out.print("Rute : ");
        String rute = input.nextLine();

        String [] arrRute = rute.split("-");
        double jarak = 0;

        for (int i = 0; i < arrRute.length-1; i++) {

            String asal = arrRute[i];
            String tujuan = arrRute[i + 1];

            if(asal.equalsIgnoreCase("toko") && tujuan.equalsIgnoreCase("tempat 1")){
                jarak = jarak + 2;
            } else if(asal.equalsIgnoreCase("toko") && tujuan.equalsIgnoreCase("tempat 2")){
                jarak = jarak + 2.5;
            } else if(asal.equalsIgnoreCase("toko") && tujuan.equalsIgnoreCase("tempat 3")){
                jarak = jarak + 4;
            } else if(asal.equalsIgnoreCase("toko") && tujuan.equalsIgnoreCase("tempat 4")) {
                jarak = jarak + 6.5;
            } else if(asal.equalsIgnoreCase("tempat 1") && tujuan.equalsIgnoreCase("tempat 2")) {
                jarak = jarak + 0.5;
            } else if(asal.equalsIgnoreCase("tempat 1") && tujuan.equalsIgnoreCase("tempat 3")) {
                jarak = jarak + 2;
            } else if(asal.equalsIgnoreCase("tempat 1") && tujuan.equalsIgnoreCase("tempat 4")) {
                jarak = jarak + 4.5;
            } else if(asal.equalsIgnoreCase("tempat 1") && tujuan.equalsIgnoreCase("toko")) {
                jarak = jarak + 2;
                break;
            } else if(asal.equalsIgnoreCase("tempat 2") && tujuan.equalsIgnoreCase("tempat 3")) {
                jarak = jarak + 1.5;
            } else if(asal.equalsIgnoreCase("tempat 2") && tujuan.equalsIgnoreCase("tempat 4")) {
                jarak = jarak + 4;
            } else if(asal.equalsIgnoreCase("tempat 2") && tujuan.equalsIgnoreCase("tempat 1")) {
                jarak = jarak + 0.5;
            } else if(asal.equalsIgnoreCase("tempat 2") && tujuan.equalsIgnoreCase("toko")) {
                jarak = jarak + 2.5;
                break;
            } else if(asal.equalsIgnoreCase("tempat 3") && tujuan.equalsIgnoreCase("tempat 4")) {
                jarak = jarak + 2.5;
            } else if(asal.equalsIgnoreCase("tempat 3") && tujuan.equalsIgnoreCase("tempat 2")) {
                jarak = jarak + 1.5;
            } else if(asal.equalsIgnoreCase("tempat 3") && tujuan.equalsIgnoreCase("tempat 1")) {
                jarak = jarak + 2;
            } else if(asal.equalsIgnoreCase("tempat 3") && tujuan.equalsIgnoreCase("toko")) {
                jarak = jarak + 4;
                break;
            } else if(asal.equalsIgnoreCase("tempat 4") && tujuan.equalsIgnoreCase("tempat 3")) {
                jarak = jarak + 2.5;
            } else if(asal.equalsIgnoreCase("tempat 4") && tujuan.equalsIgnoreCase("tempat 2")) {
                jarak = jarak + 4;
            } else if(asal.equalsIgnoreCase("tempat 4") && tujuan.equalsIgnoreCase("tempat 1")) {
                jarak = jarak + 4.5;
            } else if(asal.equalsIgnoreCase("tempat 4") && tujuan.equalsIgnoreCase("toko")) {
                jarak = jarak + 6.5;
                break;
            }
        }
        double bensin = jarak/2.5;
        System.out.println(jarak + " km");
        System.out.print(bensin + " liter");


    }
}
