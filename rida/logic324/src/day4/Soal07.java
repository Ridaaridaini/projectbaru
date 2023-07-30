package day4;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("jumlah kartu: ");
        Integer kartuKomputer = input.nextInt();
        input.nextLine();
        String kotakA= "A";
        String kotakB= "B";
        int kartuUser= kartuKomputer;
        int jumlahKartu=0;
        int n=kartuKomputer*2;
        //System.out.println(jumlahKartu+" "+kartuKomputer+" "+kartuUser+" "+kotakA+" "+kotakB);
        do {
            Random randomGeneerator = new Random();
            System.out.print("masukkan jumlah tawaran: ");
            Integer m= input.nextInt();
            input.nextLine();
            System.out.println("Pilih kotak, A atau B : ");
            String kotak = input.nextLine();
            if (kotak.equalsIgnoreCase(kotakA)){
                int intA = randomGeneerator.nextInt( 10);
                int intB = randomGeneerator.nextInt( 10);
                if (intA > intB){
                    kartuUser= kartuUser+m;
                    kartuKomputer= kartuKomputer-m;
                    System.out.println("You Win");
                    System.out.println("angka pada kartu A "+intA +" > " +intB);
                    System.out.println("Sisa kartu anda "+kartuUser+" Sisa kartu lawan "+kartuKomputer);
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                } else if (intA < intB) {
                    kartuUser= kartuUser-m;
                    kartuKomputer= kartuKomputer+m;
                    System.out.println("You Lose");
                    System.out.println("angka pada kartu A "+intA +" < " +intB);
                    System.out.println("Sisa kartu anda "+kartuUser+" Sisa kartu lawan "+kartuKomputer);
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                }else {
                    System.out.println("angka pada kartu A "+intA +" sama dengan " +intB);
                    System.out.println("you are Balanced");
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                }
                System.out.println(jumlahKartu);
                continue;
            }
            if (kotak.equalsIgnoreCase(kotakB)){
                int intA = randomGeneerator.nextInt( 10);
                int intB = randomGeneerator.nextInt( 10);
                if (intA > intB){
                    kartuUser= kartuUser-m;
                    kartuKomputer= kartuKomputer+m;
                    System.out.println("You Lose");
                    System.out.println("angka pada kartu A "+intB +" < " +intA);
                    System.out.println("Sisa kartu anda "+kartuUser+" Sisa kartu lawan "+kartuKomputer);
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                } else if (intA < intB) {
                    kartuUser= kartuUser+m;
                    kartuKomputer= kartuKomputer-m;
                    System.out.println("You Win");
                    System.out.println("angka pada kartu A "+intB +" > " +intA);
                    System.out.println("Sisa kartu anda "+kartuUser+" Sisa kartu lawan "+kartuKomputer);
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                }else {
                    System.out.println("angka pada kartu A "+intA +" sama dengan " +intB);
                    System.out.println("you are Balanced");
                    if (kartuKomputer > kartuUser){
                        jumlahKartu= kartuKomputer;
                    } else {
                        jumlahKartu= kartuUser;
                    }
                }
                System.out.println(jumlahKartu);
                continue;
            }
        }while(jumlahKartu == n);





    }
}
