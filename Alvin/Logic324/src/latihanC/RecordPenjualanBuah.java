package latihanC;

import java.util.Scanner;

public class RecordPenjualanBuah {

    public static void main(String[] args) {

        int apel=0, jeruk=0, mangga=0, pisang=0;

        Scanner scanner = new Scanner(System.in);

        String[] arrBuah = scanner.nextLine().toLowerCase().split(",");

        for (int i = 0; i < arrBuah.length; i++) {
            String[] arrRecordBuah = arrBuah[i].split(":");

            if (arrRecordBuah[0].equals("apel")){
                apel += Integer.parseInt(arrRecordBuah[1]);
            } else if (arrRecordBuah[0].equals("jeruk")) {
                jeruk += Integer.parseInt(arrRecordBuah[1]);
            } else if (arrRecordBuah[0].equals("mangga")) {
                mangga += Integer.parseInt(arrRecordBuah[1]);
            } else if (arrRecordBuah[0].equals("pisang")) {
                pisang += Integer.parseInt(arrRecordBuah[1]);
            }else {
                System.out.println("Waspada! Ada buah asing!");
            }
        }

        System.out.println("Apel: "+apel);
        System.out.println("Jeruk: "+jeruk);
        System.out.println("Mangga: "+mangga);
        System.out.println("Pisang: "+pisang);

    }

}
