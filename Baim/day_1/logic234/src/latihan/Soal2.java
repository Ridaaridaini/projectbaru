package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan rute yang diinginkan: ");
        String[] rute = scanner.nextLine().toLowerCase().replace(" ", "").split("-");
        float bensin = 0;
        float jarak = 0;

        for (int i = 0; i < rute.length; i++) {
            if (i == 0) {
                continue;
            }

            if (rute[i].equals("tempat1")) {
                if (rute[i - 1].equals("tempat2")) {
                    jarak += 0.5;
                }
                if (rute[i - 1].equals("tempat3")) {
                    jarak += 2;
                }
                if (rute[i - 1].equals("tempat4")) {
                    jarak += 4.5;
                }
                if (rute[i - 1].equals("toko")) {
                    jarak += 2;
                }
            }

            if (rute[i].equals("tempat2")) {
                if (rute[i - 1].equals("tempat1")) {
                    jarak += 0.5;
                }
                if (rute[i - 1].equals("tempat3")) {
                    jarak += 1.5;
                }
                if (rute[i - 1].equals("tempat4")) {
                    jarak += 4;
                }
                if (rute[i - 1].equals("toko")) {
                    jarak += 2.5;
                }
            }

            if (rute[i].equals("tempat3")) {
                if (rute[i - 1].equals("tempat2")) {
                    jarak += 1.5;
                }
                if (rute[i - 1].equals("tempat1")) {
                    jarak += 4;
                }
                if (rute[i - 1].equals("tempat4")) {
                    jarak += 2.5;
                }
                if (rute[i - 1].equals("toko")) {
                    jarak += 4;
                }
            }

            if (rute[i].equals("toko")) {
                if (rute[i - 1].equals("tempat1")) {
                    jarak += 2;
                }
                if (rute[i - 1].equals("tempat2")) {
                    jarak += 2.5;
                }
                if (rute[i - 1].equals("tempat3")) {
                    jarak += 4;
                }
                if (rute[i - 1].equals("tempat4")) {
                    jarak += 6.5;
                }
            }
        }

        bensin = jarak / 2.5f;

        System.out.println("Bensin: " + bensin + "L");
        System.out.println("Jarak: " + jarak + "km");
    }
}
