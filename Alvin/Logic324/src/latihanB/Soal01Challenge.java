package latihanB;

import java.util.Scanner;

public class Soal01Challenge {

    public static void main(String[] args) {

        //challange: cetak terbalik
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n harus bilangan bulat positif");
            System.exit(0);
        }

        int bilangan=1;

        String deretGanjil="", deretGenap="";
        for (int i = 0; i < n; i++) {

            //ganjil
            if (bilangan%2 != 0 && bilangan <= n){
                deretGanjil += bilangan;
            }

            if (bilangan%2 == 0 && bilangan <= n){
                deretGenap += bilangan;
            }
            bilangan++;
        }


        String[] arrGanjil = deretGanjil.split("");
        String[] arrGenap = deretGenap.split("");

        for (int i = arrGanjil.length-1; i >=0 ; i--) {
            System.out.print(arrGanjil[i] + " ");
        }

        System.out.println();

        for (int i = arrGenap.length-1; i >=0 ; i--) {
            System.out.print(arrGenap[i] + " ");
        }

    }

}
