package latihan;

import java.util.Scanner;

public class Soal01Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        Integer n= input.nextInt();
        if(n<0){
            System.out.println("Constraint: N harus bilangan bulat positif");
        }else {
            Integer[] deret = new Integer[n];
            Integer[] deret2 = new Integer[n];
            int a=1;
            int b=2;
            for (int i = 0; i < n; i++) {
                if (a%2==1){
                    deret[i]=a;
                    System.out.print(deret[i]+" ");
                }
                a=a+1;
            }
            System.out.println();
            for (int i = 0; i <n-1; i++) {
                if (b%2==0 ){
                    deret[i]=b;
                    System.out.print(deret[i]+" ");
                }
                b=b+1;
            }
        }
    }
}
