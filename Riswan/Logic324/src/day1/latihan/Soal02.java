package day1.latihan;

public class Soal02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        a = a + b;
        System.out.println(a);
        b = a - b;
        System.out.println(b);
        a = a - b;
        System.out.println(a);

        System.out.println("Setelah pertukaran:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
