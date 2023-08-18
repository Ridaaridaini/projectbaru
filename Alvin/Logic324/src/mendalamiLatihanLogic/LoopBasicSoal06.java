package mendalamiLatihanLogic;

public class LoopBasicSoal06 {

    public static void main(String[] args) {

        int n = 7;

        int deret = 1;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0){
                System.out.print("* ");
            }else {
                System.out.print(deret +" ");
                deret += 4;
            }

        }

    }

}
