import java.util.Scanner;

public class Soal3FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Kalimat: ");
        String kalimat = input.nextLine();

        String[] kalSplit = kalimat.split("");

        System.out.println("n: ");
        int n = input.nextInt();

        input.nextLine();

        String tampung = "";
        for (int i = 0; i < kalSplit.length; i++) {
           tampung = tampung + kalSplit[i];
            System.out.println(tampung);
        }


        String tamReplace = tampung.replace(" ", "");
        String[]tampungSPlit = tamReplace.split("");


        String simpan = "";
        for (int i = 0; i < tampungSPlit.length; i++) {
            for (int j = 0; j < n; j++) {

                simpan= tampungSPlit[i];
                System.out.println(simpan.substring(i , j));
            }




        }
        System.out.println(simpan);



    }
}
