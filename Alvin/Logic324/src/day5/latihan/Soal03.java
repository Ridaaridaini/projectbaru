package day5.latihan;

public class Soal03 {

    public static void main(String[] args) {

        int[] arrA = {
                2, 4, 6, 8, 10
        };

        for (int i = 0; i < arrA.length; i++) {

            if (i == arrA.length-2) {
                System.out.print(arrA[i] + ", dan ");
            } else if (i == arrA.length-1) {
                System.out.print(arrA[i]);
            } else {
                System.out.print(arrA[i] + ", ");
            }
        }

    }

}
