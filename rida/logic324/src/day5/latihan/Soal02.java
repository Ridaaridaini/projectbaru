package day5.latihan;

public class Soal02 {
    public static void main(String[] args) {
        int[] deret = {2, 4, 6, 8, 10};
        int j= deret.length-1;
        for (int i = 0; i < deret.length; i++) {
            System.out.print(deret[j]+ " ");
            j=j-1;
        }
    }
}
