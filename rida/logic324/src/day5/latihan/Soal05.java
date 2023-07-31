package day5.latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] deret= {3,2,1,5,8};
        System.out.print("Input nilai yang dicari: ");
        int nilai= input.nextInt();
        input.nextLine();
        int j=0;
        for (int i = 0; i < deret.length; i++) {
            if (deret[i] == nilai){
                System.out.println("nilai "+nilai+ " ada dalam deret di posisi: "+i);
                j=j+1;
                break;
            }
            }
        if (j==0) {
            System.out.println("nilai " + nilai + " tidak ada dalam deret ");
        }

        }
    }

