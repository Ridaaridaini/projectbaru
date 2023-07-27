package day3;

public class BreakContinue {
    public static void main(String[] args) {

        int i = 1;
        for (;; i++) {
            if (i % 2 != 0){
                continue;
            }
            if (i == 10){
                break;
            }
            System.out.println(i);
        }
    }
}
