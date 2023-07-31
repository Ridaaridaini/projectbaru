package day5.latihan;

public class Soal07 {

    public static void main(String[] args) {

        // 0 1 2 3 4 5 6 7
        // 5 4 3 1 2 7 9 8

        int awal = 0, ganjil = 0, genap = 0;

        int[] deret = {
                5,4,3,1,2,7,9,8
        };

        for (int i = 0; i < deret.length; i++) {

            awal = awal + deret[i];

            if (i % 2 != 0){
                ganjil = ganjil + deret[i];
            }

            if (i % 2 == 0 && i > 0){
                genap = genap + deret[i];
            }
        }

        System.out.print("awal: ");
        for (int i = 0; i < deret.length; i++) {

            if (i != deret.length-1){
                System.out.print(deret[i] + "+");
            }else {
                System.out.print(deret[i] + "=");
            }
        }
        System.out.print(awal);

        System.out.println();

        System.out.print("ganjil: ");
        for (int i = 0; i < deret.length; i++) {

            if (i % 2 !=0){
                if (i != deret.length-1){
                    System.out.print(deret[i] + "+");
                }else {
                    System.out.print(deret[i] + "=");
                }
            }

        }
        System.out.print(ganjil);

        System.out.println();

        System.out.print("genap: ");
        for (int i = 0; i < deret.length; i++) {

            if (i % 2 ==0 && i != 0){
                if (i != deret.length-2){
                    System.out.print(deret[i] + "+");
                }else {
                    System.out.print(deret[i] + "=");
                }
            }

        }
        System.out.print(genap);



    }

}
