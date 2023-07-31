package day5.latihan;

public class Soal07 {
    public static void main(String[] args) {
        int[] element = {5,4,3,1,2,7,9,8};
        int awal = 0;
        int ganjil = 0;
        int genap = 0;
        int panjangelement = element.length;

        for (int i = 0; i < element.length; i++) {
            awal = awal+ element[i];
        }
        System.out.println("Awal : "+ awal);
        for (int i = 1; i < panjangelement; i++) {
            if(i % 2 == 1){
                ganjil = ganjil + element[i];
            }
            if(i % 2 ==0){
                genap = genap +element[i];
            }
        }
        System.out.println("ganjil : "+ganjil);
        System.out.println("genap : "+genap);
    }
}
