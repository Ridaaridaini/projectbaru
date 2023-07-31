package day5.latihan;

public class Soal03 {
    public static void main(String[] args) {
        int[] element = {2,4,6,8,10};

        for (int i = 0; i < element.length; i++) {
            if (i == element.length - 1){
                System.out.print("dan "+element[i]);
            }else {
                System.out.print(element[i] + ",");
            }
        }
    }
}
