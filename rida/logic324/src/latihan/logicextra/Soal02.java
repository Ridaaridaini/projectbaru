package latihan.logicextra;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String[] nama= input.nextLine().toUpperCase().split(" ");
        //String tampung="";
        for (int i = 0; i < nama.length; i++) {
            String namaOrang=nama[i];
            char tampung= namaOrang.charAt(0);
            System.out.print(tampung);
            for (int j = 0; j < 3; j++) {
                System.out.print("*");
            }
            tampung=namaOrang.charAt(nama.length-1);
            System.out.print(tampung+" ");
        }
    }
}
