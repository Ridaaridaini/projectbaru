import java.util.Scanner;

public class Soal08 {

    public static void main(String[] args) {
// belum selesai
        Scanner scanner = new Scanner(System.in);

        String[] inputDeret1 = scanner.nextLine().split(" ");
        String[] inputDeret2 = scanner.nextLine().split(" ");
        String[] inputDeret3 = scanner.nextLine().split(" ");

        System.out.print("pola: ");
        String pola = scanner.nextLine();

        System.out.print("action: ");
        String action = scanner.nextLine();

        int[] arrInputDeret1 = new int[inputDeret1.length];
        int[] arrInputDeret2 = new int[inputDeret2.length];
        int[] arrInputDeret3 = new int[inputDeret3.length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrInputDeret1[i] = Integer.parseInt(inputDeret1[i]);
                arrInputDeret2[i] = Integer.parseInt(inputDeret2[i]);
                arrInputDeret3[i] = Integer.parseInt(inputDeret3[i]);
            }
        }

        int[] arrPolaPlus = {arrInputDeret1[1], arrInputDeret2[1], arrInputDeret3[1], arrInputDeret2[0], arrInputDeret2[1], arrInputDeret2[2]};
        int[] arrPolaMin = {arrInputDeret2[0], arrInputDeret2[1], arrInputDeret2[2]};
        int[] arrPolaTimes = {arrInputDeret1[0], arrInputDeret2[1], arrInputDeret3[2], arrInputDeret1[2], arrInputDeret2[1], arrInputDeret3[0]};

                int jumlah = 0;

        if (pola.equals("x")){

            for (int i = 0; i < arrPolaTimes.length; i++) {
                if (i == arrPolaTimes.length-1){
                    System.out.print(arrPolaTimes[i] + " = " + jumlah);
                }
                System.out.print(arrPolaTimes[i] + "+");
            }
            if (action.equals("+")){
                //tambah
                for (int i = 0; i < arrPolaTimes.length; i++) {
                    jumlah += arrPolaTimes[i];
                    if (i == arrPolaTimes.length-1){
                        System.out.print(arrPolaTimes[i] + " = " + jumlah);
                    }
                    System.out.print(arrPolaTimes[i] + "+");
                }
            } else if (action.equals("-")) {
                //kurang
                for (int i = 0; i < arrPolaTimes.length; i++) {
                    jumlah -= arrPolaTimes[i];
                }
                System.out.println(jumlah);
            } else if (action.equals("x")) {
                //kali
                for (int i = 0; i < arrPolaTimes.length; i++) {
                    jumlah *= arrPolaTimes[i];
                }
                System.out.println(jumlah);
            }

        } else if (pola.equals("+")) {

//            for (int i = 0; i < arrPolaPlus.length; i++) {
//                System.out.print(arrPolaPlus[i]);
//            }
//            if (action.equals("+")){
//                //tambah
//                for (int i = 0; i < arrPolaPlus.length; i++) {
//                    jumlah += arrPolaPlus[i];
//                }
//                System.out.println(jumlah);
//            } else if (action.equals("-")) {
//                //kurang
//                for (int i = 0; i < arrPolaTimes.length; i++) {
//                    jumlah -= arrPolaTimes[i];
//                }
//                System.out.println(jumlah);
//            } else if (action.equals("x")) {
//                //kali
//                for (int i = 0; i < arrPolaTimes.length; i++) {
//                    jumlah *= arrPolaTimes[i];
//                }
//                System.out.println(jumlah);
//            }

        } else if (pola.equals("-")) {

            for (int i = 0; i < arrPolaMin.length; i++) {
                System.out.print(arrPolaMin[i]);
            }
//            if (action.equals("+")){
//                //tambah
//                System.out.println(arrInputDeret2[0] + "+" + arrInputDeret2[1] + "+" + arrInputDeret2[2]);
//                System.out.println(" = " + (arrInputDeret2[0]+arrInputDeret2[1]+arrInputDeret2[2]));
//            } else if (action.equals("-")) {
//                //kurang
//                System.out.println(arrInputDeret2[0] + "-" + arrInputDeret2[1] + "-" + arrInputDeret2[2]);
//                System.out.println(" = " + (arrInputDeret2[0]-arrInputDeret2[1]-arrInputDeret2[2]));
//            } else if (action.equals("x")) {
//                //kali
//                System.out.println(arrInputDeret2[0] + "*" + arrInputDeret2[1] + "*" + arrInputDeret2[2]);
//                System.out.println(" = " + (arrInputDeret2[0]*arrInputDeret2[1]*arrInputDeret2[2]));
//            }

        }


    }

}
