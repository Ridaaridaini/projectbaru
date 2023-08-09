package latihanekstra;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diketOrang = 5;
        int diketHari = 3;
        double jam = 8;
        int hariDibutuhkan;

        double jumlahPekerja = diketHari * jam * diketOrang;
        System.out.println(jumlahPekerja);
        
        System.out.println("Masukkan jumlah pekerja: ");
        int orang = scanner.nextInt();

        hariDibutuhkan = (int) Math.ceil(jumlahPekerja / (orang*jam));

        System.out.println(hariDibutuhkan);
    }
}
