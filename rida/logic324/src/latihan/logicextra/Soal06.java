package latihan.logicextra;

import java.util.Scanner;

public class Soal06 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan panjang array yang ingin ditampilkan: ");
        Integer n=input.nextInt();
        Integer[] arrKel3=new Integer[n];
        int bil=3,a=0,i=0;
        for (;a < arrKel3.length;) {
            arrKel3[a]=bil;
            if (arrKel3[a]%2==0){
                System.out.print(arrKel3[a]+" ");
                bil=bil+3;
                a++;
            }
            bil=bil+3;
        }

    }
}
