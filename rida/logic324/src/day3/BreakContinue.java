package day3;

public class BreakContinue {
    public static void main(String[] args) {
        // break =>menghentikan perulangan
        //continue =>
        int a=1; //a = 1 2
        for (;true;a++){
            if (a%2==0){
                continue;
            }
            if (a==11){
                break;
            }
            System.out.println(a+" ");
        }
    }
}
