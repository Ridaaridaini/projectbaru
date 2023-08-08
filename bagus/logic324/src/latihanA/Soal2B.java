package latihanA;

import java.util.Scanner;

public class Soal2B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rute = input.nextLine();

        String ruteReplace = rute.replace(" ", "");

        String[] ruteSplit = ruteReplace.split("-");

        double jarak = 0;


        for (int i = 1; i < ruteSplit.length; i++) {
//            System.out.println(ruteSplit[i]);

            if (ruteSplit[i].equals("tempat1")) {
                if (ruteSplit[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 0.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 2;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 4.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 2;
                }
            } else if (ruteSplit[i].equalsIgnoreCase("tempat2")) {

                if (ruteSplit[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 1.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 4;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 0.5; // jarak = 2 + 0.5 = 2.5
                } else if (ruteSplit[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 2.5;
                }

            } else if (ruteSplit[i].equalsIgnoreCase("tempat3")) {

                if (ruteSplit[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 4;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 2;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 1.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 2.5;
                }

            } else if (ruteSplit[i].equalsIgnoreCase("tempat4")) {

                if (ruteSplit[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 6.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 4.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 4;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 2.5;
                }

            } else if (ruteSplit[i].equalsIgnoreCase("toko") && i > 0) {

                if (ruteSplit[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 2;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 2.5;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 4;
                } else if (ruteSplit[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 6.5;
                }

            }
            if (ruteSplit[i].equalsIgnoreCase("toko")){
                break;
            }
        }
        double bensin = jarak / 2.5;

        System.out.println(jarak);
        System.out.println(bensin + " liter");

    }

}


