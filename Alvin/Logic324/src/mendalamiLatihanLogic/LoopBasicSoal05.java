package mendalamiLatihanLogic;

public class LoopBasicSoal05 {

    public static void main(String[] args) {

        int n = 7;

        int deret = 1;

        for (int i = 0; i < n;) {

                if (deret%3==0){
                    System.out.print("* ");
                }else {
                    System.out.print(deret + " ");
                }

                i++;


            deret += 4;

        }

    }

}
