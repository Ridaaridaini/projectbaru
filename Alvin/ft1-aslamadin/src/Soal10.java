import java.util.Scanner;

public class Soal10 {

    public static void main(String[] args) {

        String vokal = "aiueo";
        int jumlah = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("string s: ");
        String[] strS = scanner.nextLine().toLowerCase().replace(" ", "").split("");


        for (int i = 0; i < strS.length; i++) {
            if (i == strS.length-1){
                break;
            }

            if (!vokal.contains(strS[i]) && vokal.contains(strS[i+1])){
                jumlah++;
            }
        }

        System.out.print(jumlah);


    }

}
