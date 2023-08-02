package latihanHari06;

import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("masukkan kalimat: ");
        String kalimat= input.nextLine();//menampung input "dia jalan jalan berdua"
        String[] arrKalimat= kalimat.split(" "); //mebuat array dengan manipulation String (split) d
        // ipisah bedasarkan spasi
        for (int i = 0; i < arrKalimat.length; i++) {//mengoutputkan kata per array bedasarkan i
            System.out.println(arrKalimat[i]);

        }

    }
}
