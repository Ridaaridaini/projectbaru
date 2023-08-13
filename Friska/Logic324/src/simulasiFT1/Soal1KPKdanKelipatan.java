package simulasiFT1;

import java.util.Scanner;

public class Soal1KPKdanKelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();//2
        System.out.println("Masukkan nilai b: ");
        int b = input.nextInt();//3
        System.out.println("Masukkan panjang deret: ");
        int n = input.nextInt();
        int[] deret = new int[n];
        int kpk = 0;
        for (int i = 0; i < b; i++) {//i = 0, b = 3 ; i = 1, b = 3, 2 b = 3
            kpk = kpk + a; // 0+2 = 2; 4 ; 6
            if (kpk % b == 0) {// 2 / 3 = 1 //1 // 6 3
                break;
            }
        }
        System.out.println("KPK: " + kpk);
        input.nextLine();
        int kelipatan = kpk;

        for (int i = 0; i < n; i++) {
            System.out.print(kelipatan + " ");
            kelipatan = kelipatan + kpk;
        }


    }

}

