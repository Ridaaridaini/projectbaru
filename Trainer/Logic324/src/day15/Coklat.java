package day15;

import java.util.Scanner;

public class Coklat {

    public static void main(String[] args) {

        long hargaCoklat = 3000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Uang : ");
        long uang = scanner.nextLong(); //600.000

        long coklat = uang/hargaCoklat; //200, 240, 248, 249
        long stempel = coklat; //200, 40, 8, 4

        while(stempel >= 5){
            long tukerCoklat = stempel/5; //40, 8, 1
            long tukerStempel = tukerCoklat; //40, 8, 1
            long sisaStempel = stempel % 5;//0, 0, 3

            coklat = coklat + tukerCoklat;
            stempel = sisaStempel + tukerStempel;
        }

        System.out.println("Coklat : " + coklat);

    }
}
