package day5.latihan5;

public class Soal3 {
    public static void main(String[] args) {
        int[] element = {2, 4, 6, 8, 10};

        for (int i = 0; i< element.length;i++) {
            if (i == element.length - 1) {
                System.out.print("Dan " +element[i]);
            }else{
                System.out.print(element[i] + " , ");

            }
        }
        }
    }

