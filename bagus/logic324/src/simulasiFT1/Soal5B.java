package simulasiFT1;

import java.util.Scanner;

public class Soal5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan duit: ");
        int duit = input.nextInt();

        int hargaCoklat = 3000;
        int coklat = 0;
        int stampel = 0;

        while (duit >= hargaCoklat){
            if (duit < 15000){
                duit = duit - hargaCoklat;
                coklat = coklat + 1;
                stampel = stampel + 1;
            }
            if (duit >= 15000){
                duit = duit - 15000;
                coklat = coklat + 5;
                stampel = stampel + 6;
            }

            if (stampel >= 5){
                coklat = coklat + 1;
                stampel = stampel - 5;
            }
        }

        int totalCoklat = coklat;
        int totalStampel = stampel;
        System.out.println("Dapet coklat= "+totalCoklat +" stampel: "+totalStampel);
    }
}
