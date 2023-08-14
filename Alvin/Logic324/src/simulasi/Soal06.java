package simulasi;

import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("pekerja: ");
        int y = scanner.nextInt();
        int jamPerHari = 8, totalHari = 3, jamPekerja = 5;

        int totalKerja = jamPerHari * totalHari * jamPekerja;

        float dayFinish = (float) totalKerja/(jamPerHari*y);

        System.out.print("dibutuhkan " + dayFinish + " hari dengan " + y + " pekerja");

    }

}
