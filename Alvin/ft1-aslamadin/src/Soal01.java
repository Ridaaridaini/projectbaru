import java.util.Scanner;

public class Soal01 {
    public static void main(String[] args) {

        //selesai completed
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        String[] n = scanner.nextLine().split(" ");
        int[] arrN = new int[n.length];

        String ganjilStr = "";

        for (int i = 0; i < n.length; i++) {
            arrN[i] = Integer.parseInt(n[i]);
            //tambah
            if (arrN[i]%2!=0){
                ganjilStr += arrN[i] + " ";
            }
        }
        String[] arrNganjilStr = ganjilStr.trim().split(" ");
        int[] arrNganjil = new int[arrNganjilStr.length];

        for (int i = 0; i < arrNganjil.length; i++) {
            int hasil = 0;

            for (int j = 0; j < arrNganjil.length ; j++) {

                arrNganjil[j] = Integer.parseInt(arrNganjilStr[j]);

                if (i >= j){
                        hasil += arrNganjil[j];
                        if (j==0){
                            System.out.print(arrNganjil[j]);
                            continue;
                        }
                        if (j == i){
                            System.out.print("+" +arrNganjil[j] + " = " + hasil);
                            continue;
                        }
                        System.out.print("+" + arrNganjil[j]);


                }

            }
            System.out.println();
        }
    }
}