package mendalamiLatihanLogic;

public class LoopBasicSoal02 {

    public static void main(String[] args) {

        int n = 7;

        int deret = 0;

        int i = 0;
        while (i < n){

            if (deret%2 == 0 && deret > 0){
                System.out.print(deret + " ");
                i++;
            }

            deret++;

        }

    }

}
