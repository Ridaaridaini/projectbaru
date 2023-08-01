package day5.latihan;

public class Soal03 {
    public static void main(String[] args) {
        int[] deret = {2, 4, 6, 8, 10};
        for (int i = 0; i < deret.length; i++) {
            if ((i == deret.length - 1)) {
                System.out.print("dan " + deret[i]);
            } else {
                System.out.print(deret[i] + ", ");

            }

        }
    }
}

