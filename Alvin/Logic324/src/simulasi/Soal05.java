package simulasi;

import java.util.Scanner;

public class Soal05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("uang Budi: ");
        long uangBudi = scanner.nextLong();

        int stempel = 0, harga_coklat = 3_000, coklat = 0;
        while (uangBudi>=harga_coklat){


            uangBudi = uangBudi-harga_coklat;
            stempel++;
            coklat++;


            if (stempel == 5){
                stempel = 0;
                coklat++;
                stempel++;
            }
        }

        System.out.println("coklat: " + coklat);

    }

}
