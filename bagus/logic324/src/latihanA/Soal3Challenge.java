package latihanA;

import java.util.Scanner;

public class Soal3Challenge {
    public static void main(String[] args) {
        String botol="botol", gelas="gelas", cangkir="cangkir", teko="teko";
        Scanner scanner = new Scanner(System.in);

        System.out.println("mau konversi apa: ");
        String input = scanner.nextLine(); //1 botol
        String[] arrInput = input.split(" ");// {1,botol}

        System.out.println("ke apa: ");
        String input2 = scanner.nextLine();
        String[] arrInput2 = input2.split(" ");


        double jumlah = Integer.parseInt(arrInput[0]);


        //dari botol
        if (arrInput[1].equalsIgnoreCase(botol) && arrInput2[0].equalsIgnoreCase(gelas)) {
            double hasilGelas = jumlah * 2;
            System.out.println(hasilGelas + " gelas");
        } else if (arrInput[1].equalsIgnoreCase(botol) && arrInput2[0].equalsIgnoreCase(cangkir)) {
            double hasilCangkir = jumlah*5;
            System.out.println(hasilCangkir + " cangkir");
        } else if (arrInput[1].equalsIgnoreCase(botol) && arrInput2[0].equalsIgnoreCase(teko)){
            double hasilTeko = jumlah/5;
            System.out.println(hasilTeko + " teko");

        }

        //dari teko
        if (arrInput[1].equalsIgnoreCase(teko) && arrInput2[0].equalsIgnoreCase(gelas)) {
            double hasilGelas = jumlah * 10;
            System.out.println(hasilGelas + " gelas");
        } else if (arrInput[1].equalsIgnoreCase(teko) && arrInput2[0].equalsIgnoreCase(cangkir)) {
            double hasilCangkir = jumlah*25;
            System.out.println(hasilCangkir + " cangkir");
        } else if (arrInput[1].equalsIgnoreCase(teko) && arrInput2[0].equalsIgnoreCase(botol)) {
            double hasilBotol = jumlah*5;
            System.out.println(hasilBotol + " botol");
        }

        //dari gelas
        if (arrInput[1].equalsIgnoreCase(gelas) && arrInput2[0].equalsIgnoreCase(teko)) {
            double hasilTeko = jumlah / 10;
            System.out.println(hasilTeko + " teko");
        } else if (arrInput[1].equalsIgnoreCase(gelas) && arrInput2[0].equalsIgnoreCase(cangkir)) {
            double hasilCangkir = jumlah*2.5;
            System.out.println(hasilCangkir + " cangkir");
        } else if (arrInput[1].equalsIgnoreCase(gelas) && arrInput2[0].equalsIgnoreCase(botol)) {
            double hasilBotol = jumlah/2;
            System.out.println(hasilBotol + " botol");
        }

        //dari cangkir
        if (arrInput[1].equalsIgnoreCase(cangkir) && arrInput2[0].equalsIgnoreCase(teko)) {
            double hasilTeko = jumlah / 25;
            System.out.println(hasilTeko + " teko");
        } else if (arrInput[1].equalsIgnoreCase(cangkir) && arrInput2[0].equalsIgnoreCase(gelas)) {
            double hasilGelas = jumlah/2.5;
            System.out.println(hasilGelas + " gelas");
        } else if (arrInput[1].equalsIgnoreCase(cangkir) && arrInput2[0].equalsIgnoreCase(botol)) {
            double hasilBotol = jumlah/5;
            System.out.println(hasilBotol + " botol");

        }
        else {
            System.out.println("konversi tidak tersedia");
        }

    }
}
