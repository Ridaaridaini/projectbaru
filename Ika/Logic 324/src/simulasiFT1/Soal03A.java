package simulasiFT1;

import java.util.Scanner;

public class Soal03A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int[] arrfib = new int[deret];
        arrfib[0] = 1;
        arrfib[1] = 1;

        for (int i = 2; i <arrfib.length ; i++) {
            arrfib[i] = arrfib[i-2] + arrfib[i-1];
//            System.out.print(arrfib[i] + " ");
        }


        int chek=0;
        for (int i = 0; i < arrfib.length; i++) {

            if(arrfib[chek] > deret){
                break;
            }else if (arrfib[i]%2==0){
                chek++;
                continue;
            }
            System.out.print(arrfib[i] + " ");
            chek++;
        }
    }
}
