package day5;

public class Array2D {

    public static void main(String[] args) {

        //Deklarasi 1
        int [][] arrA = new int[3][2]; //3 baris, 2 kolom (kayak matriks)

        //Deklarasi 2
        int [][] arrB = {
                {1,2},
                {3,4},
                {5,6}

        };

        //Cara ambil value
        System.out.println(arrB[2][1]);

        //Cara ganti value
        arrB[0][0] = 10;
        System.out.println(arrB[0][0]);

        //Cara melihat panjang baris dan kolom
        System.out.println(arrB.length); //melihat baris
        System.out.println(arrB[0].length); //melihat panjang kolom, baris 1


    }
}
