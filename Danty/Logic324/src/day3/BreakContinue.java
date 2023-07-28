package day3;

public class BreakContinue {

    public static void main(String[] args) {


        int a = 1;
        for(;true;a++){

            if (a%2 == 0){
                continue;
            }
            if (a == 11){
                break;
            }
            System.out.println(a);

        //break -> menghentikan perulangan
        //continue -> melanjutkan perulangan langsung ke for statement 3 tanpa eksekusi perintah setelah continue

        //int a = 1;
        //for(;true;a++){
         //   System.out.print(a + " "); //petik 2 itu untuk spasi
        }

        //Contoh : Cetak hanya sampai a maksimal  10
        //maka setelah sout di tambah fungsi if ( a == 10) kemudian kurung kurawal kemudian enter break




    }


}
