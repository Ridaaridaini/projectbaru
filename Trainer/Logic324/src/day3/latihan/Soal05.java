package day3.latihan;

public class Soal05 {

    /*
    * n = 7
      1        5        *        9        13        *        17
    * */
    public static void main(String[] args) {

        int n = 7;
        //tugas a, hanya untuk value yang dicetak
        int a = 1;
        //tugas for, hanya untuk panjang deret
        for (int i = 0; i < n; i++) {//i : 0 1 2 3 4 5 6
            if (i % 3 == 2){
                System.out.print("* " );
            } else {
                System.out.print(a + " "); //1 5 9 13 17 21 25
                //System.out.print(a + " "); //1 5 * 9 13 * 17
                a = a + 4;
            }

        }


    }
}
