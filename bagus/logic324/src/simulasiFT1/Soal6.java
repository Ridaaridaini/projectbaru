package simulasiFT1;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pekerja: ");
        double pekerja = input.nextDouble();

        double hari = 0;

        hari = (5*3) / pekerja;
        System.out.println(Math.ceil(hari));
    }
}
