package simulasi;

import java.util.Arrays;
import java.util.Scanner;

public class Soal03Remake {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int deret = scanner.nextInt();
        int[] arrFib = new int[deret];

        for (int i = 0; i < deret; i++) {
            if (i == 0){
                arrFib[i] = 1;
                continue;
            }
            if (i == 1){
                arrFib[i] = 1;
                continue;
            }

            arrFib[i] = arrFib[i-1] + arrFib[i-2];
        }

        String strFibGanjil = "";

        for (int i = 0; i < arrFib.length; i++) {
            if (arrFib[i] % 2 != 0 && arrFib[i] <= deret){
                strFibGanjil += arrFib[i] + " ";
            }
        }

        String[] fibGanjilStr = strFibGanjil.trim().split(" ");
        int[] arrFibGanjil = new int[fibGanjilStr.length];

        for (int i = 0; i < fibGanjilStr.length; i++) {
            arrFibGanjil[i] = Integer.parseInt(fibGanjilStr[i]);
            System.out.print(arrFibGanjil[i] + " ");
        }

        System.out.println();
        System.out.println("jumlah: " + arrFibGanjil.length);



    }

}
