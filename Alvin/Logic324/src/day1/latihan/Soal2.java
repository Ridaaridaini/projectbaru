package day1.latihan;

public class Soal2 {
    public static void main(String[] args) {
        int a = 3, b=4;

        System.out.println("sebelum swap:");
        System.out.println("variable a: " + a);
        System.out.println("variable b: " + b);
        System.out.println();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("setelah swap:");
        System.out.println("variable a: "+a);
        System.out.println("variable b: "+b);
    }
}
