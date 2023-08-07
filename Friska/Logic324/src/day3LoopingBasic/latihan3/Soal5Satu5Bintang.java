package day3LoopingBasic.latihan3;

public class Soal5Satu5Bintang {
    public static void main(String[] args) {
        //Tips untuk ngitung bintang"
        //Tentuin dimana atau i ke berapa bintang selalu muncul

        int n = 7;
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 1){ // 0 1 2
                System.out.print("* "); //*
            }else{
                System.out.print(a +" ");//1
                a = a+4;//5
            }

        }

    }

}


