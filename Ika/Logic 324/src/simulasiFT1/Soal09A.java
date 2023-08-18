package simulasiFT1;

import java.util.Scanner;

public class Soal09A {
    public static void main(String[] args) {
        //Buatlah deret angka yang terbentuk dari penjumlahan deret bilangan kelipatan 3 dikurang 1
        // dan deret bilangan kelipatan 4 diibagi(/) 2.
        //Angka pada index ganjil dari kedua deret bilangan tersebut saling dijumlahkan,
        // Dan angka pada index genap dari kedua deret bilangan tersebut juga saling dijumlahkan.
        //Index dimulai dari angka 0.
        //Input : Panjang array/panjang deret
        //Contoh : Dibawah ini hanya sekedar contoh yang menggunakan deret genap dan ganjil
        //Input panjang deret : 5
        //Deret genap : 0 2 4 6 8
        //Deret ganjil : 1 3 5 7 9
        //0 + 1 ; 2 + 3 ; 4 + 5 ; 6 + 7 ; 8 + 9
        //Output : 1, 5, 9, 13, 17

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang deret: ");
        int deret = scanner.nextInt();

        int deretKelTiga=3;
        int b= 4;
        int[] arrKelTiga = new int[deret];
        int[] arrKelEmpat = new int[deret];


        for (int i = 0; i < arrKelTiga.length; i++) {
            arrKelTiga[i]=deretKelTiga;
            System.out.print(arrKelTiga[i] + " ");
            deretKelTiga= (deretKelTiga + 3);
            deretKelTiga=deretKelTiga-1;
        }

        int deret2 =0;
        for (int i = 0; i < deret; i++) {
            deret2 += b;
            arrKelEmpat[i] = deret2 / 2;
            System.out.print(arrKelEmpat[i] + " ");
        }

    }
}
