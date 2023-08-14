package simulasiFT1;

import java.util.Scanner;

public class Soal8Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama");
        String[] nama = input.nextLine().split(" ");
        String andi = "Andi", budi = "Budi", cindy = "Cindy", dedi = "Dedi", eki = "Eki";

        int nilaiAndi = 85;
        int nilaiBudi = 70;
        int nilaiCindy = 90;
        int nilaiDedi= 75;
        int nilaiEki= 100;

        System.out.println();
        System.out.println("Masukkan nilai");
        String[] nilai = input.nextLine().split(" ");
        Integer[] deretNilai = new Integer[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            deretNilai[i] =Integer.valueOf(nilai[i]);
        }
        for (int i = 0; i < nama.length ; i++) {
            if (nama[i].equalsIgnoreCase(andi)){
                if (deretNilai[i]==nilaiAndi){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if (nama[i].equalsIgnoreCase(budi)){
                if (deretNilai[i]==nilaiBudi){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if (nama[i].equalsIgnoreCase(cindy)){
                if (deretNilai[i]==nilaiCindy){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if (nama[i].equalsIgnoreCase(dedi)){
                if (deretNilai[i]==nilaiDedi){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if (nama[i].equalsIgnoreCase(eki)){
                if (deretNilai[i]==nilaiEki){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
        }




    }
}
