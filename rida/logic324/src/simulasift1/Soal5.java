package simulasift1;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan jumlah uang");
        int uang=input.nextInt();
        input.nextLine();
        Integer a =uang/3000, b=0,c=uang/3000,d=0;
        if(c>=5){
            while (c>=5){
                c=c-5;
                b=b+1;
                c=c+1;
            }
            d=a+b;
            System.out.println("jumlah maksimal coklat yang di dapatkan budi ialah "+d+" dengan uang "+uang);
        }else
            System.out.println("jumlah maksimal coklat yang di dapatkan budi ialah "+a+" dengan uang "+uang);
    }
}
