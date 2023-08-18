package simulasiFT1;

import java.util.Scanner;

public class Soal05Pembahasan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan uang: ");
        long uang= scanner.nextLong();

        long hargaCoklat =3_000;
        long coklat = uang/hargaCoklat;
        long stampel = coklat;

        while (stampel >=5){
            long tukerCoklat = stampel/5;
            long tukerStampel = tukerCoklat;
            long sisaStampel = stampel % 5;

            coklat = coklat+tukerCoklat;
            stampel = sisaStampel +tukerStampel;
        }

        System.out.println("coklat : " + coklat);

    }
}
