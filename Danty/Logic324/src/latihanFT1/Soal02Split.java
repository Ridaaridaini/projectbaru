package latihanFT1;

public class Soal02Split {

    public static void main(String[] args) {

        //Mmembuat inputan string yang nanti di split.

        String rute = "Toko-Tempat 1-Tempat 2-Tempat 3-Tempat 4";


        String [] arrRute = rute.split("-");

        for (int i = 0; i < arrRute.length; i++) {
            System.out.println(arrRute[i]);

        }

    }
}
