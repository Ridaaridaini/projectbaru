package day5Array.latihan5;

public class Soal7MenjumlahkanDeretGanjilGenap {
    public static void main(String[] args) {
        int[] ArrA = {5, 4, 3, 1, 2, 7, 9, 8};
        int awal = 0;
        int ganjil = 0;
        int genap = 0;
        System.out.print("awal ");
        for (int i = 0; i < ArrA.length; i++) {
            if (i == ArrA.length - 1) {
                System.out.print(ArrA[i]+" = ");
            } else {
                System.out.print(ArrA[i]+" + ");

            } awal = awal + ArrA[i];

        }
        System.out.print(awal);
        System.out.println();

        System.out.print("Ganjil ");
        for (int i = 0; i < ArrA.length; i++) {
            if (i == ArrA.length - 1) {
                System.out.print(ArrA[i]+" = ");
                ganjil = ganjil + ArrA[i];
            } else if(i % 2 == 1){
                System.out.print(ArrA[i]+" + ");
                ganjil = ganjil + ArrA[i];
            }

        }
        System.out.print(ganjil);
        System.out.println();

        System.out.print("Genap ");
        for (int i = 0; i < ArrA.length; i++) {
            if (i == ArrA.length - 2) {
                System.out.print(ArrA[i]+" = ");
                genap = genap + ArrA[i];
            } else if(i % 2 == 0 && i != 0){
                System.out.print(ArrA[i]+" + ");
                genap = genap + ArrA[i];
            }

        }
        System.out.print(genap);
        System.out.println();
    }
    }

