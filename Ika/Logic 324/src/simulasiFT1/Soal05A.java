package simulasiFT1;

import java.util.Scanner;

public class Soal05A {
    public static void main(String[] args) {

        //Budi mendapatkan 1 stempel indomaret setiap melakukan pembelian 1 coklat. 5 stempel indomaret bisa
        // ditukar dengan 1 coklat dan 1 stempel. Jika harga coklat adalah Rp. 3000,
        // berapakah jumlah maksimal coklat yang bisa didapatkan Budi dengan uang Rp. xxx?

        Scanner scanner = new Scanner(System.in);
        System.out.print("uang Budi: ");
        int uang = scanner.nextInt();
        int coklat=0;
        int stampel =0;
        int sisaUang=0;

        while (uang>=3000){
            if(uang>=3000){
                coklat = coklat+uang/3000;
                if(coklat%5==0){
                    stampel=coklat/5;
                    coklat=coklat+ coklat/5;
                }

                if(stampel%5==0){
                    coklat=coklat+stampel/5;
                }
            }
            System.out.println("coklat yang budi dapat : "+coklat);
            sisaUang =sisaUang+ uang%3000;
            System.out.println("sisa uang: "+sisaUang);
            uang=sisaUang;
            if(uang<3000){
                break;
            }

        }
    }
}
