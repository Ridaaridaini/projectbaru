package latihan;

import java.util.Scanner;

public class Soal1Challenge {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Beli pulsa: ");
        int pulsa = scanner.nextInt();

        int point = 0;
        int bantu = 0;
        
        if(pulsa < 10000 || pulsa > 10000){
            point = 0;
        }
        
        if(pulsa >= 50000){
            bantu = pulsa /50000;
            point = bantu*100;
        }

        if(pulsa >= 30000){
            point += (20000/1000);
        } else {
            point += (pulsa/1000);
        }

        if(pulsa != 0){
            point += ((pulsa-30000)/1000)*2;
        }

        System.out.println(point);
    }
}
