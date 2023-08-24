package ft1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("kalimat : ");
        String n = scanner.nextLine();

        String[] arrA = n.split(" ");
        Arrays.sort(arrA);

        for (int i = 0; i < arrA.length; i++) {
            System.out.println(arrA[i]);

        }
    }
}
