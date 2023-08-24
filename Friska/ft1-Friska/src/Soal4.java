import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan banyaknya halaman buku: ");
        int n = input.nextInt();
        int [] banyakHalaman = new int [n];
        System.out.println("Masukkan halaman keberapa");
        int x = input.nextInt();
        int [] halaman = new int[x];


        for (int i = 0; i < banyakHalaman.length; i++) {
            if(x % 2 == 0){
                halaman = halaman[i]+1;


            }

        }

    }
}
