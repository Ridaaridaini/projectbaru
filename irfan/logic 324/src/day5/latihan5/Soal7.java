package day5.latihan5;

public class Soal7 {
    public static void main(String[] args) {
        int[] arrA = {5, 4, 3, 1, 2, 7, 9, 8};
        int totalawal = 0 , totalGanjil, totalGenap;

        for (int i = 0; i < arrA.length; i++) {
            //logic menghitung pertambahan awal
            totalawal = arrA[i] + totalawal ;
            //logic untuk mencari nilai ganjil


            //logic untuk mencari nilai genap


        }
        System.out.print(totalawal+"");

    }
}
