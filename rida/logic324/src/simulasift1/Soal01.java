package simulasift1;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan bilangan a");
        int a= input.nextInt();
        System.out.println("masukkan bilangan b");
        int b= input.nextInt();
        System.out.println("Masukkan panjang deret");
        int n=input.nextInt();
        Integer[] deret= new Integer[n];
        int c=0;
        for (int i = 0; i < b; i++) {
            c=c+a;
            if (c%b==0){
                break;
            }
        }
        int kel=c;
        for (int i = 0; i < deret.length; i++) {
            if (i== deret.length-1){
                deret[i]=kel;
                System.out.print(deret[i]);
                break;
            }
            deret[i]=kel;
            System.out.print(deret[i]+", ");
            kel=kel+c;
        }
    }
}
