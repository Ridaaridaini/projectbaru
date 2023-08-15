package mendalamiLatihanLogic;

import java.util.Scanner;

public class SortingTanpaFungsi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        String[] angka = scanner.nextLine().trim().split(" ");
        int[] arrAngka = new int[angka.length];

        for (int i = 0; i < angka.length; i++) {
            arrAngka[i] = Integer.parseInt(angka[i]);
        }
        int temp = 0;
        for (int i = 0; i < arrAngka.length; i++) {
            for (int j = 0; j < arrAngka.length; j++) {
                if (arrAngka[i] < arrAngka[j]){
                    temp = arrAngka[i];
                    arrAngka[i] = arrAngka[j];
                    arrAngka[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrAngka.length; i++) {
            System.out.print(arrAngka[i] + " ");
        }

    }

}
