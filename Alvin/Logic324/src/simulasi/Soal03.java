package simulasi;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        int x = scanner.nextInt();
        int fib[] = new int[x];

        for (int i = 0; i < x; i++) {
            if (i==0){
                fib[i] = 0;
                continue;
            } else if (i == 1) {
                fib[i] = 1;
                continue;
            }
            fib[i] = fib[i-1] + fib[i-2];
        }

        int indexFib = 0;
        for (int i = 0; i < x; i++) {

            if(fib[indexFib] > x){
                break;
            }

            if (fib[indexFib]%2 == 0){
                indexFib++;
                continue;
            }
                System.out.print(fib[indexFib] + " ");
            indexFib++;

        }

    }

}
