package latihan;

import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan a= ");
        double a = input.nextInt();

        System.out.println("masukan b= ");
        double b = input.nextInt();


        System.out.println("nilai a= " +a);
        System.out.println("nilai b= " +b);

        System.out.println();

        double pangkat = Math.pow(a,b);
        System.out.println("hasil dari  " + a  +" pangkat "+  b + " adalah = " +pangkat);
    }
}
