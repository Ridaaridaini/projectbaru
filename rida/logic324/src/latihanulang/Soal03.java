package latihanulang;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("masukkan panjang deret \"Si angka 1\": ");
        Integer n= input.nextInt();
        Integer start=100, a=0, b=start;
        while (a<n){
            while(b>9) {
                String[] arrSplit =String.valueOf(b).split("");
                int tampung=0;
                for (int i = 0; i < arrSplit.length; i++) {
                    int angka=Integer.valueOf(arrSplit[i]);
                    tampung=tampung+(angka*angka);

                }
                if (tampung<=9){
                    if(tampung==1){
                        System.out.println(start+" adalah\"Si angka 1\"");
                        a=a+1;
                        start=start+1;
                        b=start;
                        break;
                    }
                    else{
                        start=start+1;
                        b=start;
                    }
                }
                if (tampung>9){
                    b=tampung;
                    continue;
                }

            }
        }
    }
}
