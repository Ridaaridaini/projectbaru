package teknologi;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double hasil = 0;
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("pilih operasi: ");
        int operasi = scanner.nextInt();

        System.out.print("A: ");
        double a = scanner.nextInt();
        System.out.print("B: ");
        double b = scanner.nextInt();

        if (operasi == 1){
            // penjumlahan
            hasil = a + b;
        } else if (operasi == 2) {
            // pengurangan
            hasil = a - b;
        } else if (operasi == 3) {
            hasil = a * b;
        } else if (operasi == 4) {
            if( b == 0){
                System.out.println("Error bang!!");
                System.exit(402 );
            }
            hasil = a/b;

        }

        System.out.println("hasil: " + hasil);

    }

}
