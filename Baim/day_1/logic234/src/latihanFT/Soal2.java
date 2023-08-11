package latihanFT;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Uang: ");
        int uang = scanner.nextInt();

        boolean masihBisa = true;
        int point = 0;
        int sisaUang = 0;
        int coklat = 0;

        while(masihBisa){
            if(uang > 3000){
                coklat += uang/3000;
                uang -= (coklat*3000);
                point = coklat;
            } else if (uang < 3000){
                while(point >= 5){
                    point -= 5;
                    coklat += 1;
                }
                System.out.println("Coklat: " + coklat);
                System.out.println("Point: " + 1);
                masihBisa = false;
            }
        }
    }
}
