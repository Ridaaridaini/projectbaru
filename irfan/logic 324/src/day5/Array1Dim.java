package day5;

public class Array1Dim {
    public static void main(String[] args) {

        //Deklarasi sebuah array
        int[] arrA = new int[5]; //[0,0,0,0,0,]


        //Deklarasi Array langsung diisi
        int[] arrB = {0,1,3,4,5}; //[0,2,3,4,5]

        //cara untuk mengambil value dalam array
        int b = arrB [3];
        System.out.println(b);

        //Cara mengisi value dalam Array
        System.out.println(arrB[0]); // 0 //sebelum diganti
        arrB[0] = 1;
        System.out.println(arrB[0]); // 1 //sesudah diganti

        //Melihat panjang array
        System.out.println(arrB.length);
    }
}
