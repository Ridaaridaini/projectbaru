package simulasiFT1;

import java.util.Scanner;

public class Soal7Kubus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai n :");
        double n = input.nextDouble();
        System.out.println("Masukkan nilai m : ");
        double m = input.nextDouble();

        double LPP = 0;
        double LPK = 0;

        LPP = n*n;
        System.out.println("Luas Permukaan Persegi: "+ LPP);

        LPK = 6*m*m;
        System.out.println("Luas Permukaan kubus: "+LPK);

        double banyakPersegi = LPK / LPP ;
        System.out.println("Banyaknya nya persegi yaitu: " + banyakPersegi);
    }
}
