package day7.soalSimulasi.SoalB;

import java.util.Scanner;

public class Soal3BSiangka1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n : ");
        int n = scanner.nextInt();

        int angka1Ditemukan = 0;
        int start = 100;
        int mulai = start;
        while (angka1Ditemukan < n) {
            while (mulai > 10) {
                String strMulai = mulai + "";
                String[] arrStrMulai = strMulai.split("");
                int jumlah = 0;
                for (int i = 0; i < arrStrMulai.length; i++) {
                    int hasil = Integer.parseInt(arrStrMulai[i]) * Integer.parseInt(arrStrMulai[i]);
                    jumlah = jumlah + hasil;
                }
                if (jumlah == 1) {
                    System.out.println(start + " si Angka 1");
                    start++;
                    mulai = start;
                    angka1Ditemukan++;
                    break;
                } else if (jumlah < 10) {
                    start++;
                    mulai = start;
                    break;
                }
                mulai = jumlah;
            }
        }

    }
}
