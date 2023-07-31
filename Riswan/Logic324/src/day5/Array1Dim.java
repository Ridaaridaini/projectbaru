package day5;

public class Array1Dim {
    public static void main(String[] args) {
        //Deklarasi sebuah array kosong
        int[] arrA = new int[5];//[0,0,0,0,0]
        //Deklarasi Array langsung diisi
        int[] arrB = {1,2,3,4,5};
        String[] arrStr = {"A","B","C"};
        //Cara untuk mengambil value dalam array
        System.out.println("ambil data ke 3 : " + arrB[2]);

        //cara mengisi value

        System.out.println(arrB[1]);
        arrB[1] = 10;
        System.out.println(arrB[1]);

    }
}
