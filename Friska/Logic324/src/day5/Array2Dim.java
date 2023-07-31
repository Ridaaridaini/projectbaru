package day5;

public class Array2Dim {
    public static void main(String[] args) {


        //Deklarasi 1
        int[][] arrA = new int[3][2];
        // [0,0]
        // [0,0]
        // [0,0]

        //Deklarasi 2
        int[][] arrB = { // dari 0
                {1, 2},
                {3, 4},
                {5, 6},
        };

        // Cara ambil value
        System.out.println(arrB[2][1]);

        //Cara ganti/replace value
        arrB[0][0] = 10;
        System.out.println(arrB[0][0]);

        //Cara melihat panjang baris dan kolom
        System.out.println(arrB.length);//baris
        System.out.println(arrB[0].length); // kolom,baris 1/index 0
    }
}
