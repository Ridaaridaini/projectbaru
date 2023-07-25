package day1;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        //Instansiasi
        Scanner input = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Umur : ");
        input.nextInt();

        //Kasus khusus
        //Jika setelah nextInt() ada nextLine()
        //dikasih input.nextLine() sebelum nextLine()
        input.nextLine();

        System.out.print("Hobi : ");
        String hobi = input.nextLine();

        input.close();

        System.out.println(nama);
    }

}
