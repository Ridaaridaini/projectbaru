package simulasi;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan : ");
        int bilangan =input.nextInt();
        int[] arrFibo = new int[bilangan];

        arrFibo[0] = 1;
        arrFibo[1] = 1;

        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-2] +arrFibo[i-1];
        }
        for (int i = 0; i < arrFibo.length; i++) {
            if (arrFibo[i] < bilangan){
                System.out.print(arrFibo[i] +" ");
            }else {
                break;
            }
        }
    }
}
