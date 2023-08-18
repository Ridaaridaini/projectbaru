package mendalamiLatihanLogic;

import java.util.Scanner;

public class SimNo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        String[] input = scanner.nextLine().split("");

        for (int i = input.length-1; i >= 0; i--) {
                for (int j = 0; j < input.length/2; j++) {
                    System.out.print("*");
                }
                System.out.print(input[i]);
                for (int j = 0; j < input.length/2; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }

    }

}
