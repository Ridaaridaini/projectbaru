package Latihan1;

public class ArraySoal02 {
    public static void main(String[] args) {
        //"Diberikan array dengan element 2,4,6,8,10.
        //Cetak semua element dengan urutan yang dibalik.
        //Output : 10 8 6 4 2"

        int[] deret = {2,4,6,8,10};

        for (int i = deret.length-1; i >= 0 ; i--) {
            System.out.print(deret[i] + " ");
        }


    }
}
