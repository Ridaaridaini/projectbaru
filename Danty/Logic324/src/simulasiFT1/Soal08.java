package simulasiFT1;

import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("Nilai : ");
        String nilai = input.nextLine();

        String [] arrNama = nama.split(" ");
        String [] arrNilai = nilai.split(" ");

        for (int i = 0; i < arrNama.length; i++) {

            if(arrNama[i].equalsIgnoreCase("Andi") && arrNilai[i].equalsIgnoreCase("85")){

                System.out.print("True" + " ");

            } else if(arrNama[i].equalsIgnoreCase("Budi") && arrNilai[i].equalsIgnoreCase("70")) {

                System.out.print("True" + " ");

            } else if(arrNama[i].equalsIgnoreCase("Cindy") && arrNilai[i].equalsIgnoreCase("90")){

                System.out.print("True" + " ");

            } else if(arrNama[i].equalsIgnoreCase("Dedi") && arrNilai[i].equalsIgnoreCase("75")){

                System.out.print("True"+ " ");

            } else if(arrNama[i].equalsIgnoreCase("Eki") && arrNilai[i].equalsIgnoreCase("100")){

                System.out.print("True"+ " ");

            } else {
                System.out.print("False" + " ");

            }




        }






    }
}
