package latihanHari06;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        //cetak perkarakter selain spasi
        Scanner input= new Scanner(System.in);
        System.out.println("masukkan kalimat: ");
        String kalimat= input.nextLine();//menampung kalimat
        String[] arrKalimat= kalimat.replace(" ","").split("");
        //Baris diatas berfungsi untuk menghilangkan spasi (replace) dan mengubah kalimat menjadi array(split)
        for (int i = 0; i < arrKalimat.length; i++) {//perulang untuk mengeluarkan array
            System.out.println(arrKalimat[i].charAt(0));

        }

    }
}
