package day6.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("kalimat : ");
        String kalimat = input.nextLine();
        String[] pecahHuruf = kalimat.split("");
        String cari = "";
        int posisi = 0;
        System.out.print("Nilai yang dicari : ");
        cari = input.nextLine();

        for (int i = 0; i < pecahHuruf.length; i++) {
            if(cari.equalsIgnoreCase(pecahHuruf[i])){
                System.out.println("nilai " + cari + " ada dalam kalimat di posisi : "+ i);
                break;
            }
            posisi = i + 1;
        }
        if(posisi == pecahHuruf.length){
            System.out.println("Nilai : " + cari + " tidak ada");
        }
    }
}
