package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil;
        System.out.print("Harga beli= ");
        Integer x= input.nextInt();
        System.out.print("Harga jual= ");
        Integer y= input.nextInt();
        hasil = ((Double.valueOf(y)-Double.valueOf(x))/Double.valueOf(x))*100;
        System.out.println("Total Keuntungan= "+hasil+"%");




    }
}
