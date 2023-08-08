package latihanA;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Laki-laki dewasa: ");
        int lkDewasa = input.nextInt();

        System.out.println("Perempuan dewasa: ");
        int prDewasa = input.nextInt();

        System.out.println("Remaja: ");
        int remaja = input.nextInt();

        System.out.println("anak-anak: ");
        int anak = input.nextInt();

        System.out.println("balita: ");
        int balita = input.nextInt();

        int porsilkDewasa = 2;
        int porsiprDewasa = 1;
        int porsiRemaja = 1;
        int porsiBalita = 1;
        double porsiAnak = 0.5;
//        int PorsiAnak = (int) porsiAnak;

        double totalPorsi = 0;

        int orang = lkDewasa + prDewasa + remaja + anak + balita;


        if (orang % 2 == 0 && lkDewasa > prDewasa) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak) + lkDewasa);
            System.out.println(totalPorsi + " porsi");
        } else if (orang % 2 == 0) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak));
            System.out.println(totalPorsi + " porsi");
        }


        if (orang % 2 != 0 && orang > 5 && lkDewasa > prDewasa) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak) + prDewasa + lkDewasa);
            System.out.println(totalPorsi + " porsi");
        }else if (orang % 2 != 0 && lkDewasa > prDewasa) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak) + lkDewasa);
            System.out.println(totalPorsi + " porsi");
        }
        else if (orang % 2 != 0 && orang > 5) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak)+prDewasa);
            System.out.println(totalPorsi + " porsi");
        }
        else if (orang % 2 != 0) {
            totalPorsi = ((lkDewasa * porsilkDewasa) + (prDewasa * porsiprDewasa) + (remaja * porsiRemaja) + (balita * porsiBalita) + (anak * porsiAnak));
            System.out.println(totalPorsi + " porsi");
        }


    }
}


