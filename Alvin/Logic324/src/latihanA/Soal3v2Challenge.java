package latihanA;

import java.util.Scanner;

public class Soal3v2Challenge {

    public static void main(String[] args) {

        String botol="botol", gelas="gelas", cangkir="cangkir", teko="teko";
        Scanner scanner = new Scanner(System.in);

        String[] input1 = scanner.nextLine().split(" ");
        String input2 = scanner.nextLine();

        int jumlah = Integer.parseInt(input1[0]);



        if (input1[1].equalsIgnoreCase(botol)){

            // botol ==
            if (input2.equalsIgnoreCase(gelas)){
                int hasilGelas = 2*jumlah;
                System.out.println(hasilGelas + " gelas");
            } else if (input2.equalsIgnoreCase(cangkir)) {
                int hasilCangkir = 5*jumlah;
                System.out.println(hasilCangkir + " cangkir");
            } else if (input2.equalsIgnoreCase(teko) ) {
                double hasilTeko = 0.2*(double)jumlah;
                System.out.println(hasilTeko + " teko");
            }

        } else if (input1[1].equalsIgnoreCase(teko)) {

            // teko ==
            if (input2.equalsIgnoreCase(gelas)){
                int hasilGelas = 10*jumlah;
                System.out.println(hasilGelas + " gelas");
            } else if (input2.equalsIgnoreCase(cangkir)) {
                int hasilCangkir = 25*jumlah;
                System.out.println(hasilCangkir + " cangkir");
            } else if (input2.equalsIgnoreCase(botol)) {
                int hasilBotol = 5*jumlah;
                System.out.println(hasilBotol + " botol");
            }
        } else if (input1[1].equalsIgnoreCase(gelas)) {

            // gelas ==
            if (input2.equalsIgnoreCase(teko)) {
                double hasilTeko = 0.1*(double)jumlah;
                System.out.println(hasilTeko + " teko");
            } else if (input2.equalsIgnoreCase(cangkir)) {
                double hasilCangkir = 2.5*(double)jumlah;
                System.out.println(hasilCangkir + " cangkir");
            } else if (input2.equalsIgnoreCase(botol)) {
                double hasilBotol = 0.5*jumlah;
                System.out.println(hasilBotol + " botol");
            }
        } else if (input1[1].equalsIgnoreCase(cangkir)) {

            // cangkir ==

            if (input2.equalsIgnoreCase(teko)){
                double hasilTeko = 0.04*(double)jumlah;
                System.out.println(hasilTeko + " teko");
            } else if (input2.equalsIgnoreCase(gelas)) {
                double hasilGelas = 0.4*(double)jumlah;
                System.out.println(hasilGelas + " gelas");
            }else if (input2.equalsIgnoreCase(botol)){
                double hasilBotol = 0.2*(double)jumlah;
                System.out.println(hasilBotol + " botol");
            }
        }else {
            System.out.println("anda di luar nalar!");
        }

    }

}
