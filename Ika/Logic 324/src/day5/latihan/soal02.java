package day5.latihan;

public class soal02 {
    public static void main(String[] args) {

        //"Diberikan array dengan element 2,4,6,8,10.
        //Cetak semua element dengan urutan yang dibalik.
        //Output : 10 8 6 4 2"

        int[] arrA = {2,4,6,8,10};//panjangnya = 5
        int a= arrA.length-1; //4
        for (int i = 0 ; i < arrA.length; i++) {
            System.out.print(arrA[a] + " ");
            a=a-1;
        }

    }
}
