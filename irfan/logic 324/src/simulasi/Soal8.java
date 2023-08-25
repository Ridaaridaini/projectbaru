package simulasi;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {

        String andi="andi",budi="budi",cindy="cindy",dedi="dedi",eki="eki";
        Integer nilaiA=85, nilaiB=70, nilaiC=90, nilaiD=75, nilaiE=100;

        Scanner input=new Scanner(System.in);

        System.out.print("input1 : ");
        String[] nama=input.nextLine().split(" ");

        System.out.print("Input2 : ");
        String[] nilai=input.nextLine().split(" ");

        Integer[] tampung= new Integer[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            tampung[i]=Integer.valueOf(nilai[i]);
        }
        for (int i = 0; i < nama.length; i++) {
            if(nama[i].equalsIgnoreCase(andi)){
                if(tampung[i]==nilaiA){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if(nama[i].equalsIgnoreCase(budi)){
                if(tampung[i]==nilaiB){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if(nama[i].equalsIgnoreCase(cindy)){
                if(tampung[i]==nilaiC){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if(nama[i].equalsIgnoreCase(dedi)){
                if(tampung[i]==nilaiD){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }
            if(nama[i].equalsIgnoreCase(eki)){
                if(tampung[i]==nilaiE){
                    System.out.print("True ");
                }else {
                    System.out.print("False ");
                }
            }

        }
    }

}

