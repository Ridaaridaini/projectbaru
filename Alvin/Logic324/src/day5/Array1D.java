package day5;

public class Array1D {

    public static void main(String[] args) {

        // deklarasi array kosong
        String[] nama = new String[5]; //array nama memiliki panjang 5 index [0, 1, 2, 3, 4]

        //deklarasi arry langsung isi
        int[] angka = {0,2,3,4,5}; // [0,2,3,4,5]

        // mengambil array
        int a = angka[3];
        System.out.println(a);
        System.out.println(angka[4]);

        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }

//        cara mengisi value dalam array
        System.out.println(angka[0]);
        angka[0] = 1; // replace array value
        System.out.println(angka[0]);

//        melihat panjang array

        System.out.println("panjang array: " + angka.length);
    }

}
