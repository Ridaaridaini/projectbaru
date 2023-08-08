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
        System.out.print("Masukkan Pilihan anda: ");
        int input2 = scanner.nextInt();

        double hasil = 0;

        if (input == 1 && input2 == 2) {
            System.out.print("Masukkan jumlah cangkir: ");
            double cangkir = scanner.nextDouble();
            hasil = cangkir * 2.5;
            System.out.println(cangkir + " cangkir sama dengan " + hasil + " gelas.");
        } else if (input == 1 && input2 == 3) {
            System.out.print("Masukkan jumlah cangkir: ");
            double cangkir = scanner.nextDouble();
            hasil = cangkir * 0.1;
            System.out.println(cangkir + " cangkir sama dengan " + hasil + " botol.");
        } else if (input == 1 && input2 == 4) {
            System.out.print("Masukkan jumlah cangkir: ");
            double cangkir = scanner.nextDouble();
            hasil = cangkir * 0.04;
            System.out.println(cangkir + " cangkir sama dengan " + hasil + " teko.");
        } else if (input == 2 && input2 == 1) {
            System.out.print("Masukkan jumlah gelas: ");
            double gelas = scanner.nextDouble();
            hasil = gelas * 0.4;
            System.out.println(gelas + " gelas sama dengan " + hasil + " cangkir.");
        } else if (input == 2 && input2 == 3) {
            System.out.print("Masukkan jumlah gelas: ");
            double gelas = scanner.nextDouble();
            hasil = gelas * 0.04;
            System.out.println(gelas + " gelas sama dengan " + hasil + " botol.");
        } else if (input == 2 && input2 == 4) {
            System.out.print("Masukkan jumlah gelas: ");
            double gelas = scanner.nextDouble();
            hasil = gelas * 0.016;
            System.out.println(gelas + " gelas sama dengan " + hasil + " teko.");
        } else if (input == 3 && input2 == 1) {
            System.out.print("Masukkan jumlah botol: ");
            double botol = scanner.nextDouble();
            hasil = botol * 10;
            System.out.println(botol + " botol sama dengan " + hasil + " cangkir.");
        } else if (input == 3 && input2 == 2) {
            System.out.print("Masukkan jumlah botol: ");
            double botol = scanner.nextDouble();
            hasil = botol * 4;
            System.out.println(botol + " botol sama dengan " + hasil + " gelas.");
        } else if (input == 3 && input2 == 4) {
            System.out.print("Masukkan jumlah botol: ");
            double botol = scanner.nextDouble();
            hasil = botol * 0.4;
            System.out.println(botol + " botol sama dengan " + hasil + " teko.");
        } else if (input == 4 && input2 == 1) {
            System.out.print("Masukkan jumlah teko: ");
            double teko = scanner.nextDouble();
            hasil = teko * 100;
            System.out.println(teko + " teko sama dengan " + hasil + " cangkir.");
        } else if (input == 4 && input2 == 2) {
            System.out.print("Masukkan jumlah teko: ");
            double teko = scanner.nextDouble();
            hasil = teko * 40;
            System.out.println(teko + " teko sama dengan " + hasil + " gelas.");
        } else if (input == 4 && input2 == 3) {
            System.out.print("Masukkan jumlah teko: ");
            double teko = scanner.nextDouble();
            hasil = teko * 4;
            System.out.println(teko + " teko sama dengan " + hasil + " botol.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
