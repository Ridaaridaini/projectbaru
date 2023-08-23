package mendalamiLatihanLogic;

import java.util.Scanner;

public class ArraySoal08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int[] arrDeretGenap = new int[n];
        int[] arrDeretGanjil = new int[n];

        System.out.print("Deret genap: ");
        int deret = 0;
        for (int i = 0; i < n;) {
            if (deret%2==0){
                arrDeretGenap[i] = deret;
                System.out.print(arrDeretGenap[i] + " ");
                i++;
            }
            deret++;
        }
        System.out.println();
        System.out.print("Deret ganjil: ");
        deret = 0;
        for (int i = 0; i < n;) {
            if (deret%2!=0){
                arrDeretGanjil[i] = deret;
                System.out.print(arrDeretGanjil[i] + " ");
                i++;
            }
            deret++;
        }
        System.out.println();
        int jumlah = 0;
        for (int i = 0; i < n; i++) {
            jumlah = 0;
            jumlah = arrDeretGenap[i] + arrDeretGanjil[i];
            if (i == n-1){
                System.out.print(jumlah);
                break;
            }
            System.out.print(jumlah + ", ");
        }

    }

}
