package rumus;

public class BilanganPrima {
    public static void main(String[] args) {
        int n = 5;
        //Prima : 2 3 5 7 11

        int[] arrPrima = new int[n];

        int a = 2; //bilangan yang dicek
        for (int i = 0; i < arrPrima.length;) {
            //i buat penanda berapa bil prima yg udah ketemu
            int cekPrima = 0;
            for (int j = 1; j <= a; j++) {
                //j untuk pengecek ada berapa angka yang bisa habis membagi a
                if (a % j == 0){
                    cekPrima = cekPrima + 1;
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
