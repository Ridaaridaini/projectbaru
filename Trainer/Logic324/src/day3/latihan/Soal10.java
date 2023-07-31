package day3.latihan;

public class Soal10 {
    public static void main(String[] args) {

        int n = 8;

        int a = 3;
        for (int i = 0; i < n; i++) {
            if (i == n/2 && n % 2 == 1){ // untuk yang ganjil
                System.out.print("XXX ");
            } else if(i == n/2 || i == n/2 -1 && n % 2 == 0){ //untuk yang genap
                System.out.print("XXX ");
            }else {
                System.out.print(a + " ");
            }
            a = a * 3;
        }




    }
}
