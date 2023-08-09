package latihanC;

import java.util.Scanner;

public class Nomor8 {

    public static void main(String[] args) {

        int sehariKerja = 8;
        double sehariProduktif = (3*sehariKerja)/5f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("y: ");
        int y = scanner.nextInt();

        System.out.println(sehariProduktif);

        double totalJamPekerja = y*sehariProduktif;

        double totalHari = totalJamPekerja/sehariKerja;

        System.out.println((int) totalHari + " hari");

    }

}
