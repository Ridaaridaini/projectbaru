package day5;

public class Array2D {

    public static void main(String[] args) {

        int[][] arrA = new int[3][2]; // 3 baris, 2 kolom

//        [0,0]
//        [0,0]
//        [0,0]

        int[][] arrB = {
                {1, 2},
                {2, 4},
                {5, 6}
        };

        //ambil array 2D

        System.out.println(arrB[0][1]);


        arrB[0][0] = 10; //replace value
        System.out.println(arrB[0][0]);


        //cara melihat panjang baris dan kolom
        int row = arrA.length;
        int col = arrA[0].length;

        System.out.println(row);
        System.out.println(col);
    }

}
