package day6.latihan;

import java.util.Scanner;

public class soal08 {
    public static void main(String[] args) {
        //"Input
        //Susilo Bambang Yudhoyono
        //Output
        //S***o B***g Y***o"

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String input = scanner.nextLine();

        String[] output = input.split(" ");
        for (int i = 0; i < output.length; i++) {
//            System.out.println(output[i]);
            String[] output1 = output[i].split("");

            for (int j = 0; j < output[i].length(); j++) {
                if(j==0){
                    String b= output1[j].toUpperCase();
                    System.out.print(b);
                }else if(j== output[i].length()-1){
                    System.out.print(output1[j]);
                }else{
                    System.out.print("*");
                }

            }
            System.out.print(" ");

        }

    }
}
