package day5;

public class Array2Dim {
    public static void main(String[] args) {
        int [][] arrA = new int[3][2];// baris, kolom

        int [][] arrB = {{1,2},{3,2},{4,5}};

        System.out.println("cetak: " + arrB[1][1]);

        //cara melihat panjang baris dan kolom
        System.out.println("baris : "+arrB.length);
        System.out.println("kolom : "+arrB[2].length);
    }
}
