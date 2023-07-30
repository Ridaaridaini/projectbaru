package day4.latihan.loop;

import java.util.Random;
import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        //permainan kartu gag
        //anda dan komputer akan dibekali kartu/gambaran masing-masing sebanyak n.
        //kemudian akan mengacak angka 0-9 dan memilih 2 angka secara rahasia/tertutup dan dimasukan
        //kedalam kondisi


        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("masukan banyak gambar n: ");
        int n = input.nextInt();

        int angkaRandomA = random.nextInt(10);
        int angkaRandomB = random.nextInt(10);

        for (int i = 0; i < n; i++){
            System.out.print("masukan jumlah kartu taruhan m: ");
            int m = input.nextInt();

            input.nextLine();
            System.out.print("pilih kotak A atau B : ");
            String kotak = input.nextLine();

            int nUser = n;
            int nRandom = n;
            if (kotak.equalsIgnoreCase("A")){
                if (angkaRandomA>angkaRandomB){
                    nUser = nUser +  m;
                    nRandom = nRandom - m;
                    System.out.println("sisa kartu user " +nUser);
                    System.out.println("sisa kartu komputer " + nRandom);
                    System.out.println();
                }else if(angkaRandomA<angkaRandomB) {
                    nUser = nUser - m;
                    nRandom = nRandom + m;
                    System.out.println("sisa kartu user " +nUser);
                    System.out.println("sisa kartu komputer " + nRandom);
                    System.out.println();
                }else {
                    System.out.println("SERI");
                    continue;
                }

            } else{
                if (angkaRandomA>angkaRandomB){
                    nUser = nUser +  m;
                    nRandom = nRandom - m;
                    System.out.println("sisa kartu user " +nUser);
                    System.out.println("sisa kartu komputer " + nRandom);
                    System.out.println();
                }else if(angkaRandomA<angkaRandomB) {
                    nUser = nUser - m;
                    nRandom = nRandom + m;
                    System.out.println("sisa kartu user " +nUser);
                    System.out.println("sisa kartu komputer " + nRandom);
                    System.out.println();
                }else {
                    System.out.println("SERI");
                    continue;
                }
            }

            if(nRandom<1){
                System.out.println("ANDA MENANG");
                break;
            }

            if(nUser<1){
                System.out.println("ANDA KALAH");
                break;
            }

        }

    }
}
