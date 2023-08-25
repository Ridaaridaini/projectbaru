package rumus;

public class DeretFibo {
    public static void main(String[] args) {
        int n = 5;//11235

        int[] arrFibo = new int[n];

        arrFibo[0] = 1;
        arrFibo[1] = 1;

        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i-2] +arrFibo[i-1];
        }
    }
}
