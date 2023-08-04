package latihanB;

public class Fibonacci {
    public static void main(String[] args) {
        int i =0;
        int[] arrFibonacci = new int[5]; //{0,0,0,0,0}
        int fibonacci=1, past=1, current=1;

        for (i = 0; i < 5; i++) {

            if (i==0){
                arrFibonacci[i] = i;
                continue;
            }

            if (i == 1) {
                arrFibonacci[i] = i;
                continue;
            }

            arrFibonacci[i] = current;//0
            fibonacci = past+current;
            past = current;
            current = fibonacci;

        }
        System.out.print("deret fibonacci: ");
        for (int j = 0; j < 5; j++) {
            System.out.print(arrFibonacci[j] + " ");
        }
    }

}
