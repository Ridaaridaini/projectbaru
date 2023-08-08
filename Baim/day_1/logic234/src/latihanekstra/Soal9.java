package latihanekstra;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int batas = scanner.nextInt();

        int deretFibo = 1;
        int bil1 = 1;
        int bil2 = 1;

        while (batas > bil1) {
            if(bil1%2 == 0){
                System.out.print(bil1 + " ");
            }
            

            int nextStep = bil1 + bil2;
            bil1 = bil2;
            bil2 = nextStep;
        }
    }
}
