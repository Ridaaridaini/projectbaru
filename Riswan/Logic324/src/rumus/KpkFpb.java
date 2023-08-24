package rumus;

import java.util.Scanner;

public class KpkFpb {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.print("x : ");
        int x = scanner.nextInt(); //4

        System.out.print("y : ");
        int y = scanner.nextInt(); //2
        scanner.nextLine();

        //Perhitungan KPK
        int kpk = x; //4
        while (kpk % y != 0){//true
            kpk = kpk + x;
        }
        //FPB
        int a = x;
        int b = y;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int fpb = a;
        System.out.println("kpk : "+kpk);
        System.out.println("fpb : "+fpb);
    }
}
