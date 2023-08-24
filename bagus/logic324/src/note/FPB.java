package note;

import java.util.Scanner;

public class FPB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan x: ");
        int x = scanner.nextInt();

        System.out.print("masukan y: ");
        int y = scanner.nextInt();

        int fpb=0;

        for (int i = 1; i <= x && i<=y ; i++) {
            if(x%i==0 && y%i==0){
                fpb=i;
            }
        }
        System.out.println(fpb);
    }
}
