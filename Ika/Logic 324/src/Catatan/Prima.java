package Catatan;

import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n = scanner.nextInt();

        int[] arrPrima = new int[n];

        int bil =2;
        int i=0;
        while (i<arrPrima.length){
            int chek =0;
            for (int j = 2; j <= bil; j++) {
                if(bil%j==0){
                    chek=chek+1;
                }
            }
            if(chek==1){
                arrPrima[i]=bil;
                i++;
            }
            bil++;
        }


        for (int j = 0; j < arrPrima.length; j++) {
            System.out.print(arrPrima[j] + " ");
        }


    }
}
