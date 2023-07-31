package day3;

public class BreakContinue {

    public static void main(String[] args) {

        //break => menghentikan perulangan
        //continue => langsung melanjutkan ke for statement 3
        //            tanpa eksekusi perintah setelah continue

        int a = 1; //a = 1 2
        for (;true;a++){
            if (a % 2 == 0){
                continue;
            }
            if (a == 11){
                break;
            }
            System.out.print(a + " ");

        }
        //1 2 3 4 5 6 7 8 ...
        //1. Cetak hanya sampai a maksimal 10 (pake break)
        //2. cetak hanya angka ganjil (pake continue)

    }

}
