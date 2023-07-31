package day5;

public class Array1Dim {

    public static void main(String[] args) {
        //Deklarasi Sebuah Array Kosong
        int a;// [0]
        int[] arrA = new int[5]; //[0,0,0,0,0]
        String[] arrStrA = new String[5]; //[null,null,null,null,null]

        //Deklarasi Array langsung diisi
        int[] arrB = {0,2,3,4,5}; //[0,2,3,4,5]
        String[] arrStrB = {"A","A","S"};

        //Cara untuk mengambil value dalam Array
        System.out.println(arrB[1]);//2
        int b = arrB[3];
        System.out.println(b);//4

        //Cara mengisi value dalam Array
        System.out.println(arrB[0]);//0 //sebelum diganti
        arrB[0] = 1;
        System.out.println(arrB[0]);//1 //sesudah diganti

        //Melihat panjang array
        System.out.println(arrB.length);

    }

}
