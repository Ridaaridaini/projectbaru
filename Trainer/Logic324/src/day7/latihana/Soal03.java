package day7.latihana;

import java.util.Scanner;

public class Soal03 {

    public static void main(String[] args) {
        String botol = "botol";
        String gelas = "gelas";
        String teko = "teko";
        String cangkir = "cangkir";

        //Diketahui
        double botolGelas = 2;
        double gelasBotol = 1/botolGelas; //0.5

        double tekoCangkir = 25;
        double cangkirTeko = 1/tekoCangkir; //0.04

        double gelasCangkir = 2.5;
        double cangkirGelas = 1/gelasCangkir; //0.4

        double botolCangkir = botolGelas * gelasCangkir; //5
        double cangkirBotol = 1/botolCangkir; //0.2

        double tekoGelas = tekoCangkir / gelasCangkir; //10
        double gelasTeko = 1/tekoGelas; //0.1

        double tekoBotol = (tekoCangkir / gelasCangkir) / botolGelas; //5
        double botolTeko = 1/tekoBotol; //0.2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Konversi");
        System.out.println("Contoh : 1 botol = ... cangkir");
        String input = scanner.nextLine();

        String[] arrInput = input.split(" ");
        String a = arrInput[1];
        String b = arrInput[4];

        double hasilKonversi = 0.0;

        //From botol
        if (a.equalsIgnoreCase(botol) && b.equalsIgnoreCase(botol)){
            hasilKonversi = 1;
        } else  if (a.equalsIgnoreCase(botol) && b.equalsIgnoreCase(gelas)){
            hasilKonversi = botolGelas;
        } else  if (a.equalsIgnoreCase(botol) && b.equalsIgnoreCase(teko)){
            hasilKonversi = botolGelas;
        } else  if (a.equalsIgnoreCase(botol) && b.equalsIgnoreCase(cangkir)){
            hasilKonversi = botolGelas;
        }
        //from gelas
        else if (a.equalsIgnoreCase(gelas) && b.equalsIgnoreCase(gelas)){
            hasilKonversi = 1;
        } else  if (a.equalsIgnoreCase(gelas) && b.equalsIgnoreCase(botol)){
            hasilKonversi = gelasBotol;
        } else  if (a.equalsIgnoreCase(gelas) && b.equalsIgnoreCase(teko)){
            hasilKonversi = gelasTeko;
        } else  if (a.equalsIgnoreCase(gelas) && b.equalsIgnoreCase(cangkir)){
            hasilKonversi = gelasCangkir;
        }
        //from teko
        else if (a.equalsIgnoreCase(teko) && b.equalsIgnoreCase(teko)){
            hasilKonversi = 1;
        } else  if (a.equalsIgnoreCase(teko) && b.equalsIgnoreCase(gelas)){
            hasilKonversi = tekoGelas;
        } else  if (a.equalsIgnoreCase(teko) && b.equalsIgnoreCase(botol)){
            hasilKonversi = tekoBotol;
        } else  if (a.equalsIgnoreCase(teko) && b.equalsIgnoreCase(cangkir)){
            hasilKonversi = tekoCangkir;
        }
        //form cangkir
        else if (a.equalsIgnoreCase(cangkir) && b.equalsIgnoreCase(cangkir)){
            hasilKonversi = 1;
        } else  if (a.equalsIgnoreCase(cangkir) && b.equalsIgnoreCase(gelas)){
            hasilKonversi = cangkirGelas;
        } else  if (a.equalsIgnoreCase(cangkir) && b.equalsIgnoreCase(botol)){
            hasilKonversi = cangkirBotol;
        } else  if (a.equalsIgnoreCase(cangkir) && b.equalsIgnoreCase(teko)){
            hasilKonversi = cangkirTeko;
        }

        System.out.println("1 " + a + " = " + hasilKonversi + " " + b);
    }

}
