package latihan;

import java.util.Scanner;

public class Soal5Challage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputan = scanner.nextLine();

        String[] arrA = inputan.split(";"); // arrA ["Laki-laki dewasa = 3 orang" ]

        double jumlah = 0;
        int jumlahOrang = 0;
        double laki = 2;
        
        for (int i = 0; i < arrA.length; i++) {
        String[] arrB = arrA[i].replace("-","").split("="); // arrB[i]= ["Lakilaki dewasa" , "= 3 orang" ]
        int orang = Integer.parseInt(arrB[1].replace(" ","").replace("orang","")); // [3]
        
            if("lakilakidewasa".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())){
                jumlah = jumlah + (orang * 2); // menghitung porsi
                jumlahOrang = jumlahOrang + orang; // menghitung orang
            
            } else if ("perempuandewasa".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
                jumlah = jumlah + orang; // porsi
                jumlahOrang = jumlahOrang + orang;
            } else if ("remaja".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
                jumlah = jumlah + orang;
                jumlahOrang = jumlahOrang + orang;
            } else if ("anakanak".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
                jumlah = jumlah + orang * 0.5;
                jumlahOrang = jumlahOrang + orang;
                
            } else if ("balita".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
                jumlah = jumlah + orang;
                jumlahOrang = jumlahOrang + orang;
            }

        }

        for (int i = 0; i < arrA.length; i++) {
            String[] arrB = arrA[i].replace("-","").split("="); // arrB[i]= ["Lakilaki dewasa" , "= 3 orang" ]
            int orang = Integer.parseInt(arrB[1].replace(" ","").replace("orang","")); // [3]

            if (jumlahOrang>5 && jumlahOrang%2!=0){

                if ("perempuandewasa".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
                    jumlah = jumlah + orang;
//                    laki = laki + jumlah;
                }

            }

//            if ("lakilakidewasa".equalsIgnoreCase(arrB[0].replace(" ","").toLowerCase())) {
//                jumlah = jumlah + orang ;
//            }

        }
            System.out.println(jumlahOrang+" orang");
            System.out.println(jumlah+" porsi");


    }
}
