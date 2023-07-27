package day1.latihan;

import java.util.Scanner;

public class Soal13 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Berapakah harga beli: ");
        String x = input.nextLine();//3000
        System.out.println("Berapakah harga jual: ");
        String y = input.nextLine();//6000
        double hasil= ((Double.parseDouble(y)-Double.parseDouble(x))/Double.parseDouble(x))*100;//6000-3000=3000/3000=1*100=100
        System.out.println("Total keuntungan pedagang ialah: " +hasil+"%");
    }
}
