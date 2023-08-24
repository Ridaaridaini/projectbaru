package rumus;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedianModus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlah = 0;

        System.out.println("input : ");
        String[] angkaStr = input.nextLine().split(" ");
        double[] angka = new double[angkaStr.length];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = Integer.parseInt(angkaStr[i]);
        }
        //mean
        for (int i = 0; i < angka.length; i++) {
            jumlah = jumlah + angka[i];
            if(i+1== angka.length){
                jumlah=jumlah / (angka.length);
            }
        }
        System.out.println("mean : "+jumlah);
        Arrays.sort(angka);
        if(angka.length%2 == 0){
            System.out.println("median : "+(angka[angka.length/2]+angka[angka.length/2-1])/2);
        }else {
            System.out.println("median : "+angka[angka.length/2]);
        }
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9 - i; j++) {
//                if (angka[j] > angka[j + 1]) {
//                    double n = angka[j];
//                    angka[j] = angka[j + 1];
//                    angka[j + 1] = n;}}}
        double jumlahangka = 0;
        double jumlahmodus = 0;
        double modus = 0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length; j++) {
                if (angka[j] == angka[i] && j != i) {
                    jumlahangka++;}}
            if (jumlahangka >= jumlahmodus) {
                jumlahmodus = jumlahangka;
                modus = angka[i];
                jumlahangka = 0;}}
        System.out.println("Modus  : " + modus);
    }
}
