package simulasi;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalKerjaAwal = 5*3*8;

        System.out.println("Jumlah pekerja");
        int kerja = input.nextInt();

        double hari = totalKerjaAwal /(kerja * 8);
        System.out.println("Estimasi : "+hari+" hari ");

    }
}
