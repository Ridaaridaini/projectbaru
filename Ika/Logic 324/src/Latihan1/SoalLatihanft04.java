package Latihan1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SoalLatihanft04 {
    public static void main(String[] args) {
        //urutkan huruf/karakter dari gabungan beberapa kata atau sebuah kalimat sesuai dengan abjad alfabet
        //Input : gabungan beberapa kata atau sebuah kalimat
        //Batasan:
        //- urut dan pisahkan huruf/karakter tersebut dengan tanda ","
        //- kelompokkan huruf yang sama
        //- diproses sebagai huruf kecil (spasi diabaikan)
        // Output : huruf yang sama dikelompokkan menjadi satu dan dipisahkan dengan tanda ","
        //Contoh
        //input n : Sample Case
        //output : aa, c, ee, l, m, p, ss
        //input n : Next Case
        //output : a, c, ee, n, s, t, x

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().replace(" ","").split("");
        String  kal = "";

        Arrays.sort(kalimat);
        for (int i = 0; i < kalimat.length; i++) {
            if(!kal.contains(kalimat[i]) && i>0){
                kal=kal +",";
            }
            kal= kal + kalimat[i];
        }
        System.out.println(kal);

    }
}
