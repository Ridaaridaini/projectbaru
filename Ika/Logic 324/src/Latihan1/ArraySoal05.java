package Latihan1;

import java.util.Scanner;

public class ArraySoal05 {
    public static void main(String[] args) {
        //"Buat program untuk mencari nilai dalam deret 3, 2, 1, 5, 8
        //Contoh :
        //input : nilai yang dicari? 1
        //output : nilai 1 ada dalam deret di posisi 3.
        //Contoh 2 :
        //input : nilai yang dicari? 9
        //output : nilai 9 tidak ada dalam deret"

        Scanner scanner = new Scanner(System.in);
        System.out.print("nilai yang dicari: ");
        int nilai = scanner.nextInt();

        int[] deret= {3,2,1,5,8};
        int a=0;

        for (int i = 0; i < deret.length; i++) {
            if(nilai==deret[i]){
                i=i+1;
                System.out.print("nilai " + nilai + " ada dalam deret di posisi " + i);
                a++;
            }
        }
        if(a==0){
            System.out.print("nilai " + nilai + " tidak ada dalam deret");
        }



    }

}
