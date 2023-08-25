package simulasi;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("A : ");
        long a = input.nextInt();
        System.out.println("B : ");
        long b = input.nextInt();
        System.out.println("N : ");
        long n = input.nextInt();

        long kpk = a; //4
        while (kpk % b != 0){//true
            kpk = kpk + a;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(kpk+" ");
            kpk = kpk*2;
        }
    }
}
