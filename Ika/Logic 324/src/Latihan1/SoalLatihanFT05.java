package Latihan1;

import java.util.Scanner;

public class SoalLatihanFT05 {
    public static void main(String[] args) {
        //Budi mendapatkan 1 stempel indomaret setiap melakukan pembelian 1 coklat. 5 stempel indomaret
        // bisa ditukar dengan 1 coklat dan 1 stempel. Jika harga coklat adalah Rp. 3000,
        // berapakah jumlah maksimal coklat yang bisa didapatkan Budi dengan uang Rp. xxx?

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan uang: ");
        int uang = scanner.nextInt();

        int coklat = uang/3_000;
        int stampel = coklat;

        while (stampel >= 5){
            int tukarcoklat =  stampel/5;
            int tukarStampel= tukarcoklat;
            int sisaStampel = stampel%5;

            coklat = coklat + tukarcoklat;
            stampel = sisaStampel + tukarStampel;
        }

        System.out.println(coklat);

    }
}
