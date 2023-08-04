package latihanA;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        String botol="botol", gelas="gelas", cangkir="cangkir", teko="teko";
        Scanner scanner = new Scanner(System.in);

        System.out.println("mau konversi apa: ");
        String input = scanner.nextLine(); //1 botol

        String[] arrInput = input.split(" ");// {1,botol}


        double jumlah = Integer.parseInt(arrInput[0]);//{1}

        if (arrInput[1].equalsIgnoreCase(botol)){//{botol}

            // botol ==
            double hasilGelas = jumlah*2;
            System.out.println(hasilGelas + " gelas");
            double hasilCangkir = jumlah*5;
            System.out.println(hasilCangkir + " cangkir");
            double hasilTeko = jumlah/5;
            System.out.println(hasilTeko + " teko");

        } else if (arrInput[1].equalsIgnoreCase(teko)) {

            // teko ==
            double hasilGelas = jumlah*10;
            System.out.println(hasilGelas + " gelas");
            double hasilCangkir = jumlah*25;
            System.out.println(hasilCangkir + " cangkir");
            double hasilBotol = jumlah*5;
            System.out.println(hasilBotol + " botol");

        } else if (arrInput[1].equalsIgnoreCase(gelas)) {

            // gelas ==
            double hasilTeko = jumlah/10;
            System.out.println(hasilTeko + " teko");
            double hasilCangkir = jumlah*2.5;
            System.out.println(hasilCangkir + " cangkir");
            double hasilBotol = jumlah/2;
            System.out.println(hasilBotol + " botol");

        } else if (arrInput[1].equalsIgnoreCase(cangkir)) {

            // cangkir ==
            double hasilTeko = jumlah/25;
            System.out.println(hasilTeko + " teko");
            double hasilGelas = jumlah/2.5;
            System.out.println(hasilGelas + " gelas");
            double hasilBotol = jumlah/5;
            System.out.println(hasilBotol + " botol");

        }else {
            System.out.println("konversi tidak tersedia");
        }

    }
}
