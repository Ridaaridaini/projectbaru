import java.util.Arrays;
import java.util.Scanner;

public class Soal09new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().split(" ");

        String tamp1="", temp2="", temp3="", temp4="", temp5="", temp6="";
        Arrays.sort(kalimat);
        for (int i = 0; i < kalimat.length; i++) {
            if(kalimat[i].length() <=2 && i>0){
                tamp1= tamp1 + kalimat[i] + ",";
                if(i== tamp1.length()-1){
                    continue;
                }else {
                    if(tamp1.length()>0){
                        tamp1 = tamp1 + ",";
                    }
                }
            } else if(kalimat[i].length() <=3) {
                temp2=temp2+kalimat[i] ;
                if(i== kalimat.length-1){
                    continue;
                }else {
                    if(i>0){
                        temp2 = temp2 + ",";
                    }
                }
            } else if(kalimat[i].length() <=4){
                temp3=temp3+kalimat[i] ;
                if(i== kalimat.length-1){
                    continue;
                }else {
                    if(i>0){
                        temp3 = temp3 + ",";
                    }
                }
            } else if(kalimat[i].length() <=5){
                temp4=temp4+kalimat[i];
                if(i== kalimat.length-1){
                    continue;
                }else {
                    if(i>0){
                        temp4 = temp4 + ",";
                    }
                }
            } else if(kalimat[i].length() <=6){
                temp5=temp5+kalimat[i] ;
                if(i== kalimat.length-1){
                    continue;
                }else {
                    if(i>0){
                        temp5 = temp5 + ",";
                    }
                }
            } else if(kalimat[i].length() <=7){
                temp6=temp6+kalimat[i];
                if(i== kalimat.length-1){
                    continue;
                }else {
                    if(i>0){
                        temp6 = temp6 + ",";
                    }
                }
            }
        }
        System.out.println(tamp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.print(temp5);
        System.out.println(temp6);


    }
}
