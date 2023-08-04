package day7.soalSimulasi;

public class PembahasanSoal10Fibonaci {
    public static void main(String[] args) {
        int n = 5;

        int[] arrFibo = new int[n];

        //asumsi panjang array minimal 2
        arrFibo[0] = 1;
        arrFibo[1] = 1;


        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] =  arrFibo[i-2] + arrFibo[i-1];

        }

    }

}
