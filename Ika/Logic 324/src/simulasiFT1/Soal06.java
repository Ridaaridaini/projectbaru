package simulasiFT1;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        //5 orang pekerja dapat menyelesaikan pekerjaan dalam 3 hari. Berapa hari yang dibutuhkan untuk menyelesaikan
        // pekerjaan dengan y pekerja ? Asumsi 1 hari kerja adalah 8 jam.

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan banyak pekerja: ");
        double y = scanner.nextInt();

        double hari;
        hari = Math.ceil((3.0*5.0)/y);
        System.out.println(hari + " hari");

    }
}
