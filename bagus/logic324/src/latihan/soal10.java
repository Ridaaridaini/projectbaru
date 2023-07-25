package latihan;

import java.util.Scanner;

public class soal10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan a= ");
        Integer a = input.nextInt();

        System.out.println("masukan b= ");
        Integer b = input.nextInt();


        System.out.println("nilai a= " +a);
        System.out.println("nilai b= " +b);

        System.out.println();

        System.out.println(Math.pow(a,b));
    }
}
