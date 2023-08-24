import java.util.Scanner;

public class Soal1FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("n: ");
        String n = input.nextLine();
        String[] nSplit = n.split(" ");
        int[] jumlah = new int[nSplit.length];

        int total = 0;
        for (int i = 0; i < nSplit.length; i++) {
            for (int j = 0; j < i; j++) {

            }
            jumlah[i] = Integer.parseInt(nSplit[i]);
            System.out.print(jumlah[i]);


            total = total + jumlah[i];
        }
        System.out.println(total);
}
}



//        for (int i = 0; i < nSplit.length; i++) {
//
////            if (i == nSplit.length - 1){
////                System.out.print(nSplit[i] + " = ");
////            }else
////                System.out.print(nSplit[i] + " + ");
////            }
//            System.out.println(total);







