package day3;

public class BreakContinue {

    public static void main(String[] args) {

        //break : untuk menghentikan perulangan
        //continue: untuk melanjutkan ke for statement ke 3 tanpa perintah setelah continue

        int a = 0;

        for (; true; a++){
            if (a % 2 == 0){
                continue;
            }

            if (a == 11){
                break;
            }

            System.out.print(a + " ");

        }

    }

}
