package day1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //Instansiasi
        Scanner input = new Scanner(System.in);

        System.out.println("nama: ");
        String nama = input.nextLine();
        System.out.println("umur: ");
        Integer umur = input.nextInt();
        input.close();
        System.out.println(nama);
        System.out.println(umur);



    }
}
