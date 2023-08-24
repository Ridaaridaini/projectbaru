import java.util.Arrays;
import java.util.Scanner;

public class Soal09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] kalimat = scanner.nextLine().toLowerCase().split(" ");

        String tamp1="", temp2="", temp3="", temp4="", temp5="", temp6="";
        Arrays.sort(kalimat);
        for (int i = 0; i < kalimat.length; i++) {
            if(kalimat[i].length() <=2){
                tamp1= tamp1 + kalimat[i] + ",";
            } else if(kalimat[i].length() <=3) {
                temp2=temp2+kalimat[i] + ", ";
            } else if(kalimat[i].length() <=4){
                temp3=temp3+kalimat[i] + ", ";
            } else if(kalimat[i].length() <=5){
                temp4=temp4+kalimat[i] + ", ";
            } else if(kalimat[i].length() <=6){
                temp5=temp5+kalimat[i] + ", ";
            } else if(kalimat[i].length() <=7){
                temp6=temp6+kalimat[i]+ ", ";
            }
        }
        System.out.println(tamp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.println(temp5);
        System.out.println(temp6);


    }
}
