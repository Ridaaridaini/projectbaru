package latihan;

import java.util.Scanner;

public class Soal03part2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Banyak \"Si Angka 1\" yang ingin di outputkan: ");
        Integer n=input.nextInt();
        Integer start=100;
        Integer a=0, b=109;
        while (a<n) {
            while (b > 9) {
                String[] arrSplit = String.valueOf(b).split("");
                Integer hasil = 0;
                for (int i = 0; i < arrSplit.length; i++) {
                    Integer angka = Integer.valueOf(arrSplit[i]);
                    hasil = hasil + (angka * angka);
                }
                if (hasil>9){
                    b=hasil;
                    continue;
                } if (hasil <= 9) {
                    if (hasil==1){
                        System.out.println(start+" adalah\"Si Angka 1\" ");
                        start=start+1;
                        b=start;
                        a=a+1;
                        break;
                    }else{
                        start=start+1;
                        b=start;
                        break;
                    }
                }
            }
        }

    }
}
