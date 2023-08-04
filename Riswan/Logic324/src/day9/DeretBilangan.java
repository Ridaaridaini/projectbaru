package day9;

public class DeretBilangan {
    public static void main(String[] args) {
        int n=5;//
        //prima 2,3,5,7,11

        int[] arrPrima = new int[n];

        int a = 2;//bilangan yang di cek
        for (int i = 0; i < arrPrima.length;) {
            //i buat penanda berapa bil prima yang udah ketemu
            int cekPrima = 0;
            for (int j = 1; j <=a ; j++) {
                //j untuk pengecek ada berapa angka yang bisa habis dibagi a
                if(a % j == 0){
                    cekPrima = cekPrima + 1;
                }
                //misal 2
                //perulangan 1 apakah habis dibagi 1
                //perulangan 2 apakah habis dibagi 2
                //->2 yang habis dibagi - bukan bilangan
            }
            if (cekPrima == 0){
                arrPrima[i]=a;
                i++;
            }
            a++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arrPrima[i]+" ");
        }
    }
}
