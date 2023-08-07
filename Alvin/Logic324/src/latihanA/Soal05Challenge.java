package latihanA;

import java.util.Scanner;

public class Soal05Challenge {

    public static void main(String[] args) {
// jika laki laki dewasa lebih banyak dari perempuan dewasa maka porsinya menambah 1
        Scanner scanner = new Scanner(System.in);

        String lakiDewasa="lakilakidewasa", womenDewasa="perempuandewasa", balita="balita", anakAnak="anakanak",
                remaja="remaja";
        String input = scanner.nextLine();

        String[] arrInput1 = input.split(";");
        double jumlah = 0;
        int jumOrang = 0;
        int jumLaki=0, jumPrem=0;

        for (int i = 0; i < arrInput1.length; i++) {
           String[] arrInput2 = arrInput1[i].replace("-", "").split("=");

           int orang =  Integer.parseInt(arrInput2[1].replace(" ", "").replace("orang", ""));

            if (arrInput2[0].replace(" ", "").equalsIgnoreCase(lakiDewasa)) {
                jumlah = jumlah + (orang*2);
                jumOrang = jumOrang + orang;
                jumLaki += orang;
            } else if (arrInput2[0].replace(" ", "").equalsIgnoreCase(womenDewasa)) {
                jumlah = jumlah + orang;
                jumOrang = jumOrang + orang;
                jumPrem += orang;
            } else if (arrInput2[0].replace(" ", "").equalsIgnoreCase(balita)) {
                jumlah = jumlah + orang;
                jumOrang = jumOrang + orang;
            } else if (arrInput2[0].replace(" ", "").equalsIgnoreCase(anakAnak)) {
                jumlah = jumlah + (orang*0.5);
                jumOrang = jumOrang + orang;
            } else if (arrInput2[0].replace(" ", "").equalsIgnoreCase(remaja)) {
                jumlah = jumlah + orang;
                jumOrang = jumOrang + orang;
            }
        }

        if (jumOrang%2!=0 && jumOrang>5){
            jumlah += jumPrem;
        }

        if (jumLaki>jumPrem){
            jumlah += jumLaki;
        }

        System.out.println(jumOrang + " orang");
        System.out.println(jumlah + " porsi");

    }

}
