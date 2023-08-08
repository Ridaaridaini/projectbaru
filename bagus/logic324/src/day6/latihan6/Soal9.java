package day6.latihan6;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        boolean cek = false;
        Scanner input = new Scanner(System.in);

        System.out.println("masukan kata pertama: ");
        String kataSatu = input.nextLine();
        String[] kataSatuSplit = kataSatu.split("");

        System.out.println("masukan kata kedua: ");
        String kataDua = input.nextLine();

        String banding = "";
        String banding2 = "";

        String[] kataDuaSplit = kataDua.split("");
        for (int i = 0; i < kataDuaSplit.length; i++) {
            for (int j = 0; j < kataSatuSplit.length; j++) {
                if (kataDuaSplit[i].contains(kataSatuSplit[j])) {
                    cek = true;
                }
            }
        }
        if (cek){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }

}

