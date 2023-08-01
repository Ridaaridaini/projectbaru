package day6;

public class StringManipulation {
    public static void main(String[] args) {
        String contoh = "Hello world    ";

        int tampung = contoh.length();

        System.out.println(tampung);

        String tampungStr = contoh.trim();

        tampung = contoh.trim().length();

        System.out.println(tampung);

        String nama = "ibrohim.huzaini";

        String[] namaBaru = nama.split("\\.");

        System.out.println(namaBaru[0]);

    }
}
