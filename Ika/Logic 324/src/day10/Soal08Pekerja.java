package day10;

import java.util.Scanner;

public class Soal08Pekerja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan banyak pekerja: ");
        double y = scanner.nextInt();

        double hari=0;
        hari = Math.ceil((3.0*5.0)/y);
        System.out.println("banyak hari "+ hari);



    }
}
