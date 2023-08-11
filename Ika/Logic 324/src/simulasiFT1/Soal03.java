package simulasiFT1;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        //Berapa banyak angka fibonacci selain nol dibawah x yang merupakan bilangan ganjil?
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret fibonaci: ");
        int x = scanner.nextInt();

        int sesudah =0;
        int sebelum =1;
        int fibbonaci = 0;
        int chek =0;

        int[] hasil= new int[x];
        for (int i = 0; i < x; i++) {
            fibbonaci = sesudah+sebelum;
            sebelum=sesudah;
            sesudah=fibbonaci;
            hasil[i] = fibbonaci;

            if(fibbonaci > x){
                break;
            }
            if(fibbonaci %2 !=0){
                chek=chek + 1;
                System.out.print(fibbonaci + " ");
            }

//            System.out.print(fibbonaci + " ");
        }

        System.out.println();
        for (int i = 0; i < x; i++) {
            if(hasil[i]>x){
                break;
            }
            System.out.print(hasil[i] + " ");
        }


    }

}
