package latihanB;

public class BilPrima {
    public static void main(String[] args) {
        int n = 5;

        int[] arrPrima = new int[n];

        int a = 2;
        for (int i = 0; i < arrPrima.length;) {

            int cekPrima = 0;
            for (int j = 1; j <= a; j++) {

                if(a % j == 0){
                    cekPrima =  cekPrima + 1;
                }
            }
            if (cekPrima == 2){
                arrPrima[i] = a;
                i++;
            }
            a++;
        }
        for (int i = 0; i < arrPrima.length; i++) {
            System.out.println(arrPrima[i]);
        }
    }
}
