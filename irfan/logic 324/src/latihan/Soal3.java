package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Konversi satuan
        int botolPerGelas = 2;
        int tekoPerCangkir = 25;
        double gelasPerCangkir = 2.5;

        // Input pilihan konversi
        System.out.println("Pilih konversi:");
        System.out.println("1. Botol ke cangkir");
        System.out.println("2. Botol ke gelas");
        System.out.println("3. Botol ke teko");
        System.out.println();

        System.out.println("4. gelas ke botol");
        System.out.println("5. gelas ke cangkir");
        System.out.println("6. gelas ke teko");
        System.out.println();

        System.out.println("7. Teko ke cangkir");
        System.out.println("8. Teko ke gelas");
        System.out.println("9. Teko ke botol");
        System.out.println();

        System.out.println("10. cangkir ke botol");
        System.out.println("11. cangkir ke gelas");
        System.out.println("12. cangkir ke Teko");
        System.out.println();

        int pilihan = scanner.nextInt();   // 1 // 7 // 8

        // Proses konversi
        if (pilihan == 1) {
            System.out.print("Masukkan jumlah botol: ");
            int jumlahBotol = scanner.nextInt();  // 1 botol
            double jumlahCangkir = jumlahBotol * botolPerGelas * gelasPerCangkir; // 1 * 2 * 2,5 = 5
            System.out.println(jumlahBotol + " botol = " + jumlahCangkir + " cangkir");  // 1 botol = 5 cangkir
        } else if (pilihan == 2) {
            System.out.print("Masukkan jumlah Botol: ");
            int jumlahGelas = scanner.nextInt();
            int jumlahGelas2 = jumlahGelas * botolPerGelas;
            System.out.println(jumlahGelas + " botol = " + jumlahGelas2 + " gelas");
        } else if (pilihan == 3) {
            System.out.print("Masukkan jumlah botol: ");
            int jumlahBotol2 = scanner.nextInt();
            double jumlahGelas = jumlahBotol2 * botolPerGelas * tekoPerCangkir / gelasPerCangkir;
            System.out.println(jumlahBotol2 + " botol = " + jumlahGelas + " teko");


        } else if (pilihan == 4) {
            System.out.print("Masukkan jumlah Gelas: ");
            int jumlahGelas = scanner.nextInt();
            int jumlahGelas2 = jumlahGelas * botolPerGelas;
            System.out.println(jumlahGelas + " Gelas = " + botolPerGelas + " botol");
        } else if (pilihan == 5) {
            System.out.print("Masukkan jumlah Gelas: ");
            int jumlahGelas2 = scanner.nextInt();
            double jumlahGelas3 = jumlahGelas2 * gelasPerCangkir;
            System.out.println(jumlahGelas2 + " Gelas = " + jumlahGelas3 + " cangkir");
        } else if (pilihan == 6) {
            System.out.print("Masukkan jumlah Gelas: ");
            int jumlahGelas3 = scanner.nextInt();
            double jumlahGelas = jumlahGelas3 * gelasPerCangkir / tekoPerCangkir;
            System.out.println(jumlahGelas3 + " Gelas = " + jumlahGelas + " Teko");


        } else if (pilihan == 7) {
            System.out.print("Masukkan jumlah Teko: ");
            int jumlahTeko = scanner.nextInt();  // 1
            int jumlahCangkir = jumlahTeko * tekoPerCangkir;  // 1 * 25 = 25
            System.out.println(jumlahTeko + " Teko = " + jumlahCangkir + " cangkir");
        } else if (pilihan == 8) {
            System.out.print("Masukkan jumlah Teko: ");
            int jumlahTeko = scanner.nextInt();  // 1
            double jumlahGelas = (jumlahTeko * tekoPerCangkir) / gelasPerCangkir;  // 25 / 2,5 = 10
            System.out.println(jumlahTeko + " teko = " + jumlahGelas + " gelas"); // 1 teko = 10 gelas
        } else if (pilihan == 9) {
            System.out.print("Masukkan jumlah Teko: ");
            int jumlahTeko= scanner.nextInt();
            double jumlahBotol = jumlahTeko * tekoPerCangkir * botolPerGelas / gelasPerCangkir;
            System.out.println(jumlahTeko + " Teko = " + jumlahBotol + " botol");

        }else if (pilihan == 10) {
                System.out.print("Masukkan jumlah cangkir: ");
                int jumlahCangkir= scanner.nextInt();
                double jumlahBotol2 = (jumlahCangkir * botolPerGelas) / gelasPerCangkir;;
                System.out.println(jumlahBotol2 + " cangkir = " + jumlahBotol2 + " botol");
         } else if (pilihan == 11) {
             System.out.print("Masukkan jumlah cangkir: ");
             double jumlahCangkir = scanner.nextDouble();
             double jumlahGelas = jumlahCangkir / gelasPerCangkir;
             System.out.println(jumlahCangkir + " cangkir = " + jumlahGelas + " gelas");
         }else if (pilihan == 12) {
             System.out.print("Masukkan jumlah cangkir: ");
             int jumlahCangkir = scanner.nextInt();
             double jumlahCangkir2= (jumlahCangkir * gelasPerCangkir) / tekoPerCangkir;
             System.out.println(jumlahCangkir + " cangkir = " + jumlahCangkir2+ " Teko");

            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }

