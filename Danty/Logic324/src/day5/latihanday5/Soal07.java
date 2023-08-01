package day5.latihanday5;

public class Soal07 {

    public static void main(String[] args) {

        int[] arrA = {5,4,3,1,2,7,9,8};
        int awal = 0;
        int genap = 0;
        int ganjil = 0;

        for (int i = 0; i < arrA.length; i++) {
            awal = awal + arrA[i];

            if(i%2 == 0 && i != 0){
                genap = genap + arrA[i];

            } else if(i%2 != 0){
                ganjil = ganjil + arrA[i];
            }
        }
        System.out.print("awal = " + awal);
        System.out.println();
        System.out.print("genap = " + genap);
        System.out.println();
        System.out.print("ganjil = " + ganjil);




    }
}
