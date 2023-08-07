package day3LoopingBasic.latihan3;

public class Soal11Polapersegi {
    public static void main(String[] args) {
        // n = 2
        int n1 = 2;
        for (int i = 1; i <= n1; i++) {// true
            System.out.print("@");// cetak @
            for (int j = 2; j <= n1 ; j++) {//true
                System.out.print("@");// cetak @ menyamping
            }
            System.out.println(); // kebawah sebelah kiri // ulangi

            }
        System.out.println();
        // n =3
        int n2 = 3;
        for (int i = 1; i <= n2; i++) {
            System.out.print("@");
            for (int j = 2; j <= n2 ; j++) {
                System.out.print("@");
            }
            System.out.println();
        }


    }

}

