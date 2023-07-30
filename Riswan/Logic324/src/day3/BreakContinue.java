package day3;

public class BreakContinue {
    public static void main(String[] args) {
        // break menghentikan perulangan
        // continue => langsung melanjutkan ke for statement

        int i=0;
        for (; true; i++) {
            if(i % 2 == 0){
                continue;
            }if (i==11){
                break;
            }
            System.out.print(i + " ");
        }
    }
}
