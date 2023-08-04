package day7.latihan01B;

import java.util.Scanner;

public class soal09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        String input = scanner.nextLine();

        int perjalanan=0;
        int gunung=0;
        int lembah=0;

        input=input.toUpperCase();
        String[] arrInput = input.replace(" ","").split("");
        for (int i = 0; i < arrInput.length; i++) {
            if(arrInput[i].equalsIgnoreCase("N")){
                perjalanan=perjalanan+1;

                if(perjalanan==0){
                    lembah=lembah+1;
                }
            } else if (arrInput[i].equalsIgnoreCase("T")) {
                perjalanan=perjalanan-1;
                if (perjalanan==0){
                    gunung=gunung+1;
                }
            }

        }

        System.out.println("gunung " + gunung);
        System.out.println("lembah " + lembah);

    }
}
