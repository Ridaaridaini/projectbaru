package simulasiFT1;

import java.util.Arrays;
import java.util.Scanner;

public class Soal04 {
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
        System.out.print("masukan kalimat : ");
        String kalimat = scanner.nextLine();

        kalimat = kalimat.toLowerCase().replace(" ","");
        String[] arrKal= kalimat.split("");
        String vokal = "";
        String konsonan = "";

        Arrays.sort(arrKal);
        for (int i = 0; i < arrKal.length; i++) {
            if(arrKal[i].equals("a") || arrKal[i].equals("i") || arrKal[i].equals("u") || arrKal[i].equals("e") || arrKal[i].equals("o")){
                if(!vokal.contains(arrKal[i])){
                    if(vokal.length()>0){
                        vokal=vokal + ",";
                    }
                }
                vokal =vokal + arrKal[i];
            } else if (!(arrKal[i].equals("a") || arrKal[i].equals("i") || arrKal[i].equals("u") || arrKal[i].equals("e") || arrKal[i].equals("o"))) {
                if (!konsonan.contains(arrKal[i])) {
                    if (konsonan.length() > 0) {
                        konsonan = konsonan + ",";
                    }
                }
                konsonan = konsonan + arrKal[i];
            }
        }

        System.out.println(vokal + konsonan);


    }
}
