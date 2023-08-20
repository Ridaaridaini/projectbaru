package simulasiFT1;

import java.util.Scanner;

public class Soal3FibonanciGanjil {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan nilai x: ");
        int x = input.nextInt();
        int a=0,b=2;
        Integer[] deret=new Integer[x];
        if (x>=1){
            deret[0]=1;
            deret[1]=1;
            a=deret[1];
            System.out.print(deret[0]+" "+deret[1]+" ");
            for (int i = 2; a<x; i++) {
                deret[i]=deret[i-2]+deret[i-1];
                a=deret[i];
                if (a>x){
                    break;
                }
                if(deret[i]%2==1){
                    System.out.print(deret[i]+" ");
                    b=b+1;
                }


            }
            System.out.println("banyak angka ganjil selain 0 di bawah x ialah: "+b);
        }

    }
}