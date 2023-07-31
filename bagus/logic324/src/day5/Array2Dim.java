package day5;

public class Array2Dim {
    public static void main(String[] args) {

        //deklarasi array 2 dimensi kosongan
        int [][] arr2Dim = new int[3][2];

        //deklarasi array 2 dimensi ada isinya
        int [][] array2 = {{2,3}, {1,5}, {4,7}};

        //cara cetak
        System.out.println(array2[1][1]);

        //cara ganti
        array2[0][1] = 9;
        System.out.println(array2[0][0]);

        //cara lihat baris dan kolom

        System.out.println(array2.length);//lihat baris
        System.out.println(array2[0].length);//lihat kolom
    }
}
