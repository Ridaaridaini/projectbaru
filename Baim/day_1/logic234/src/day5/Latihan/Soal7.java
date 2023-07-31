package day5.Latihan;

public class Soal7 {
    public static void main(String[] args) {
        int[] deret = { 5, 4, 3, 1, 2, 7, 9, 8 };
        int awal = 0;
        int genap = 0;
        int ganjil = 0;

        for (int i = 0; i < deret.length; i++) {
            awal += deret[i];
            if (i % 2 == 1 && i != 0) {
                ganjil += deret[i];
            } else {
                genap += deret[i];
            }

        }
        System.out.println("Awal = " + awal);
        System.out.println("Genap = " + genap);
        System.out.println("Ganjil = " + ganjil);
    }
}
