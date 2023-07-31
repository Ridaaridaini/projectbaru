package day5.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] element = {3,2,1,5,8};
        int cari = 0;
        int posisi = 0;
        System.out.print("Nilai yang dicari : ");
        cari = input.nextInt();

        for (int i = 0; i < element.length; i++) {
            if(element[i] == cari){
                System.out.println("nilai " + cari + " ada dalam deret di posisi : "+ i);
                break;
            }
            posisi = i + 1;
        }
        if(posisi == element.length){
            System.out.println("Nilai : " + cari + " tidak ada");
        }
    }
}
