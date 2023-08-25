import java.util.Scanner;

public class Soal10New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan kalimat: ");
        String[] arrKal = scanner.nextLine().toLowerCase().replace(" ","").replaceAll("[^a-zA-Z]", "").split("");
        String  kons = "";
        String tamp= "";
        String[] vokal = {"a", "u", "i", "e", "o"};

        for (int i = 0; i < arrKal.length; i++) {
            if((arrKal[i].equals("a") || arrKal[i].equals("u") || arrKal[i].equals("i") || arrKal[i].equals("e") || arrKal[i].equals("o"))){
                kons = kons+arrKal[i];
            }
            for (int j = i+1; j < arrKal.length ; j++) {
                if(arrKal[j].contains(kons)){
                    tamp= tamp + arrKal[i];
                }
            }
        }

        System.out.println(tamp);
        System.out.println(tamp.length());
    }

}
