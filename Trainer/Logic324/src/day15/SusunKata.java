package day15;

import java.util.Scanner;

public class SusunKata {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kalimat : ");
        String kalimat = scanner.nextLine().toLowerCase().replace(" ","").replaceAll("[^A-Za-z]","");
        String[] arrKalimat = kalimat.split("");

        String tampung = "";
        String lastTampung = "";
        String indexSkip = "";

        for (int i = 0; i< arrKalimat.length;i++){
            if (indexSkip.contains(i+"")){
                continue;
            }
            String hurufSekarang = arrKalimat[i];
            for (int j = i; j < arrKalimat.length; j++) {
                if (tampung.equals("")){
                    tampung += hurufSekarang;
                    lastTampung = hurufSekarang;
                    break;
                } else {
                    if (hurufSekarang.equals(lastTampung)){
                        tampung += hurufSekarang;
                        break;
                    } else {
                        String hurufLanjutnya =arrKalimat[j];
                        if (j == arrKalimat.length-1 && !lastTampung.equals(hurufLanjutnya)){
                            tampung += hurufSekarang;
                            lastTampung = hurufSekarang;
                            break;
                        }

                        if (lastTampung.equals(hurufLanjutnya)){
                            tampung += hurufLanjutnya;
                            lastTampung = hurufLanjutnya;
                            indexSkip += (j + ",");

                            if (j == args.length-1){
                                tampung += hurufSekarang;
                                lastTampung += hurufSekarang;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(tampung);

    }
}
