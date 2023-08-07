package day2Percabangan.latihan2;

import java.util.Scanner;

public class Soal7DendaBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah  buku pelajaran yang dipinjam: ");
        int pelajaran = input.nextInt();
        System.out.println("Masukkan jumlah  buku novel yang dipinjam: ");
        int novel = input.nextInt();
        System.out.println("Masukkan jumlah buku skripsi yang dipinjam: ");
        int skripsi = input.nextInt();
        System.out.println("Masukkan lama peminjaman: ");
        int lama = input.nextInt();

        if (lama >= 10){
            int lamadenda = lama - 10;
            int jumPelajaran = 2000 * pelajaran * lamadenda;
            int jumnovel =5000 * novel * lamadenda;
            int jumskripsi = 10000 * skripsi * lamadenda;
            int totaldenda = jumPelajaran+jumnovel+jumskripsi;
            System.out.println("Jumlah denda yang harus dibayarkan yaitu sebanyak Rp."+totaldenda);

        }
        else{
            System.out.println("Anda tidak memiliki denda apapun :)");
        }

    }
}
