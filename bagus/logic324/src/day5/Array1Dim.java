package day5;

public class Array1Dim {
    public static void main(String[] args) {
        //deklarasi array kosong

        int [] arrA = new int[5];

        //deklarasi array ada isi nya

        int [] arrB = {0,2,3,1,4};

        //cara ambil value array

        System.out.println(arrB[3]);

        int c = arrB[4];
        System.out.println(c);

        //cara isi array

        arrB[0] = 1;
        System.out.println(arrB[0]);
    }
}
