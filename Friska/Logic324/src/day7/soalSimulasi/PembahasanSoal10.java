package day7.soalSimulasi;

public class PembahasanSoal10 {
    public static void main(String[] args) {
        int n = 5;
        int [] arrPrima = new int[n];

        int a = 2;
        for (int i = 0; i < arrPrima.length;) {
            //i buat penanda bilangan prima yang udah ketemu
            int cekPrima = 0;
            for (int j = 1; j <= a ; j++) {
                //j untuk mengecek ada berapa angka yang bisa habis membagi a
                if(a % j == 0){
                    cekPrima = cekPrima+1;
                }

            }
            if(cekPrima == 2){
                arrPrima[i] = a;
                i++;
            }
            a++;

        }
    }
}
