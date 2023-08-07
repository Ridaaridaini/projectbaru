package day9.presentasi;

import java.util.Scanner;

public class Soal03aTekochal {
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
        String data1=input.nextLine();//cangkir
        System.out.println("berpa yang ingin di konversikan: ");
        double n=input.nextDouble();
        input.nextLine();
        System.out.println("konversi ke- ");
        String data2=input.nextLine();//teko
        //double botolCangkir=0,botolGelas=0,botolTeko=0,cangkirBotol=0,cangkirGelas=0;
        double sum=0;
        if (botol.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)){//false
            sum= (2 * 2.5)*n;
            System.out.println(n+" botol= "+sum+" cangkir");
        } else if (botol.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)) {
            sum=2.0*n;
            System.out.println(n+" botol= "+sum+" gelas");
        }else if (botol.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)){
            sum=(2.0/10)*n;
            System.out.println(n+" botol= "+sum+" teko");
        }
        if (cangkir.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)){
            sum=(1/(2*2.5))*n;
            System.out.println(n+" Cangkir= "+sum+" Botol");
        }else if (cangkir.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)){
            sum=(1/2.5)*n;
            System.out.println(n+" Cangkir= "+sum+" Gelas");
        }else if (cangkir.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)) {//true
            sum = (1.0 / 25)*n;//0.04
            System.out.println(n+" Cangkir= " + sum + " teko");
        }
        if (gelas.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)){
            sum =(1.0/2)*n;
            System.out.println(n+" Gelas= " + sum + " botol");
        }else if (gelas.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)) {
            sum =2.5*n;
            System.out.println(n+" Gelas= " + sum + " cangkir");
        }else if (gelas.equalsIgnoreCase(data1)&& teko.equalsIgnoreCase(data2)) {
            sum =(1.0/10)*n;
            System.out.println(n+" Gelas= " + sum + " teko");
        }
        if (teko.equalsIgnoreCase(data1)&& botol.equalsIgnoreCase(data2)) {
            sum = (1.0/5)*n;
            System.out.println(n+" teko= " + sum + " botol");
        } else if (teko.equalsIgnoreCase(data1)&& cangkir.equalsIgnoreCase(data2)) {
            sum =25.0 *n;
            System.out.println(n+" teko= " + sum + " cangkir");
        }else if (teko.equalsIgnoreCase(data1)&& gelas.equalsIgnoreCase(data2)) {
            sum =10.0*n;
            System.out.println(n+" teko= " + sum + " gelas");
        }
    }
}
