package latihan.challenge;

import java.util.Scanner;

public class Soal02Rute {
    public static void main(String[] args) {
         /*Diketahui:
        Toko ke tempat1= 2km
        Tempat1 ke tempat 2 =0,5km
        Tempat2 ke tempat 3 = 1,5 km
        Tempat3 ke tempat 4 = 2,5 km
        1 liter bensin dapat digunakan untuk 2,5 km
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan rute yang ingin anda kunjungi? ");
        String[] rute = input.nextLine().split("-");
        String toko = "toko", tempat1 = "tempat1", tempat2 = "tempat2", tempat3 = "tempat3", tempat4 = "tempat4";
        double jarak = 0, bensin=0,a=0;
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
                } else if (rute[i-1].equalsIgnoreCase(tempat3)){
                    jarak=jarak+1.5;
                } else if (rute[i-1].equalsIgnoreCase(tempat4)){
                    jarak=jarak+4.0;

                }
            }
            if (rute[i].equalsIgnoreCase(tempat3)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 4.0;
                } else if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 2.0;
                } else if (rute[i-1].equalsIgnoreCase(tempat2)){
                    jarak=jarak+1.5;
                } else if (rute[i-1].equalsIgnoreCase(tempat4)){
                    jarak=jarak+2.5;

                }
            }
            if (rute[i].equalsIgnoreCase(tempat4)) {
                if (rute[i - 1].equalsIgnoreCase(toko)) {
                    jarak = jarak + 6.5;
                } else if (rute[i - 1].equalsIgnoreCase(tempat1)) {
                    jarak = jarak + 4.5;
                } else if (rute[i-1].equalsIgnoreCase(tempat2)){
                    jarak=jarak+4.0;
                } else if (rute[i-1].equalsIgnoreCase(tempat3)){
                    jarak=jarak+2.5;

                }
            }
            if (rute[i].equalsIgnoreCase(toko)) {
                a = a + 1;
                if (a == 2) {
                    break;
                }
            }
        }
       bensin=jarak/2.5;
        System.out.println("Jarak yang ditempuh "+jarak+"km dengan bansin "+bensin+" liter");

    }
}

