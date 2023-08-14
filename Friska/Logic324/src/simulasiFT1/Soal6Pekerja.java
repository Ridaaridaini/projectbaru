package simulasiFT1;

import java.util.Scanner;

public class Soal6Pekerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah pekerja: ");
        double y = input.nextDouble();
        double hari = (5*3)/y;
        System.out.println("Jumlah hari yang dibutuhkan: "+ Math.ceil(hari));
    }
}
