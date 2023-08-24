package Catatan;

public class SoalRotasi {
    public static void main(String[] args) {

        int rotasi =3;
        int[] arrAngka = {7,3,9,9,2};
        int last = 0;
        for (int i = 0; i < rotasi; i++) {

            for (int j = 0; j < arrAngka.length; j++) {
                if(j==0){
                    last=arrAngka[0];
                }
                if(j==arrAngka.length-1){
                    arrAngka[j]=last;
                    System.out.print(arrAngka[j]);
                }else {
                    arrAngka[j] = arrAngka[j+1];
                    System.out.print(arrAngka[j]);
                }
            }
            System.out.println();
        }
    }
}
