package PR;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {

        int a = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai = ");
        int input = scanner.nextInt(); // 5

        for (int i = 0; i < input; i++) { // i = 0 1 2 3 4 5
            if (i % 2 == 1) { // 1.false  2.true 3.false 4.true 5.false
                System.out.print("*  "); //2 * 6 * 10
            } else {
                System.out.print(a + "  "); //2 6 10
                a = a + 4; // 6 10 14
            }
        }
    }
}




