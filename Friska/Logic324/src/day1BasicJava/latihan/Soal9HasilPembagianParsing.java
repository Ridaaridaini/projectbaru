package day1BasicJava.latihan;

public class Soal9HasilPembagianParsing {
    public static void main(String[] args) {
        String strA = "10";
        String strB = "3";
        double doubleA = Double.parseDouble(strA);
        double doubleB = Double.parseDouble(strB);
        double hasilBagi = doubleA / doubleB;
        System.out.println("Hasil pembagian bilangan a dan b adalah :"+hasilBagi);
    }
}
