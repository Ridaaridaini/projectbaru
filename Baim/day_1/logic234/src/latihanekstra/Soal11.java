package latihanekstra;

import java.util.Scanner;

public class Soal11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Pulsa yang akan dibeli: ");
        int pulsa = scanner.nextInt();

        int point = 0;
        if(pulsa < 10000){
            System.out.println(point + " point");
        }

        if(pulsa > 10000 && pulsa >= 30000){
            point += 20000/1000;
        } else {
            point += (pulsa-10000)/1000;
        }

        if(pulsa > 30000){
            point += (pulsa - 30000)/1000*2;
        }

        System.out.println("Point yang didapatkan adalah: " + point);
    }
}
