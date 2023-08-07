package day9;

public class deretBilFibo {
    public static void main(String[] args) {
        int n =5;

        int[] arrFib = new int[n];
        //dengan ketentuan panjang deret harus lebih dari 2
        arrFib[0]=1;
        arrFib[1]=1;

        for (int i = 2; i < arrFib.length; i++) {
            arrFib[i]=arrFib[i-2]+arrFib[i-1];
//            System.out.print(arrFib[i]);
        }

        for (int i = 0; i < arrFib.length; i++) {
            System.out.println(arrFib[i] + " ");

        }





    }
}
