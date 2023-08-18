package simulasiFT1;

import java.util.Scanner;

public class Soal5Coklat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan uang: ");
        long uang = input.nextLong();
        long hargaCoklat = 3000;

        long coklat = uang/hargaCoklat;
        long stempel = coklat;

        while(stempel >= 5){
            long tukarCoklat = stempel/5;
            long tukarStempel = tukarCoklat;
            long sisaStempel = stempel % 5;

            coklat = coklat +tukarCoklat;
            stempel = sisaStempel +tukarStempel;
        }
        System.out.println("Coklat:"+ coklat);

    }
}
