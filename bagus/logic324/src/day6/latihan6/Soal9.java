package day6.latihan6;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("masukan kata pertama: ");
        String kataSatu = input.nextLine();
        String[] kataSatuSplit = kataSatu.split("");

        System.out.println("masukan kata kedua: ");
        String kataDua = input.nextLine();
        String[] kataDuaSplit = kataDua.split("");

        String bandingBandingke = "";
        String bandingBandingke1 = "";

        for (int i = 0; i < kataSatuSplit.length; i++) {
            for (int j = 0; j < kataSatuSplit.length; j++) {
                bandingBandingke = kataSatuSplit[i];
                bandingBandingke1 = kataDuaSplit[i];



//                if (kataSatuSplit[i].equals(kataDuaSplit[i])) {
//                    System.out.println("Yes");
//                } else {
//                    System.out.println("No");
//                }
            }
            System.out.print(bandingBandingke);

            System.out.print(bandingBandingke1);
        }
    }
}
