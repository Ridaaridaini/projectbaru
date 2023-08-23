package mendalamiLatihanLogic;

import java.util.Scanner;

public class LoopBasicSoal10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        int deret = 3;

        for (int i = 0; i < n; i++) {

            if (n%2 != 0){
                if (i == n/2){
                    System.out.print("XXX ");
                }else {
                    System.out.print(deret + " ");
                }
            }else {
                if (i == n/2 || i == (n/2)-1){
                    System.out.print("XXX ");
                }else {
                    System.out.print(deret + " ");
                }
            }

            deret *= 3;

        }

    }

}
