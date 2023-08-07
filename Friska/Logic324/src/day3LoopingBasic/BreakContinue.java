package day3LoopingBasic;

public class BreakContinue {
    public static void main(String[] args) {
        int a =1;
        for (;true;a++){
            if (a % 2 == 0){
                continue;
            }
        if ( a == 11){
            break;
            }
            System.out.println(a+"");

        }
    }

}
