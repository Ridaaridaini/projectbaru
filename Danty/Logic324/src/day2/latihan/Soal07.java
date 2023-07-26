package day2.latihan;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("jumlah pinjam buku pelajaran = ");
        int P = input.nextInt();

        System.out.println("jumlah pinjam buku novel = ");
        int N = input.nextInt();

        System.out.println("jumlah pinjam buku skripsi= ");
        int S = input.nextInt();

        System.out.println("lama pinjam = ");
        int hari = input.nextInt();

        int dP = 2000;
        int dN = 5000;
        int dS = 10000;

        int totalBiayaDendaP = P*hari*dP;
        int totalBiayaDendaN = N*hari*dN;
        int totalBiayaDendaS = S*hari*dS;

    }
}
