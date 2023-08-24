package ft1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        int n = scanner.nextInt();

        System.out.print("X = ");
        int x = scanner.nextInt();

        int tampung = 0;

        int hasil = n/x ;
        System.out.println("lembar ke-"+hasil);

    }
}
