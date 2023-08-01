package day5.latihan;

import java.util.Scanner;

public class Soal07 {
  public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] deret= {5,4,3,1,2,7,9,8};
        int jumlahAwal=0,jumlahGanjil=0,  jumlahGenap=0;
        System.out.print("awal: ");
        for (int i = 0; i < deret.length; i++) {
            if(i== deret.length-1){
                System.out.print(deret[i]+ " = ");
            }else
                System.out.print(deret[i]+" + ");
            jumlahAwal = jumlahAwal+ deret[i];
        }
        System.out.print(jumlahAwal);
        System.out.println();
        System.out.print("Ganjil: ");
        for (int i = 0; i < deret.length; i++) {
            if (i%2==1){
                if(i== deret.length-1) {
                  System.out.print(deret[i] + " = ");
                }else
                  System.out.print(deret[i]+" + ");
              jumlahGanjil = jumlahGanjil+ deret[i];
          }
        }
      System.out.print(jumlahGanjil);
      System.out.println();
      System.out.print("Genap: ");
      for (int i = 0; i < deret.length; i++) {
          if (i%2==0 && i!=0){
              if(i== deret.length-2) {
                  System.out.print(deret[i] + " = ");
              }else
                  System.out.print(deret[i]+" + ");
              jumlahGenap = jumlahGanjil+ deret[i];
          }
      }
      System.out.print(jumlahGenap);
      System.out.println();




      }


        }

