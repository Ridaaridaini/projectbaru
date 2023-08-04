package day8;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gasoline = 0;

        System.out.print("Antar sampai ke : ");
        String rute = input.nextLine();
        String[] rute1 = rute.split(" - ");
        for (int i = 0; i < rute1.length; i++) {
            System.out.println(rute1[i]);
        }

        for (int i = 0; i < rute1.length-1; i++) {
            if(rute1[i].equalsIgnoreCase("toko")){
                if(rute1[i+1].equalsIgnoreCase("tempat 1")){
                    gasoline = gasoline + 0.8;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 2")){
                    gasoline = gasoline + 1.0;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 3")){
                    gasoline = gasoline + 1.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 4")){
                    gasoline = gasoline + 2.6;
                }
            } else if (rute1[i].equalsIgnoreCase("tempat 1")) {
                if(rute1[i+1].equalsIgnoreCase("toko")){
                    gasoline = gasoline + 0.8;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 2")){
                    gasoline = gasoline + 0.2;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 3")){
                    gasoline = gasoline + 0.8;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 4")){
                    gasoline = gasoline + 1.8;
                }
            }else if (rute1[i].equalsIgnoreCase("tempat 2")) {
                if(rute1[i+1].equalsIgnoreCase("toko")){
                    gasoline = gasoline + 1.0;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 1")){
                    gasoline = gasoline + 0.2;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 3")){
                    gasoline = gasoline + 0.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 4")){
                    gasoline = gasoline + 1.6;
                }
            }else if (rute1[i].equalsIgnoreCase("tempat 3")) {
                if(rute1[i+1].equalsIgnoreCase("toko")){
                    gasoline = gasoline + 1.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 1")){
                    gasoline = gasoline + 0.8;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 2")){
                    gasoline = gasoline + 0.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 4")){
                    gasoline = gasoline + 1.0;
                }
            }else if (rute1[i].equalsIgnoreCase("tempat 4")) {
                if(rute1[i+1].equalsIgnoreCase("toko")){
                    gasoline = gasoline + 2.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 1")){
                    gasoline = gasoline + 1.8;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 2")){
                    gasoline = gasoline + 1.6;
                }else if(rute1[i+1].equalsIgnoreCase("tempat 3")){
                    gasoline = gasoline + 1.0;
                }
            }
        }
        System.out.println("konsumsi : " + gasoline);
    }
}
