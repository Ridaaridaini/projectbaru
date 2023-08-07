package day3LoopingBasic.latihan3;

public class Soal6 {
    public static void main(String[] args) {
        int n = 7;
        int a = 1;
        for (int i = 0; i <n ; i++) {
            if(i % 3 == 2) {
                System.out.print("* ");

            }else{
                System.out.print(a + " ");
                a = a+4;

            }
            
        }
    }
}
