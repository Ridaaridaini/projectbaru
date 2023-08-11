package simulasift1;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String andi="andi", budi="budi", cindy="cindy",dedi="dedi",eki="eki";
        Integer a=85, b=70, c=90, d=75, e=100;
        System.out.println("Input1 ");
        String[] nama=input.nextLine().split(" ");
        System.out.println("Input2 ");
        String[] n=input.nextLine().split(" ");
        Integer[] nilai=new Integer[n.length];
        for (int i = 0; i < n.length; i++) {
            nilai[i]= Integer.valueOf(n[i]);
        }
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(andi)){
                if (nilai[i]==a){
                    System.out.print("true ");
                }else {
                    System.out.print("false ");
                }
            }else if (nama[i].equalsIgnoreCase(budi)) {
                if (nilai[i] == b) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (nama[i].equalsIgnoreCase(cindy)) {
                if (nilai[i] == c) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (nama[i].equalsIgnoreCase(dedi)) {
                if (nilai[i] == d) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }else if (nama[i].equalsIgnoreCase(eki)) {
                if (nilai[i] == e) {
                    System.out.print("true ");
                } else {
                    System.out.print("false ");
                }
            }
        }
    }
}
