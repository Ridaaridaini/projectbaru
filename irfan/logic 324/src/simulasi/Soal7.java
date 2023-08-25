package simulasi;

import java.util.Scanner;

public class Soal7 {
    public static void main(String[] args) {
        float n,m;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n : ");
        n = scanner.nextFloat();

        System.out.print("Input m : ");
        m = scanner.nextFloat();


        float volume = n * n ;

        float rusuk = 6 * (m * m);

        float hasil = rusuk / volume ;
        System.out.print("hasil "+ hasil);
    }
}
