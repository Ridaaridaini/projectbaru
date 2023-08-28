package simulasi;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        int orangPekerja = 5;
        int totalHari = 3;
        int jamKerja = 8;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Y : ");
        int input = scanner.nextInt();

        double totalPerkerja = orangPekerja * totalHari * jamKerja;

        double hasil = totalPerkerja / (jamKerja * input);

        System.out.print("hari : "+hasil +" , "+"pekerja : "+input);
    }
}
