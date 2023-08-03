package latihanA;

import java.util.Scanner;

public class Soal05v2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pesan ? ");
        System.out.print("Y/N: ");
        double totalPorsi= 0;
        int helper = 0;

        String pesan = input.nextLine();
        while (pesan.equalsIgnoreCase("Y")){

            System.out.println("1.Laki \n2.Perempuan \n3.Remaja\n4.Anak\n5.Balita");
            int pilihan = input.nextInt();
            switch (pilihan){
                case 1:
                    System.out.println("Masukan Porsi : ");
                    int orangDewasaL = input.nextInt();
                    totalPorsi += (orangDewasaL*2);
                    break;
                case 2:
                    System.out.println("Masukan Porsi : ");
                    int orangDewasaP = input.nextInt();
                    helper += orangDewasaP;
                    totalPorsi += orangDewasaP;
                    break;
                case 3:
                    System.out.println("Masukan Porsi : ");
                    int remaja = input.nextInt();
                    totalPorsi += remaja;
                    break;
                case 4:
                    System.out.println("Masukan Porsi : ");
                    int anak = input.nextInt();
                    totalPorsi += (anak *0.5);
                    break;
                case 5:
                    System.out.println("Masukan Porsi : ");
                    int balita = input.nextInt();
                    totalPorsi += balita;
                    break;
                default:
                    System.out.println("Salah Su");
                    break;
            }


//
            System.out.println("Pesan ? ");
            System.out.print("Y/N: ");

            pesan = input.next();


        }
        if (totalPorsi%2!=0 && totalPorsi>5){

            int tambahan = helper *2;
            System.out.println(totalPorsi+tambahan);
        }else {
            System.out.println(totalPorsi);
        }


    }

}
