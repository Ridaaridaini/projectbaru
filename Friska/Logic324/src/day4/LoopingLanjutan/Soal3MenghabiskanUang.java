package day4.LoopingLanjutan;

import java.util.Scanner;

public class Soal3MenghabiskanUang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah uang: ");
        long jumUang = input.nextInt();
        while (jumUang >= 50000) {
            if (jumUang >= 750000) { // 850000
                jumUang = jumUang - 750000; // 10000
                System.out.println("jas"); // jas
            } else if (jumUang >= 350000) {
                jumUang = jumUang - 350000;
                System.out.println("celana");
            } else if (jumUang >= 250000) {
                jumUang = jumUang - 250000;
                System.out.println("kaos");
            } else if(jumUang >= 10000){
                jumUang = jumUang-100000;
                System.out.println("kaos");
            } else{
                jumUang = jumUang-50000;
                System.out.println("celana pendek");
            }
        }
        }
    }    
            





//looping selama uang masih bersisa dan jumlahkan item yang paling murah asalkan uang masih cukup