package latihan.challenge;

import java.util.Scanner;

public class Soal01GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input n: ");
        Integer n = input.nextInt();
        Integer[] deret = new Integer[n];
        int a=1, b=n;
        System.out.print("Ganjil: ");
        for (int i = 0; i < n; i++) {
            if (a%2==1){
                deret[i]=a;
                System.out.print(deret[i]+" ");
            }
            a++;
        }
        System.out.println();
        System.out.print("Ganjil: ");
        for (int i = 0; i < n; i++) {
            if (b%2==1){
                deret[i]=b;
                System.out.print(deret[i]+" ");
            }
            b--;
        }
        System.out.println();
        int d=1, e=n;
        System.out.print("Genap: ");
        for (int i = 0; i < n; i++) {
            if (d%2==0){
                deret[i]=d;
                System.out.print(deret[i]+" ");
            }
            d++;
        }
        System.out.println();
        System.out.print("Genap: ");
        for (int i = 0; i < n; i++) {
            if (e%2==0){
                deret[i]=e;
                System.out.print(deret[i]+" ");
            }
            e--;
        }
    }
}
