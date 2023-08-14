package simulasi;

import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("nilai a dan b: ");
        int a = scanner.nextInt();
        
        int b = a;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += b;
        }

    }

}
