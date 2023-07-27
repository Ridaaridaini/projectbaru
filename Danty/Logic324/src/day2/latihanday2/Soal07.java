package day2.latihanday2;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("jumlah pinjam buku pelajaran = ");
        int pelajaran = input.nextInt();

        System.out.print("jumlah pinjam buku novel = ");
        int novel = input.nextInt();

        System.out.print("jumlah pinjam buku skripsi = ");
        int skripsi = input.nextInt();

        System.out.print("lama pinjam = ");
        int hari = input.nextInt();

        int dendaP = 2000;
        int dendaN = 5000;
        int dendaS = 10000;

        //int keterlambatanHari = hari - 10;

        //int totalBiayaDendaP = pelajaran*keterlambatanHari*dendaP;
        //int totalBiayaDendaN = novel*keterlambatanHari*dendaN;
        //int totalBiayaDendaS = skripsi*keterlambatanHari*dendaS;

        //int totalDendaBuku = totalBiayaDendaP + totalBiayaDendaN + totalBiayaDendaS;

        if(hari > 10){
            int totalDenda = ((hari - 10)*pelajaran*dendaP) + ((hari - 10)*novel*dendaN) + ((hari - 10)*skripsi*dendaS);
            System.out.println("Total Denda = " + totalDenda);
        }
        else if(hari <= 10){
            System.out.println("gratis");

        }

    }
}
