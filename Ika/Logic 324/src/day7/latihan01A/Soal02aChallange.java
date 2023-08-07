package day7.latihan01A;

import java.util.Scanner;

public class Soal02aChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan rute perjalanan: ");
        String rute = scanner.nextLine();
        double jarak = 0;

        rute = rute.toLowerCase();
        String[] arrRute = rute.replace(" ", "").split("-");
        for (int i = 1; i < arrRute.length; i++) {
//            System.out.println(arrRute[i]);
            if (arrRute[i].equalsIgnoreCase("tempat1")) {
                if (arrRute[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 0.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 2;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 4.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 2;
                }
            } else if (arrRute[i].equalsIgnoreCase("tempat2")) {
                if (arrRute[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 0.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 1.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 4;
                } else if (arrRute[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 2.5;
                }
            } else if (arrRute[i].equalsIgnoreCase("tempat3")) {
                if (arrRute[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 2.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 1.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 2;
                } else if (arrRute[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 4;
                }
            } else if (arrRute[i].equalsIgnoreCase("tempat4")) {
                if (arrRute[i - 1].equalsIgnoreCase("toko")) {
                    jarak = jarak + 6.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 2.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 4;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 4.5;
                }
            } else if (arrRute[i].equalsIgnoreCase("toko") && i > 0) {
                if (arrRute[i - 1].equalsIgnoreCase("tempat1")) {
                    jarak = jarak + 2;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat2")) {
                    jarak = jarak + 2.5;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat3")) {
                    jarak = jarak + 4;
                } else if (arrRute[i - 1].equalsIgnoreCase("tempat4")) {
                    jarak = jarak + 6.5;
                }
                if(i>0){
                    System.out.println("mager");
                    break;
                }

            }

        }
        double bensin = jarak / 2.5;
        System.out.println(jarak);
        System.out.println("banyak bensin " + bensin + " liter");
    }
}
