package latihanB;

import java.util.Scanner;

public class SoalChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang bilangan: ");
        int panjang = scanner.nextInt();

        int bil = 3;
        for (int i = 0; i < panjang; i++) {
            if((i+1)%4 == 0){
                System.out.print("* ");
                continue;
            }
            System.out.print(bil + " ");
            bil += 3;
        }
    }
}
