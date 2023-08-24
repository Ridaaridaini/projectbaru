package ft1;

import java.util.Random;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] arrA = {3,5,3,5,8,5,3,5,3};


        int A = random.nextInt(9);
        int B = random.nextInt(9);

        System.out.print("pilih 1. A atau 2. B  : ");
        int pilihan = scanner.nextInt();

        if (pilihan ==1){
            if (A > B){

                System.out.print("round1 A = "+arrA[A]+","+"B ="+arrA[B]+"");

                System.out.println();

                System.out.print("anda menang ");

            }else if (A < B){
                System.out.print("round1 A = "+arrA[A]+","+"B ="+arrA[B]+"");
                System.out.print(" anda kalah ");
            }
        }
        if (pilihan ==2){
            if (A < B){
                System.out.print("round1 A = "+arrA[A]+","+"B ="+arrA[B]+"");

                System.out.println();

                System.out.print("anda menang ");

            }else if (A > B){
                System.out.print("round1 A = "+arrA[A]+","+"B ="+arrA[B]+"");
                System.out.print(" anda kalah ");
            }
        }
    }
}
