package day6.latihan;

import java.util.Scanner;

public class soal05 {
    public static void main(String[] args) {
        //"Terdapat sebuah kalimat ""The quick brown fox jumps over a lazy dog“.
        //Buat program untuk mencari karakter di dalam kalimat tersebut?
        //contoh 1:
        //input : cari karakter ? o
        //output : karakter o ada dalam kalimat
        //contoh 2:
        //input : cari karakter ? 2
        //output : karakter 2 tidak ada kalimat"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("input yang dicari: ");
        String n = scanner.nextLine();

        int a= 0;
        String[] output = kalimat.replace(" ", "").split("");
        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
            if(output[i].equals(n)){
                System.out.println("karakter "+ n + " ada dalam kalimat");
                a=a+1;
                break;
            }
        }
        if(a==0){
            System.out.println("karakter " + n + " tidak ada dalam kalimat");
        }



    }
}
