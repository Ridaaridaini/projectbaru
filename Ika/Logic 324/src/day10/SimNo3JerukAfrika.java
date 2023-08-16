package day10;

import java.util.Scanner;

public class SimNo3JerukAfrika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        String input = scanner.nextLine();

        String[] arrInput=input.replace(" ", "").split("");
        for (int i = arrInput.length-1; i >=0 ; i--) {
            for (int j = 0; j < arrInput.length; j++) {
                if(arrInput.length % 2==0){
                    if(j== arrInput.length/2) {
                        System.out.print(arrInput[i]);
                    }
                        System.out.print( "*");
                }else {
                    if(j== arrInput.length/2){
                            System.out.print(arrInput[i]);
                    }else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }

}
