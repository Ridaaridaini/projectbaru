package day1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //Instansiasi
        Scanner input = new Scanner(System.in); //Memasukkan nilai variabel di dalam variabel yang merupakan class harus menggunakan new nama_kelas (System.in)

        System.out.print("Nama : ");
        String nama = input.nextLine();

       //input.close(); //untuk menutup scanner

        System.out.println(nama);


    }


}
