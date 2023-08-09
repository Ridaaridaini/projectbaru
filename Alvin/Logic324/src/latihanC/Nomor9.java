package latihanC;

import java.util.Scanner;

public class Nomor9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();

        int[] arrFibonacci = new int[x];

        for (int i = 0; i < x; i++) {
            if (i == 0){
                arrFibonacci[i] = 0;
                continue;
            }
            if (i == 1){
                arrFibonacci[i] = 1;
                continue;
            }

            arrFibonacci[i] = arrFibonacci[i-1] + arrFibonacci[i-2];
        }

        String hasil = "";
        for (int i = 0; i < arrFibonacci.length; i++) {
            if (arrFibonacci[i] > 0 && arrFibonacci[i]%2 == 0){
                hasil += arrFibonacci[i] + " ";
            }
        }

        String[] arrStrFiboGenap = hasil.trim().split(" ");
        int[] count = new int[arrStrFiboGenap.length];

        for (int i = 0; i < arrStrFiboGenap.length; i++) {
            count[i] = Integer.parseInt(arrStrFiboGenap[i]);
        }
        System.out.println(count.length);

    }

}
