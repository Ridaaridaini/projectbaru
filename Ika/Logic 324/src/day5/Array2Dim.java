package day5;

public class Array2Dim {
    public static void main(String[] args) {
        //deklarasi

        int[][] arrA = new int[3][2];// kiri baris[3],kanan kolom [2]
        //[0,0]
        //[0,0]
        //[0,0]

        //deklarasi 2
        int[][] arrB = {
                {1,2},
                {3,4},
                {5,6}
        };

        //cara ambil value
        System.out.println(arrB[2][1]);

        //cara ganti/ replace value
        arrB[0][0]=10;
        System.out.println(arrB[0][0]);


        //cara melihat panjang baris dan kolom
        System.out.println(arrB.length);//untuk baris
        System.out.println(arrB[0].length);// untuk melihat kolom berdasarkan pada barisnya (untuk baris 1 /indeks ke 0)


    }
}
