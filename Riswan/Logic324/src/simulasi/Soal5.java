package simulasi;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coklat = 0;
        int stampel = 0;
        System.out.print("uang Anda : ");
        int uang = input.nextInt();

        while (uang>=3000){
            uang = uang-3000;
            coklat= coklat+1;
            stampel = stampel +1;
            if(coklat%5 ==0){
                stampel = 0;
                coklat = coklat+1;
                stampel = stampel +1;
            }
        }
        System.out.println("JUmlah Coklat : "+coklat);
    }
}
