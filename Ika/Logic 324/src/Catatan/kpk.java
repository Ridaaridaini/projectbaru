package Catatan;

import java.util.Scanner;

public class kpk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan a: ");
        int a = scanner.nextInt();

        System.out.print("masukan b: ");
        int b = scanner.nextInt();
        int kpk=0;

        for (int i = 1; i <=a && i<=b ; i++) {
            if(a%i==0 && b%i==0){
                kpk=i;
            }
        }
        System.out.println(kpk);
        int nilaikpk =(a*b)/kpk;
        System.out.println(nilaikpk);
    }
}
