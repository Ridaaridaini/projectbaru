package simulasi;

import java.util.Scanner;

public class FEB {

    public static void main(String[] args) {

        int FEB = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        int min = Math.min(a, b);

        int i = 1;

        while (i <= min){
            if (a % i == 0 && b % i == 0){

                FEB = i;

            }
            i++;
        }

        System.out.print("FEB: " + FEB);

    }

}
