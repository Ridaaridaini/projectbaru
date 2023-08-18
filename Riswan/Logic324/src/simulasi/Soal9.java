package simulasi;

import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Panjang Deret : ");
        int panjang = input.nextInt();
        int[] deret1 = new int[panjang];
        int[] deret2 = new int[panjang];
        deret1[0] = 0;
        deret2[0] = 0;
        for (int i = 0; i < panjang; i++) {
            deret1[i] = 3*(i+1)-1 ;
        }
        for (int i = 0; i < panjang; i++) {
            deret2[i] = (4*(i+1)/2);
        }
        for (int i = 0; i < panjang; i++) {
            System.out.print(deret1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < panjang; i++) {
            System.out.print(deret2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < panjang; i++) {
            System.out.print(deret1[i]+deret2[i]+" ");
        }
    }
}
