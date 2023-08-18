package mendalamiLatihanLogic;

public class LoopBasicSoal01 {

    public static void main(String[] args) {

        int n =7;

        int deret = 0;
        for (int i = 0; i < n; ) {

            if (deret%2 != 0){
                System.out.print(deret + " ");
                i++;
            }

            deret ++;

        }

    }

}
