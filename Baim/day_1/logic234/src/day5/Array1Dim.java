package day5;

public class Array1Dim {
    public static void main(String[] args) {
        int a;

        int[] arrA = new int[5];

        int[] arrB = {0,1,2,3,4,5};

        int b = arrB[3];
        System.out.println(b);

        System.out.println(arrB[0]);
        arrB[0] = 1;
        System.out.println(arrB[0]);
    }
}
