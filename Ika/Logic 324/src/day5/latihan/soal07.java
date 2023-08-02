package day5.latihan;

public class soal07 {
    public static void main(String[] args) {
        //"Diberikan deret dengan element 5 4 3 1 2 7 9 8
        //Jumlah kan element di index ganjil dan genap selain nol
        //output
        //awal         5+4+3+1+2+7+9+8=39
        //ganjil        4+1+7+8=20
        //genap      3+2+9=14
        //"

        int awal=0;
        int genap=0;
        int ganjil = 0;
        int[] arrB = {5,4,3,1,2,7,9,8};

        for (int i = 0; i < arrB.length; i++) {
             awal = awal + arrB[i];

             if (i%2==0 && i!=0){
                 genap = genap + arrB[i];
             }else if (i%2 != 0){
                 ganjil = ganjil + arrB[i];
             }
        }

        //total awal
        for (int i = 0; i < arrB.length; i++) {
            if(i== arrB.length-1){
                System.out.print(arrB[i] + " = ");
            }else {
                System.out.print(arrB[i] + " + ");
            }
        }
        System.out.print(awal);
        System.out.println();
        System.out.println("nilai total awal " + awal);

        //untuk sum genap
        for (int i = 0; i < arrB.length; i++) {
            if (i % 2 == 0 && i != 0) {
                if(i== arrB.length-2){
                    System.out.print(arrB[i] + " = ");
                }else {
                    System.out.print(arrB[i] + " + ");
                }
            }
        }
        System.out.print(genap);
        System.out.println();
        System.out.println("nilai penjumlahan indeks genap " + genap);

        //untuk sum ganjil
        for (int i = 0; i < arrB.length; i++) {
            if (i%2 != 0){
                if(i == arrB.length-1){
                    System.out.print(arrB[i] + " = ");
                }else {
                    System.out.print(arrB[i] + " + ");
                }
            }
        }
        System.out.print(ganjil);
        System.out.println();
        System.out.println("nilai penjumlahan indeks ganjil " + ganjil);

    }
}
