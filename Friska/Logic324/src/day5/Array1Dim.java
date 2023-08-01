package day5;

public class Array1Dim {
    public static void main(String[] args) {

        //Deklarasi Sebuah Array Kosong

        int[] arrA = new int [5]; //[0,0,0,0,0]
        String [] arrStrA = new String[5];// [null,null,null,null,null]


        // Deklarasi Array langsung diisi
        int [] arraB = {0,2,3,4,5}; // [0,2,3,4,5]
        String [] arrStrB = {"A","A","S"};

        //Cara untuk mengambil value didalam array
        System.out.println(arraB[1]);
        int b = arraB[3];
        System.out.println(b);

        //cara mengisi value dalam Array
        System.out.println(arraB[0]);
        arraB[0] = 1;
        System.out.println(arraB[0]);
    }
}
