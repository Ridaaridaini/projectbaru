package day10;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Record penjualan: ");
        String penjualan = scanner.nextLine();

        String z="";
        int sum = 0;
        String apel="apel";
        String jeruk="jeruk";
        String Mangga="mangga";
        String Pisang ="pisang";
        int jumApel = 0;
        int jumJeruk =0;
        int jumMangga =0;
        int jumPisang =0;

        String[] arrPenjualan = penjualan.replace(" ", "").split(",");
        for (int i = 0; i < arrPenjualan.length; i++) {
            String[] arrSplit =arrPenjualan[i].split(":");
                if(arrSplit[0].equalsIgnoreCase(apel)){
                    jumApel=jumApel+Integer.parseInt(arrSplit[1]);
                }else if (arrSplit[0].equalsIgnoreCase(jeruk)){
                    jumJeruk=jumJeruk+Integer.parseInt(arrSplit[1]);
                } else if (arrSplit[0].equalsIgnoreCase(Mangga)) {
                    jumMangga = jumMangga + Integer.parseInt(arrSplit[1]);
                } else if(arrSplit[0].equalsIgnoreCase(Pisang)){
                    jumPisang = jumPisang + Integer.parseInt(arrSplit[1]);
                }

        }
        System.out.println("apel " + jumApel);
        System.out.println("jeruk " + jumJeruk);
        System.out.println("Mangga " + jumMangga);
        System.out.println("Pisang " + jumPisang);



    }
}
