package day4;
import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("Masukkan Qoutes : ");
        String Qoutes = input.nextLine();
        System.out.println("Masukkan Repeat : ");

        int n = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(nama +" say, " + Qoutes);


        }


    }
}
