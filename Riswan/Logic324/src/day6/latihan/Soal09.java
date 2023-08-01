package day6.latihan;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");
        String kalimat1 = input.nextLine();
        System.out.print("kalimat1 : ");
        String kalimat2 = input.nextLine();
        int posisi=0;
        String[] kata2 = kalimat2.split("");
        for (int i = 0; i < kata2.length; i++) {
            if (kalimat1.contains(kata2[i]) ==true){
                System.out.println("yes");
                break;
            }posisi = i + 1;
        }
        if(posisi == kata2.length){
            System.out.println("No");
        }
    }
}
