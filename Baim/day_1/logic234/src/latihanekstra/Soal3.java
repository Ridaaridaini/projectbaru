package latihanekstra;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan record penjualan: ");
        String[] recordPenjualan = scanner.nextLine().replace(" ", "").split(",");
        String[] jumlahBuah;
        String[] namaBuah;
        int apel = 0;
        int jeruk = 0;
        int mangga = 0;
        int pisang = 0;


        for (int i = 0; i < recordPenjualan.length; i++) {
            String[] temp = recordPenjualan[i].split(":");

            if(temp[0].equalsIgnoreCase("apel")){apel += Integer.parseInt(temp[temp.length-1]);}
            if(temp[0].equalsIgnoreCase("jeruk")){jeruk += Integer.parseInt(temp[temp.length-1]);}
            if(temp[0].equalsIgnoreCase("mangga")){mangga += Integer.parseInt(temp[temp.length-1]);}
            if(temp[0].equalsIgnoreCase("pisang")){pisang += Integer.parseInt(temp[temp.length-1]);}
        }

        System.out.println("Apel: " + apel);
        System.out.println("Jeruk: " + jeruk);
        System.out.println("Mangga: " + mangga);
        System.out.println("Pisang: " + pisang);
        
        scanner.close();
    }
}
