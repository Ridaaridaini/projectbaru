package day9;

import java.util.Scanner;

public class deretBilanganPrima {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int n=scanner.nextInt();

        //prima
        int[] arrPrima= new int[n];
        int a=2;//bilangan yang di chek
        for (int i = 0; i < arrPrima.length; ) {//i++ dihulangkan untuk berapa bilangan prima yang udah didapatkan
            //cek prima sebagai penampung untuk chek ada berapa angka yang habis dibagi oleh dirinya sendiri dan angkaya yang lain
            int cekPrima =0;
            for (int j = 1; j <=a ; j++) {
                if( a % j == 0){
                    cekPrima=cekPrima+1;
                }
            }
            if(cekPrima==2){
                arrPrima[i]=a;
                System.out.print(a + " ");
                i++;
            }
            a++;
        }

    }
}



//misal a=2
//perulangan 1: apakah 2 habis dibagi 1
//perulangan 2: apakah habis dibagi 2
//--> 2 yang habis dibagi --> bilangan prima

//misal a=4
//perulangan 1: apakah 4 habis dibagi 1
//perulangan 2: apakah 4 habis dibagi 2
//perulangan 3 : apakah 4 habis dibagi 3
//perulangan 4: apakah 4 habis dibagi 4
//-->3 --bukan bilangan prima karena lebih dari 2 kali habis dibagi