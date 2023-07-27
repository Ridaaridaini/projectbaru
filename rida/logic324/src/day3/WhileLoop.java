package day3;

import java.sql.SQLOutput;

public class WhileLoop {
    public static void main(String[] args) {
        //while loop
        int i=0;
        while (i<5 /*kondisi apakah looping akan dilanjutkan*/){
            //body
            System.out.println("Hello");
            i++;
        }
        i=0; //tidak error karena masih satu scope
        System.out.println();
        //do while loop
        do{
            System.out.println(i);
            i++;
        }while(i<5);
    }
}
