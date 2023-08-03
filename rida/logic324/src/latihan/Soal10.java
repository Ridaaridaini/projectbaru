package latihan;

import java.util.Scanner;

public class Soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang deret: ");
        Integer n= input.nextInt();
        Integer[] deret1= new Integer[n];
        Integer[] deret2= new Integer[n];
        int a=0;
        System.out.print("Deret Genap: ");
        for (int i = 0; i < n; i++) {
            if (a % 2 ==0){
                deret1[i]=a;
                System.out.print(deret1[i]+" ");
                a=a+2;
            }
            continue;
        }
        System.out.println();
        int b=1;
        System.out.print("Deret Ganjil: ");
        for (int i = 0; i < n; i++) {
            if (b % 2 ==1){
                deret2[i]=b;
                System.out.print(deret2[i]+" ");
                b=b+2;
            }
            continue;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i==n-1){
                System.out.print(deret1[i]+" + "+deret2[i]);
                break;
            }
            System.out.print(deret1[i]+" + "+deret2[i]+"; ");

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int sum;
            if (i==(n-1)){
                sum= deret1[i]+ deret2[i];
                System.out.print(+sum );
                break;
            }
            sum= deret1[i]+ deret2[i];
            System.out.print(sum +", ");

        }

    }
}
