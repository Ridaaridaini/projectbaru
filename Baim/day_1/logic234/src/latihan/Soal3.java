package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program konversi");
        System.out.println("1. Cangkir");
        System.out.println("2. Gelas");
        System.out.println("3. Botol");
        System.out.println("4. Teko");
        System.out.print("Masukkan Pilihan anda: ");
        int input = scanner.nextInt();
        System.out.println("");
        System.out.println("Konversi ke");
        System.out.println("1. Cangkir");
        System.out.println("2. Gelas");
        System.out.println("3. Botol");
        System.out.println("4. Teko");
        System.out.print("Masukkan Pilihan anda");
        int input2 = scanner.nextInt();

        float gelas = 0;
        float cangkir = 0;
        float botol = 0;
        float teko = 0;

        switch (input) {
            case 1:
                if (input2 == 1) {
                    System.out.println("1 cangkir = " + 1 + " cangkir");
                }
                if (input2 == 2) {
                    gelas = 1 / 2.5f;
                    System.out.println("1 cangkir = " + gelas + " gelas");
                }
                if (input2 == 3) {
                    botol = 1 / 5f;
                    System.out.println("1 cangkir = " + botol + " botol");
                }
                if (input2 == 4) {
                    teko = 1 / 25f;
                    System.out.println("1 cangkir = " + teko + " teko");
                }
                break;

            case 2:
                if (input2 == 1) {
                    cangkir = 1 * 2.5f;
                    System.out.println("1 gelas = " + cangkir + " Cangkir");
                }
                if (input2 == 2) {
                    System.out.println("1 gelas = " + 1 + " gelas");
                }
                if (input2 == 3) {
                    botol = 1 / 2f;
                    System.out.println("1 gelas = " + botol + " botol");
                }
                if (input2 == 4) {
                    teko = 1 / 10f;
                    System.out.println("1 gelas = " + teko + " teko");
                }
                break;

            case 3:
                if (input2 == 1) {
                    cangkir = 1 * 2.5f;
                    System.out.println("1 botol = " + cangkir + " Cangkir");
                }
                if (input2 == 2) {
                    System.out.println("1 botol = " + 1 + " gelas");
                }
                if (input2 == 3) {
                    botol = 1 / 2f;
                    System.out.println("1 botol = " + botol + " botol");
                }
                if (input2 == 4) {
                    teko = 1 / 10f;
                    System.out.println("1 botol = " + teko + " teko");
                }
                break;
            default:
                break;
        }

    }
}
