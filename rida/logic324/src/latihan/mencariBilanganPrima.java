package latihan;

public class mencariBilanganPrima {
    public static void main(String[] args) {
        int n=5;
        int[] arrPrima=new int[n];
        int a=2;
        for (int i = 0; i < arrPrima.length;) {
            int cekPrima= 0;
            for (int j = 2; j <=a ; j++) {
                if(a%j==0){
                    cekPrima=cekPrima+1;
                }
            }
            if (cekPrima==1){
                arrPrima[i]=a;
                i++;
            }
            a++;
        }
    }
}
