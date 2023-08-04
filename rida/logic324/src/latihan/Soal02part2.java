package latihan;

import java.util.Arrays;
import java.util.Scanner;

public class Soal02part2 {
    public static void main(String[] args) {
        char a='a', i='i',u='u',e='e',o='o';
        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String[] kata=input.nextLine().toLowerCase().replace(" ","").split("");
        Arrays.sort(kata);
        String vokal="",konsonan="";
        for (int j = 0; j < kata.length; j++) {
            char tmp=kata[j].charAt(0);
            if(tmp==a||tmp==i || tmp==u|| tmp==e ||tmp==o){
                vokal=vokal+String.valueOf(kata[j].charAt(0));
                continue;
            }else {
                konsonan=konsonan+String.valueOf(kata[j].charAt(0));
                continue;
            }
        }
        System.out.println("Huruf vokal : "+vokal);
        System.out.println("Huruf konsonan : "+konsonan);


        }



}
