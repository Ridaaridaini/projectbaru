package day5.latihan;

public class Soal02 {
    public static void main(String[] args) {
        int[] element = {2,4,6,8,10};
        int jumlah = element.length;
        for (int i = 0;  jumlah>i; jumlah--) {
            System.out.print(element[jumlah-1]+" ");
        }
    }
}
