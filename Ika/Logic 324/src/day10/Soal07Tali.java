package day10;

import java.util.Scanner;

public class Soal07Tali {
    public static void main(String[] args) {
        //belum
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan panjang tali: ");
        int z= scanner.nextInt();
        int hBagi =0;

        for(;z>1;){
            if(z%2==0){
                hBagi =hBagi + (z/2);
                z=z+1;
            } else if (z%3==0) {
                hBagi=hBagi +(z/3);
                z=z+1;
                
            }
            z=hBagi;
        }
        System.out.println(hBagi);




    }
}
