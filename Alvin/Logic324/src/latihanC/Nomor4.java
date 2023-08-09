package latihanC;

import java.util.Scanner;

public class Nomor4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("input: ");
        String[] arrTimeFormat = scanner.nextLine().split(" ");
        String hasil = "";
        String[] arrTime = arrTimeFormat[0].split(":");
        int frontNumber = Integer.parseInt(arrTime[0]);
        int backNumber = Integer.parseInt(arrTime[1]);


            // untuk 24 jam ke 12 jam
        if (arrTimeFormat.length == 1){
            if (frontNumber > 12){
                hasil += frontNumber-12;
                hasil += ":" + arrTime[1]  + " PM";
            } else if (frontNumber< 12) {
                hasil += frontNumber;
                hasil += ":" + arrTime[1]  + " AM";
            } else {
                hasil += Integer.parseInt(arrTime[0]);
                hasil += ":" + arrTime[1]  + " PM";
            }

            // untuk 12 jam ke 24 jam
        }else{
            String formatTime = arrTimeFormat[1].toLowerCase();
            if (formatTime.equals("pm")){
                if (frontNumber==12 && backNumber > 0){
                    hasil += frontNumber;
                    hasil += ":" + arrTime[1];
                }else {
                    hasil += frontNumber+12;
                    hasil += ":" + arrTime[1];
                }
            } else if (formatTime.equals("am")) {
                if (frontNumber==12 && backNumber > 0){
                    hasil += "00";
                    hasil += ":" + arrTime[1];
                }else {
                    hasil += frontNumber;
                    hasil += ":" + arrTime[1];
                }
            }

        }


        System.out.println(hasil);


    }

}
