package day9;

public class deretBilTriboNachi {
    public static void main(String[] args) {
        int n =5;

        int[] arrTribonaci = new int[n];

        arrTribonaci[0] =1;
        arrTribonaci[1]=1;
        arrTribonaci[2]=1;

        for (int i = 3; i < arrTribonaci.length; i++) {
            arrTribonaci[i]=arrTribonaci[i-3]+arrTribonaci[i-2]+arrTribonaci[i-1];
//            System.out.print(arrTribonaci[i] + " ");

        }

        for (int i = 0; i < arrTribonaci.length; i++) {
            System.out.println(arrTribonaci[i] + " ");

        }

    }
}
