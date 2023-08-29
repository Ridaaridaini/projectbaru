package simulasi;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("inputan n : ");
        int n = scanner.nextInt();

        System.out.print("inputan A dan B : ");
        int a = scanner.nextInt();

         b = a;

        for (int i = 0; i < n; i++) {

            System.out.print(a+" ");

            a = a + b;
        }
    }
}
