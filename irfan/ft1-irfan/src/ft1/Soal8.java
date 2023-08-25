package ft1;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pola : ");
        int pola = scanner.nextInt();

        System.out.print("action : ");
        String action = scanner.nextLine();

        int a = 0;

        for (int i = 0; i < pola; i++) {

            System.out.print(a);

            a = a+4;


        }

    }
}
