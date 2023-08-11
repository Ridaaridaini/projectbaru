package simulasift1;

import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan panjang array: ");
        int n= input.nextInt();
        int[] deret=new int[n];
        int a=2,b=0;
        for (int i = 0; i < deret.length; i++) {
            if (i== deret.length-1){
                deret[i]=a;
                a=a+2;
                b=deret[i]*2;
                System.out.print(b);
            }else{
                deret[i]=a;
                a=a+2;
                b=deret[i]*2;
                System.out.print(b+", ");
            }

        }
    }
}
