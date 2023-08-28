package Latihan1;

import java.util.Scanner;

public class SMsoal05 {
    public static void main(String[] args) {
        //"Terdapat sebuah kalimat ""The quick brown fox jumps over a lazy dog“.
        //Buat program untuk mencari karakter di dalam kalimat tersebut?
        //contoh 1:
        //input : cari karakter ? o
        //output : karakter o ada dalam kalimat
        //contoh 2:
        //input : cari karakter ? 2
        //output : karakter 2 tidak ada kalimat"

        Scanner scanner = new Scanner(System.in);
        String kalimat = "The quick brown fox jumps over a lazy dog";
        kalimat.replace(" ","").toLowerCase();
        String[] arrKal = kalimat.split("");

        System.out.print("cari karakter: ");
        String karakter = scanner.nextLine().toLowerCase();
        String tampungan ="";

        for (int i = 0; i < arrKal.length; i++) {
            if (karakter.contains(arrKal[i])){
                tampungan = tampungan+ arrKal[i];
            }
        }

        if(tampungan.length() >= 1){
            System.out.println("karakter " + karakter + " ada dalam kalimat");
        }else {
            System.out.println("karakter " + karakter + " tidak ada dalam kalimat");
        }



    }
}
