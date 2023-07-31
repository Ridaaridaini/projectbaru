package day5.latihan5;

public class Soal3 {
    public static void main(String[] args) {
        int[] arrA = {2, 4, 6, 8, 10,13,14};

        //output
        for (int i = 0; i < arrA.length; i++) {
            if (i == arrA.length-1){
                System.out.println("dan "+arrA[i]);
            }else{

            System.out.print(arrA[i]+ ",");}
        }
    }
}
