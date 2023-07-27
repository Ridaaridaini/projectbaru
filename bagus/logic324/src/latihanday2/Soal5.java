package latihanday2;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {

        Scanner hari = new Scanner(System.in);
        System.out.println("masukan angka= ");
        int days = hari.nextInt();
//        int day = days;
//        if(day == days){
            int weekdays = (days) % 7;
//            switch (weekdays){
//                case 1:
//                    System.out.println("senin");
//                    break;
//                case 2:
//                    System.out.println("selasa");
//                    break;
//                case 3:
//                    System.out.println("rabu");
//                    break;
//                case 4:
//                    System.out.println("kamis");
//                    break;
//                case 5:
//                    System.out.println("jumat");
//                    break;
//                case 6:
//                    System.out.println("sabtu");
//                    break;
//                case 7:
//                    System.out.println("minggu");
//                    break;
//            }
            if(weekdays==1){
                System.out.println("senin");
            } else if (weekdays==2) {
                System.out.println("selasa");
            } else if (weekdays==3) {
                System.out.println("rabu");
            } else if (weekdays==4) {
                System.out.println("kamis");
            } else if (weekdays==5) {
                System.out.println("jumat");
            }else if (weekdays==6){
                System.out.println("sabtu");
            } else if (weekdays==0) {
                System.out.println("minggu");
            }
    }
    }

