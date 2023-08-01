package day5;

public class Array2Dim {
    public static void main(String[] args) {

        //Deklarasi 1
        int[][] arrA = new int[3][2];
        //[0,0]
        //[0,0]
        //[0,0]

        //Deklarasi 2
        int[][] arrB = {
                {1,2},
                {3,4},
                {5,6},
        };

        //cara ambil value
        System.out.println(arrB[2][1]);

        //cara ganti/replace value
        arrB[0][0] = 10;
        System.out.println(arrB[0][0]);

        //cara melihat panjang baris & kolom
        System.out.println(arrB.length);
        System.out.println(arrB[0].length);// kolom baris 1 // indeks 0
    }
}
