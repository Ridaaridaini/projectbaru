package Extra;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        int apel = 0, jeruk = 0, mangga = 0, pisang = 0;

        Scanner scanner = new Scanner(System.in);

        String[] arrBuah = scanner.nextLine().toLowerCase().split(",");

        for (int i = 0; i < arrBuah.length; i++) {
            String[] arrRecodPenjualan = arrBuah[i].split(":");

            if (arrRecodPenjualan[0].equalsIgnoreCase("apel")) {
                apel = apel + Integer.parseInt(arrRecodPenjualan[1]);
            }
            else if (arrRecodPenjualan[0].equalsIgnoreCase("jeruk")) {
                jeruk = jeruk + Integer.parseInt(arrRecodPenjualan[1]);
            }
            else if (arrRecodPenjualan[0].equalsIgnoreCase("mangga")) {
                mangga = mangga + Integer.parseInt(arrRecodPenjualan[1]);
            }
            else if (arrRecodPenjualan[0].equalsIgnoreCase("pisang")) {
                pisang = pisang + Integer.parseInt(arrRecodPenjualan[1]);
            }
        }
        System.out.println("Buah Apel = "+apel);
        System.out.println("Buah Jeruk = "+jeruk);
        System.out.println("Buah Mangga = "+mangga);
        System.out.println("Buah Pisang = "+pisang);
    }
}
