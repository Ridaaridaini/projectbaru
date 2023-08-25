import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka : ");
        String[] angkaStr = input.nextLine().split("");
        int[] angka = new int[angkaStr.length];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = Integer.parseInt(angkaStr[i]);
        }
        //int[] angka = {0,1,2,3,4,5,6,7,8};
        System.out.print("pola : ");
        String pola =  input.nextLine();
        System.out.print("action : ");
        String action =  input.nextLine();

        if (pola.equalsIgnoreCase("x")){
            if(action.equalsIgnoreCase("+")){
                System.out.println(angka[0]+angka[4]+angka[8]+angka[2]+angka[4]+angka[6]);
            } else if (action.equalsIgnoreCase("-")) {
                System.out.println(angka[0]-angka[4]-angka[8]-angka[2]-angka[4]-angka[6]);
            } else if (action.equalsIgnoreCase("x")) {
                System.out.println(angka[0]*angka[4]*angka[8]*angka[2]*angka[4]*angka[6]);
            }

        } else if (pola.equalsIgnoreCase("+")) {
            if(action.equalsIgnoreCase("+")){
                System.out.println(angka[1]+angka[4]+angka[7]+angka[3]+angka[4]+angka[5]);
            } else if (action.equalsIgnoreCase("-")) {
                System.out.println(angka[1]-angka[4]-angka[7]-angka[3]-angka[4]-angka[5]);
            } else if (action.equalsIgnoreCase("x")) {
                System.out.println(angka[1]*angka[4]*angka[7]*angka[3]*angka[4]*angka[5]);
            }


        } else if (pola.equalsIgnoreCase("-")) {
            if(action.equalsIgnoreCase("+")){
                System.out.println(angka[3]+angka[4]+angka[5]);
            } else if (action.equalsIgnoreCase("x")) {
                System.out.println(angka[3]*angka[4]*angka[5]);
            } else if (action.equalsIgnoreCase("-")) {
                System.out.println(angka[3]-angka[4]-angka[5]);
            }
        }

    }
}
