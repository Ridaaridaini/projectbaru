package latihan;

import java.util.Arrays;
import java.util.Scanner;

public class GanjilGenapChallange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka =");
        int n = input.nextInt();

        int i=0;

        if(n % 2 !=0){
            i = n;
        }else {
            i= n-1;
        }

        for (; i >= 1; i = i - 2) {
            System.out.print(i+ " ");
        }
        System.out.println();

        if(n % 2 ==0){
            i = n;
        }else {
            i= n-1;
        }

        for (; i >= 2; i = i - 2) {
            System.out.print(i + " ");
        }
    }
}
