package day6.latihanday6;

import java.util.Scanner;

public class Soal09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kalimat 1 : ");
        String k1 = input.nextLine();

        System.out.print("Kalimat 2 : ");
        String k2 = input.nextLine();


        //salah satu di split
        String[] arrK2 = k2.split("");

        String bantu = "";
        //boolean cek = k1.contains(bantu);

        for (int i = 0; i < arrK2.length; i++) {
            bantu = bantu + arrK2[i];

        }if (k1.contains(bantu)) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}





