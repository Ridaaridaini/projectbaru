package day10;


import java.util.Arrays;
import java.util.Scanner;

public class Soal10KonsonanVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String kalimat = scanner.nextLine();

        kalimat=kalimat.toLowerCase().replace(" ","");
        String[] arrKal = kalimat.split("");
        Arrays.sort(arrKal);
        String vok ="";
        String  kons = "";

        for (int i = 0; i < arrKal.length; i++) {
            if (arrKal[i].equals("a") || arrKal[i].equals("i") || arrKal[i].equals("u") || arrKal[i].equals("e") || arrKal[i].equals("o")){
                if(!vok.contains(arrKal[i])){
                    if(vok.length()>0){
                        vok+= "-";
                    }
                }
                vok=vok+arrKal[i];
            }else if(!(arrKal[i].equals("a") || arrKal[i].equals("i") || arrKal[i].equals("u") || arrKal[i].equals("e") || arrKal[i].equals("o"))){
               if(!kons.contains(arrKal[i])){
                   if(kons.length()>0){
                       kons=kons + "-";
                   }
               }
               kons=kons + arrKal[i];
            }
        }

        System.out.print("vokal : "  + vok);
        System.out.println();
        System.out.println("konsonan : " + kons);

    }

}
