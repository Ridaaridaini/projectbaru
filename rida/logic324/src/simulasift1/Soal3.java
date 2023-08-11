package simulasift1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan nilai X: ");
        Integer x= input.nextInt();
        Integer[] deret= new Integer[100];
        deret[0]=1;
        deret[1]=1;
        int a=0,b=2;
        System.out.print(deret[0]+" "+deret[1]+" ");
        for (int i = 2; a<x ; i++) {
            deret[i]=deret[i-1]+deret[i-2];
            a=deret[i];
            if (a>x){
                break;
            }
            if (deret[i]%2==1){
                b=b+1;
                System.out.print(deret[i]+" ");
            }

        }
        System.out.println("Ada "+b+" angka fibbonacci selain 0 dan dibawah X ");

    }
}
