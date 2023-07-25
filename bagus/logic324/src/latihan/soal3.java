package latihan;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner biodata =  new Scanner(System.in);

        System.out.print("masukan nama: ");
        String nama = biodata.nextLine();

        System.out.print("masukan umur: ");
        Integer umur = biodata.nextInt();

        biodata.nextLine();

        System.out.print("masukan moto hidup: ");
        String moto = biodata.nextLine();


        System.out.println("Nama: " +nama);
        System.out.println("Umur: " +umur);
        System.out.println("Motto Hidup: " +moto);


        biodata.close();
    }

}
