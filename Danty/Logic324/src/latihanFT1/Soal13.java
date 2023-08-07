package latihanFT1;

public class Soal13 {

    public static void main(String[] args) {


        int count = 0;
        int n = 3;
        int lock = 100;
        int start = lock;

        while (count < n) {


            for (; start >= 10; ) {

                String strStart = start + "";
                String[] arrStart = strStart.split("");

                int jumlah = 0;

                for (int i = 0; i < arrStart.length; i++) {

                    int digit = Integer.parseInt(arrStart[i]);
                    int digitKuadrat = digit * digit;
                    jumlah = jumlah + digitKuadrat;

                }
                if (jumlah == 1) {
                    System.out.println(lock + " adalah Si Angka 1");
                    count++;
                    lock++;
                    start = lock;
                    break;

                } else if(jumlah < 10){
                    lock++;
                    start = lock;
                    break;
                }

                start = jumlah;
            }
        }
    }
}
