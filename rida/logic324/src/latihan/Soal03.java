package latihan;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        /*pola
        DIK:
        1 botol = 5 cangkir, 2 gelas.
        1 teko = 25 cangkir, 10 gelas.
        1 gelas= 2,5.
        String : Botol, cangkir, gelas, teko.
         */
        Scanner input= new Scanner(System.in);
        String botol= "botol";
        String cangkir= "cangkir";
        String gelas= "gelas";
        String teko= "teko";
        System.out.println("masukkan data1: ");
        String data1=input.nextLine();
        System.out.println("konversi ke- ");
        String data2=input.nextLine();
        //double botolCangkir=0,botolGelas=0,botolTeko=0,cangkirBotol=0,cangkirGelas=0;
        double sum=0;
        if (botol.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)){
            sum= 2 * 2.5;
            System.out.println("1 botol= "+sum+" cangkir");
        } else if (botol.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)) {
            sum=2.0;
            System.out.println("1 botol= "+sum+" gelas");
        }else if (botol.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)){
            sum=2.0/10;
            System.out.println("1 botol= "+sum+" teko");
        }
        if (cangkir.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)){
            sum=1/(2*2.5);
            System.out.println("1 Cangkir= "+sum+" Botol");
        }else if (cangkir.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)){
            sum=1/2.5;
            System.out.println("1 Cangkir= "+sum+" Gelas");
        }else if (cangkir.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)) {
            sum = 1.0 / 25;
            System.out.println("1 Cangkir= " + sum + " teko");
        }
        if (gelas.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)){
            sum =1.0/2;
            System.out.println("1 Gelas= " + sum + " botol");
        }else if (gelas.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)) {
            sum =2.5;
            System.out.println("1 Gelas= " + sum + " cangkir");
        }else if (gelas.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)) {
            sum =1.0/10;
            System.out.println("1 Gelas= " + sum + " teko");
        }
        if (teko.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)) {
            sum = 1.0/5;
            System.out.println("1 teko= " + sum + " botol");
        } else if (teko.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)) {
            sum =25.0 ;
            System.out.println("1 teko= " + sum + " cangkir");
        }else if (teko.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)) {
            sum =10.0;
            System.out.println("1 teko= " + sum + " gelas");
        }

    }
}
