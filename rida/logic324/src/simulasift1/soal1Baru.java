package simulasift1;

import java.util.Scanner;

public class soal1Baru {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nilai a: ");
        int a= input.nextInt();
        System.out.println("Masukkan nilai b: ");
        int b= input.nextInt();
        System.out.println("Masukkan panjang deret: ");
        int n= input.nextInt();
        Integer[] deret=new Integer[n];
        int c=a+b;
        for (int i = 0; i < deret.length; i++) {
            deret[i]=c;
            c=c+(a+b);
            System.out.print(deret[i]+" ");
        }
    }
}
