package day10;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Soal09Fib {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang fib: ");
        int x = scanner.nextInt();

        int[] fib = new int[x];
        int sesudah =1;
        int sebelum =0;
        int fibonaci =1;
        int chek=0;
        for (int i = 0; i < x; i++) {
            System.out.print(fibonaci + " ");
            fibonaci =sesudah+sebelum;
            sebelum=sesudah;
            sesudah=fibonaci;
            if(fibonaci>x){
                break;
            }

            if(fibonaci%2==0){
                chek=chek+1;
            }
        }
        System.out.println();
        System.out.println("banyak bilangan genap dibawah " + x + " ada " + chek);



//        fib[0] =1;
//        fib[1]=1;
//        for (int i = 2; i < x; i++) {
//            fib[i] = fib[i-2] + fib[i-1];
//        }
//
//        int chek =0;
//        for (int i = 0; i < x; i++) {
//            System.out.print(fib[i] + " ");
//            if(fib[i] % 2==0){
//                chek=chek+1;
//            }
//        }
//        System.out.println();
//        System.out.println("banyak bilangan genap fibbonaci " + chek);


    }
}
