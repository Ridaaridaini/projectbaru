package day3;

public class breakContinue {
    public static void main(String[] args) {

        // break = menghentikan perulangan
        //continue == langsung melanjutkan ke for statment (3) tanpa eksekusi perintah setelah continue



        int a= 1;
        for(;true;){
            if(a%2==0){
                continue;
            }
            if(a==11){
                break;
            }
            System.out.print(a + " ");

            // 1. cetak hanya samapi a maksimal 10 (pakai break)
            // 2. hanya mencetak angka ganjil saja

        }


    }

}
