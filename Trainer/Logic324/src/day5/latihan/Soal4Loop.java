package day5.latihan;

public class Soal4Loop {

    public static void main(String[] args) {

        int[] arrA = new int[4]; //[1,3,5]
        int a = 1;//3, 5

        for (int i = 0; i < arrA.length; i++){
            arrA[i] = a;
            a = a + 2;
        }

    }
}
