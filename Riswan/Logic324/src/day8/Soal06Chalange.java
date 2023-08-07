package day8;

import java.util.Random;
import java.util.Scanner;

public class Soal06Chalange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int komputer = random.nextInt(10);
        boolean keputusan = true;
        while (true){
            System.out.println("Player Main dahulu pilih 1");
            System.out.println("Komputer Main dahulu pilih 2");
            System.out.print("Pilih : ");

            int main = input.nextInt();

            System.out.print("input angka anda / player : ");
            int player = input.nextInt();

            if(komputer ==player){
                System.out.println("You Draw");
            }else if (komputer>player){
                System.out.println("You Lose");
            }else {
                System.out.println("You Win");
            }
            System.out.println("Lagi : ya(1)/tidak(2)");
            int hasil = input.nextInt();
            if (hasil ==2){
                break;
            }
        }
    }
}
