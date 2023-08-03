package latihanA;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rute = input.nextLine();

        String ruteReplace = rute.replace(" ", "");

        String[] ruteSplit = ruteReplace.split("-");

        double jarak = 0;


        for (int i = 1; i < ruteSplit.length; i++) {
//            System.out.println(ruteSplit[i]);
            String jarakAntar = ruteSplit[i];
            if (jarakAntar.equals("tempat1") && ruteSplit[i-1].equals("toko")){
                jarak = jarak + 2;
            }
            if (jarakAntar.equals("tempat2")) {
                jarak = jarak + 0.5;
            }
            if (jarakAntar.equals("tempat3")) {
                jarak = jarak + 1.5;
            }
            if (jarakAntar.equals("tempat4")) {
                jarak = jarak + 2.5;
            }
            if (jarakAntar.equals("toko")) {
                jarak = jarak + jarak;
            }

        }

        double bensin = jarak/2.5;

        System.out.println(jarak);
        System.out.println(bensin+ " liter");
    }
}
