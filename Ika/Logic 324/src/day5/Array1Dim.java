package day5;

public class Array1Dim {
    public static void main(String[] args) {

        //deklarasi sebuah Array kosong
        int[] arrA = new int[5]; //[0,0,0,0,0]

        //deklarasi Array langsung diisi, indeks pertama selalu dimulai dari 0
        int[] arrB = {0,2,3,4,5}; //[0,2,3,4,5]

        //Cara mengambil value dalam Array
        System.out.println(arrB[1]);//2
        int b = arrB[3];//indeks keberapa yang mau diambil
        System.out.println(b);//4

        //cara mengisi value dalam Array
        System.out.println(arrB[0]);//0
        arrB[0]=1;
        System.out.println(arrB[0]);//1

        //melihat panjang Array
        System.out.println(arrB.length);





    }

}
