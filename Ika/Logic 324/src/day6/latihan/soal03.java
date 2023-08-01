package day6.latihan;

import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;

public class soal03 {
    public static void main(String[] args) {
        //"Diinputkan sebuah nama, cetak awalan di tiap kata menggunakan huruf kapital.
        //Input :
        //Kalimat : Dwayne Doughlas Johnson
        //output :
        //DDJ"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat : ");
        String kalimat = scanner.nextLine();
        String kalimat1 = kalimat.toUpperCase();

        String[] output = kalimat1.split(" ");
        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
           char inisil = output[i].charAt(0);
            System.out.println(inisil);
        }


    }
}
