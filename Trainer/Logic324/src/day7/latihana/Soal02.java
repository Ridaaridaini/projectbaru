package day7.latihana;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {

        String toko = "toko";
        String tempat1 = "tempat1";
        String tempat2 = "tempat2";
        String tempat3 = "tempat3";
        String tempat4 = "tempat4";

        int tokoTempat1 = 2000;
        int tempat1Tempat2 = 500;
        int tempat2Tempat3 = 1500;
        int tempat3Tempat4 = 2500;

        int tokoTempat2 = tokoTempat1 + tempat1Tempat2;
        int tokoTempat3 = tokoTempat1 + tempat1Tempat2 + tempat2Tempat3;
        int tokoTempat4 = tokoTempat1 + tempat1Tempat2 + tempat2Tempat3 + tempat3Tempat4;

        int tempat1Tempat3 = tempat1Tempat2 + tempat2Tempat3;
        int tempat1Tempat4 = tempat1Tempat2 + tempat2Tempat3 + tempat3Tempat4;

        int tempat2Tempat4 = tempat2Tempat3 + tempat3Tempat4;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Rute : ");
        String rute = scanner.nextLine();
        String[] arrRute = rute.split(" - ");

        double jarak = 0;

        for (int i = 0; i < arrRute.length - 1; i++) {
            String ruteAsal = arrRute[i];
            String ruteTujuan = arrRute[i+1];

            if (ruteAsal.equalsIgnoreCase(toko) && ruteTujuan.equalsIgnoreCase(tempat1)){
                jarak = jarak + tokoTempat1;
            } else  if (ruteAsal.equalsIgnoreCase(toko) && ruteTujuan.equalsIgnoreCase(tempat2)){
                jarak = jarak + tokoTempat2;
            } else  if (ruteAsal.equalsIgnoreCase(toko) && ruteTujuan.equalsIgnoreCase(tempat3)){
                jarak = jarak + tokoTempat3;
            } else  if (ruteAsal.equalsIgnoreCase(toko) && ruteTujuan.equalsIgnoreCase(tempat4)){
                jarak = jarak + tokoTempat4;
            } else  if (ruteAsal.equalsIgnoreCase(tempat1) && ruteTujuan.equalsIgnoreCase(tempat2)){
                jarak = jarak + tempat1Tempat2;
            } else  if (ruteAsal.equalsIgnoreCase(tempat1) && ruteTujuan.equalsIgnoreCase(tempat3)){
                jarak = jarak + tempat1Tempat3;
            } else  if (ruteAsal.equalsIgnoreCase(tempat1) && ruteTujuan.equalsIgnoreCase(tempat4)){
                jarak = jarak + tempat1Tempat4;
            } else  if (ruteAsal.equalsIgnoreCase(tempat2) && ruteTujuan.equalsIgnoreCase(tempat3)){
                jarak = jarak + tempat2Tempat3;
            } else  if (ruteAsal.equalsIgnoreCase(tempat2) && ruteTujuan.equalsIgnoreCase(tempat4)){
                jarak = jarak + tempat2Tempat4;
            } else  if (ruteAsal.equalsIgnoreCase(tempat3) && ruteTujuan.equalsIgnoreCase(tempat4)){
                jarak = jarak + tempat3Tempat4;
            }
            //Balik ke toko
            else  if (ruteAsal.equalsIgnoreCase(tempat1) && ruteTujuan.equalsIgnoreCase(toko)){
                jarak = jarak + tokoTempat1;
            } else  if (ruteAsal.equalsIgnoreCase(tempat2) && ruteTujuan.equalsIgnoreCase(toko)){
                jarak = jarak + tokoTempat2;
            } else  if (ruteAsal.equalsIgnoreCase(tempat3) && ruteTujuan.equalsIgnoreCase(toko)){
                jarak = jarak + tokoTempat3;
            } else  if (ruteAsal.equalsIgnoreCase(tempat4) && ruteTujuan.equalsIgnoreCase(toko)){
                jarak = jarak + tokoTempat4;
            }
        }

        double bensin = jarak/2500;
        System.out.println(bensin + " liter");


    }
}
