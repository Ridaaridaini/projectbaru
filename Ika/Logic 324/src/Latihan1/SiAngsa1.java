package Latihan1;

import java.util.Scanner;

public class SiAngsa1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan n : ");
        int n = scanner.nextInt();
        int lock=100;
        int start=lock;
        int count=0;

        while (count<n){
            for (;start>10;){
                String arsStart = start+"";
                String[] arrStart = arsStart.split("");
                int jumlah=0;
                for (int i = 0; i < arsStart.length(); i++) {
                    int angka = Integer.parseInt(arrStart[i]);
                    int hasilKuadrat = angka*angka;
                    jumlah = jumlah + hasilKuadrat;
                }
                if(jumlah==1){
                    System.out.println(lock + " adalah si angsa 1");
                    count++;
                    lock++;
                    start=lock;
                    break;
                } else if (jumlah<10) {
                    lock++;
                    start=lock;
                    break;
                }
                start=jumlah;
                if(jumlah==10){
                    System.out.println(lock + " adalah si angsa 10");
                    count++;
                    lock++;
                    start=lock;
                    break;
                }
            }
        }

    }
}
