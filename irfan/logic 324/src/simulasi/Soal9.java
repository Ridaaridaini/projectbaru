package simulasi;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Soal9 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("panjang array : ");
        int n= input.nextInt();

        int[] deret=new int[n];
        int[] deret1=new int[n];

        int a=3,b=4,c=0;


        for (int i = 0; i < deret.length; i++) {
            deret[i]=a-1;

            a=a+3;
        }

        for (int i = 0; i < deret.length; i++) {
            deret1[i]=b/2;
            b=b+4;
        }

        for (int i = 0; i < deret.length; i++) {
            c= deret[i]+deret1[i];
            if (i== deret.length-1){
                System.out.print(c);
            }else{
                System.out.print(c+", ");
            }
        }

    }
}
