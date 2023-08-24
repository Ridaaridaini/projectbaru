package Catatan;

import java.util.Arrays;
import java.util.Scanner;

public class KelompokHuruf {
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
        String kalimat = scanner.nextLine();
        String huruf ="";

        String[] arrKal = kalimat.toLowerCase().replace(" ","").split("");
        Arrays.sort(arrKal);
        for (int i = 0; i < arrKal.length; i++) {
//            System.out.print(arrKal[i]);
            if(!huruf.contains(arrKal[i]) && i>0){
                huruf=huruf + ",";
            }
            huruf = huruf + arrKal[i];
        }
        System.out.println(huruf);


    }
}
