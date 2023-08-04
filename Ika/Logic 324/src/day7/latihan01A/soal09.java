package day7.latihan01A;

import java.util.Random;
import java.util.Scanner;

public class soal09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();

        System.out.print("masukan banyak kartu: ");
        int n = scanner.nextInt();

        int kotakA = random.nextInt(10);
        int kotakB = random.nextInt(10);

        int nyawaPlayer = n;
        int nyawaKomputer=n;


        while (nyawaPlayer>0 && nyawaKomputer>0){
            scanner.nextLine();
            System.out.print("pilih kotak (A atau B) \nA. Kotak A \nB. Kotak B \npilihan: ");
            String  pilihan = scanner.nextLine();;

            System.out.print("masukan angka penawaran: ");
            int penawaran = scanner.nextInt();

            if(pilihan.equalsIgnoreCase("A")){
                if(kotakA>kotakB){
                    nyawaPlayer=nyawaPlayer+penawaran;
                    nyawaKomputer=nyawaKomputer-penawaran;
                    System.out.println("sisa nyawa pemain " + nyawaPlayer);
                    System.out.println("sisa nyawa komputer " + nyawaKomputer);
                } else if (kotakB>kotakA) {
                    nyawaPlayer=nyawaPlayer-penawaran;
                    nyawaKomputer=nyawaKomputer+penawaran;
                    System.out.println("sisa nyawa pemain " + nyawaPlayer);
                    System.out.println("sisa nyawa komputer " + nyawaKomputer);
                }else {
                    System.out.println("SERI!");
                }
            } else if (pilihan.equalsIgnoreCase("B")) {
                if(kotakB>kotakA){
                    nyawaPlayer=nyawaPlayer+penawaran;
                    nyawaKomputer=nyawaKomputer-penawaran;
                    System.out.println("sisa nyawa pemain " + nyawaPlayer);
                    System.out.println("sisa nyawa komputer " + nyawaKomputer);
                } else if (kotakA>kotakB) {
                    nyawaPlayer=nyawaPlayer-penawaran;
                    nyawaKomputer=nyawaKomputer+penawaran;
                    System.out.println("sisa nyawa pemain " + nyawaPlayer);
                    System.out.println("sisa nyawa komputer " + nyawaKomputer);
                }else {
                    System.out.println("SERI!");
                }
            }
        }

        if (nyawaPlayer < 1){
            System.out.println("ANDA KALAH");
        }

        if (nyawaKomputer < 1){
            System.out.println("ANDA MENANG");
        }
    }
}
