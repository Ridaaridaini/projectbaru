package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Saldo OPO : ");
        int saldo = input.nextInt();

        int hargaKopi = 9000; //harga per cup setelah di diskon
       int cashBack = 10; //10%

        do {
            if (saldo >= 54000) {
                if (saldo / hargaKopi <= 11) {
                    int cup = (saldo / hargaKopi);
                    int hargaBeliKopi = (cup * hargaKopi);
                    int saldo2 = saldo - hargaBeliKopi;
                    int sisaSaldo = saldo2 + (hargaBeliKopi / cashBack);
                    System.out.println("Jumlah cup : " + cup + " Saldo Akhir = Rp " + sisaSaldo);

                } else if (saldo / hargaKopi > 11) {
                    int cup = 11;
                    int hargaBeliKopi = (cup * hargaKopi);
                    int saldo2 = saldo - hargaBeliKopi;
                    int sisaSaldo = saldo2 + (hargaBeliKopi / cashBack);
                    System.out.println("Jumlah cup :" + cup + "Saldo Akhir = Rp " + sisaSaldo);
                }
                break;

            }
        } while (saldo >= 54000);





    }
}
