package day6.latihan;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String kalimat2 = "";
        String[] pecahHuruf = kalimat.split("");

        for (int i = pecahHuruf.length-1; i >=0 ; i--) {
            kalimat2 = kalimat2 +pecahHuruf[i];
            System.out.println(kalimat2);
        }
        System.out.println(kalimat2);
        if(kalimat.equals(kalimat2)){
            System.out.println("Kata Polidrom");
        }else {
            System.out.println("bukan kalimat polidrom");
        }
    }
}
