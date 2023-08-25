package ft1;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        // Buatlah format penjumlahan seperti contoh di bawah ini,

        // Input: n (deret angka)
        // Output: penjumlahan seperti contoh
        // Constraint: angka bisa berupa bilangan bulat positif, bilangan bulat negatif,
        // ataupun desimal
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka yang dijumlahkan:");
        String[] angkaStr = scanner.nextLine().split(" ");
        int[] angka = new int[angkaStr.length];

        for (int i = 0; i < angkaStr.length; i++) {
            angka[i] = Integer.parseInt(angkaStr[i]);
        }

        int bilanganBantu = 0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j!=0){
                    System.out.print(" + ");
                }
                System.out.print(angka[j]);
                bilanganBantu += angka[j];
            }
            System.out.print(" = " + bilanganBantu);
            System.out.println();
            bilanganBantu = 0;
        }

    }
}
