package catatanFT;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan panjang deret n");
        Integer n= input.nextInt();
        Integer[] deret= new Integer[n];
        int a=2;
        for (int i = 0; i < deret.length; ) {
            int cekprima=0;
            for (int j = 2; j <= a; j++) {
                if (a%j==0){
                    cekprima=cekprima+1;
                }

            }
            if (cekprima==1){
                deret[i]=a;
                System.out.println(deret[i]);
                i++;
            }
            a++;
        }

    }
}
