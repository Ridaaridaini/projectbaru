package day5.latihan;

import java.util.Scanner;

public class soal05 {
    public static void main(String[] args) {
        //"Buat program untuk mencari nilai dalam deret 3, 2, 1, 5, 8
        //Contoh :
        //input : nilai yang dicari? 1
        //output : nilai 1 ada dalam deret di posisi 3.
        //Contoh 2 :
        //input : nilai yang dicari? 9
        //output : nilai 9 tidak ada dalam deret"
        Scanner scanner = new Scanner(System.in);

        System.out.print("nilai yang dicari? ");
        int n = scanner.nextInt();//2

        int arrA[] = {3,2,1,5,8};
        int a =0;

        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i] == n){
                System.out.print("nilai "+ n + " ada dalam deret di posisi " + i);
                a=a+1;
               break;
            }
//            a= a+ 1;
        }
        if(a==0){//jika nilai yang dimasukan tidak ada di array maka nilai a akan tetap 0 sehingga kondisi akan berjalan.
            System.out.print("nilai " + n + " tidak ada dalam deret");
        }

    }
}
