package Extra;

import java.util.Scanner;

public class Looping1 {
    public static void main(String[] args) {

        int a = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka = ");
        int input = scanner.nextInt();

        for (int i = 0; i < input-1; i++) {
            if( i % 3 == 2){
                System.out.print("* ");
            } else if( i % 3 == 1){

            }
            System.out.print(a+ " ");

            a = a * 4;

        }

    }
}
