package day7.soalSimulasi.SoalA;

import java.util.Scanner;

public class Soal2ARute {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rute: ");
        String[] rute = input.nextLine().split("-");
        String toko = "toko", tempat1 = "tempat1", tempat2 = "tempat2", tempat3 = "tempat3", tempat4 = "tempat4";
        double jarak = 0, bensin = 0, a = 0;
        for (int i = 0; i < rute.length; i++) {
            if (rute[i].equalsIgnoreCase(tempat1)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 2.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak + 0.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak + 2.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak + 4.5;
                }
            }
            if (rute[i].equalsIgnoreCase(tempat2)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 2.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 0.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak + 1.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak + 4.0;

                }
            }
            if (rute[i].equalsIgnoreCase(tempat3)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 4.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 2.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak + 1.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak + 2.5;

                }
            }
            if (rute[i].equalsIgnoreCase(tempat4)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 6.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 4.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak + 4.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak + 2.5;

                }
            }
            if (rute[i].equalsIgnoreCase(toko) && i > 0) {
                if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 2;
                } else if (rute[i - 1].equalsIgnoreCase(tempat2)) {
                    jarak = jarak + 2.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat3)) {
                    jarak = jarak + 4.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat4)) {
                    jarak = jarak + 6.5;

                }


            }
        }
        bensin = jarak / 2.5;
        System.out.println("Jarak yang ditempuh " + jarak + " km dengan bensin " + bensin + " liter");
    }
}
