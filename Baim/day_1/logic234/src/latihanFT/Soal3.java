package latihanFT;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan x: ");
        int bilangan = scanner.nextInt();

        int bil1 = 1;
        int bil2 = 1;

        while(bil1 < bilangan){
            if(bil1%2 == 1){
                System.out.println(bil1 + ", ");
            }

            int nextStep = bil1 + bil2;
            bil1 = bil2;
            bil2 = nextStep;
        }
    }
}
