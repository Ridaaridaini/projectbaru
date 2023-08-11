package simulasift1;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai a");
        int a= input.nextInt();
        System.out.println("Masukkan nilai b");
        int b= input.nextInt();
        System.out.println("Masukkan panjang deret");
        int n= input.nextInt();
        Integer[] deret= new Integer[n];
       int a1=a,b1=b;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                deret[i]=a;
                a=a+a1;
                continue;
            }
            if(i%2==1){
                deret[i]=b;
                b=b+b1;
                continue;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(deret[i]+" ");
        }
    }
}
