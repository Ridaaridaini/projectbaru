package day7.soalSimulasi.SoalB;

public class Soal2BSiangka1 {
    public static void main(String[] args) {
        int count = 0;
        int lock = 104;
        int start = lock;
        int jumlah = 0;
        for (; start >= 10 ;) {
            String strStart = start + "";
            String [] arrStart = strStart.split("");

            int jum = 0;
            for (int i = 0; i < arrStart.length; i++) {
                int digit = Integer.parseInt(arrStart[i]);
                int digitKuadrat = digit * digit;
                jumlah = jumlah + digitKuadrat;
            }
            if(jumlah == 1){
                System.out.println(lock + " adalah si angka 1");
            }


        }
    }
}
