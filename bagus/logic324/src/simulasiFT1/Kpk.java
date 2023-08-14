package simulasiFT1;

import java.util.Scanner;

public class Kpk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan n: ");
        int n = input.nextInt();

        System.out.println("masukan m: ");
        int m = input.nextInt();

        int i = 0;

        for (int j = 0; j < m; j++) {
            i = i + n;
            if(i%m == 0){
                break;
            }
        }
        System.out.println(i);
    }
}
