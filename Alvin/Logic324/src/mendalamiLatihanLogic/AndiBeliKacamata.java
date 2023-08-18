package mendalamiLatihanLogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AndiBeliKacamata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("uang andi: ");
        int uang_andi = scanner.nextInt();

        scanner.nextLine();
        System.out.print("harga kacamata: ");
        String[] harga_kacamata = scanner.nextLine().replace(" ", "").split(",");

        System.out.print("harga baju: ");
        String[] harga_baju = scanner.nextLine().replace(" ", "").split(",");

        int[] arrHargaKacamata = new int[3];
        int[] arrHargaBaju = new int[3];
        String prizeCombine = "";

        for (int i = 0; i < 3; i++) {
            arrHargaKacamata[i] = Integer.parseInt(harga_kacamata[i]);
            arrHargaBaju[i] = Integer.parseInt(harga_baju[i]);
        }

        for (int i = 0; i < arrHargaKacamata.length; i++) {
            for (int j = 0; j < arrHargaBaju.length; j++) {
                prizeCombine += (arrHargaKacamata[i]+arrHargaBaju[j]) + " ";
            }
        }

        int[] arrPrizeCombine = new int[9];
        String[] prizeCombineStr = prizeCombine.trim().split(" ");
        for (int i = 0; i < 9; i++) {
            arrPrizeCombine[i] = Integer.parseInt(prizeCombineStr[i]);
        }


        for (int i = 0; i < arrPrizeCombine.length; i++) {
            if (arrPrizeCombine[i] > uang_andi){
                arrPrizeCombine[i] = 0;
            }
        }

        Arrays.sort(arrPrizeCombine);

        System.out.print(arrPrizeCombine[arrPrizeCombine.length-1]);




    }

}
