package simulasi;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
    long hargaCoklat = 3000;
    long coklat = 0;
    long stempel = 0;

    Scanner scanner = new Scanner(System.in);

        System.out.print("Uang Budi : ");
        long uang = scanner.nextInt();

        coklat = uang/hargaCoklat;
        stempel = coklat;

        while (stempel >= 5){
            long tukerCoklat = stempel /5;
            long tukerStempel = tukerCoklat;
            long sisaStempel = stempel % 5;

            coklat = coklat + tukerCoklat;
            stempel = sisaStempel + tukerStempel;
        }
        System.out.println("Coklat : " +coklat);

    }
}
