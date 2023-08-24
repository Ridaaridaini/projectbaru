import java.util.Scanner;

public class Soal8FT1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("masukan deret 1: ");
        int[] deret = new int[3];
        int[] tampung = new int[3];
        for (int i = 0; i < deret.length; i++) {
           deret[i] = input.nextInt();
           tampung[i] = deret[i];
        }
        for (int i = 0; i < deret.length; i++) {
            System.out.print(deret[i]+" ");
        }
        System.out.println();
        System.out.println("masukan deret 2: ");

        int  [] deret2 = new int[3];
        int [] tampung2 = new int[3];
        for (int i = 0; i < deret2.length; i++) {
            deret2[i] = input.nextInt();
            tampung2[i] = deret2[i];
        }
        for (int i = 0; i < deret2.length; i++) {
            System.out.print(deret2[i]+" ");
        }
        System.out.println();

        System.out.println("Masukan deret 3: ");
        int [] deret3 = new int[3];
        int [] tampung3 = new int[3];
        for (int i = 0; i < deret3.length; i++) {
            deret3[i] = input.nextInt();
            tampung3[i] = deret3[i];
        }
        for (int i = 0; i < deret3.length; i++) {
            System.out.print(deret3[i]);
        }
        System.out.println();
        System.out.println("tampilan semua deret 3x3: ");

        for (int i = 0; i < 3; i++) {
            System.out.print(tampung[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print(tampung2[i]+ " ");
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(tampung3[i]+ " ");
        }

        System.out.println();


        input.nextLine();
        System.out.println("pola: ");
        String pola = input.nextLine();

        System.out.println("action: ");
        String action = input.nextLine();

        int total = 0;
        if (pola.equalsIgnoreCase("x") && action.equalsIgnoreCase("+")){
            for (int i = 0; i < 3; i++) {

                total = tampung[0] + tampung2[1] + tampung3[2] + tampung[2] + tampung2[1] + tampung3[0];
            }
            System.out.println((tampung[0] +"+" + tampung2[1] +"+"+ tampung3[2])+"+"+(tampung[2] +"+"+ tampung2[1]+"+" + tampung3[0]));
            System.out.println(total);
        }

        if(pola.equalsIgnoreCase("-") && action.equalsIgnoreCase("x")){
            for (int i = 0; i < 3; i++) {

                total = tampung2[0] * tampung2[1] * tampung2[2];
            }
            System.out.println(tampung2[0] +"x" + tampung2[1] +"x"+ tampung2[2]);
            System.out.println(total);
        }

        if (pola.equalsIgnoreCase("x") && action.equalsIgnoreCase("x")){
            for (int i = 0; i < 3; i++) {

                total = tampung[0] * tampung2[1] * tampung3[2] * tampung[2] * tampung2[1] * tampung3[0];
            }
            System.out.println((tampung[0] +"x" + tampung2[1] +"x"+ tampung3[2])+"x"+(tampung[2] +"x"+ tampung2[1]+"x" + tampung3[0]));
            System.out.println(total);
        }

        if(pola.equalsIgnoreCase("-") && action.equalsIgnoreCase("+")) {
            for (int i = 0; i < 3; i++) {

                total = tampung2[0] + tampung2[1] + tampung2[2];
            }
            System.out.println(tampung2[0] + "+" + tampung2[1] + "+" + tampung2[2]);
            System.out.println(total);

        }

        if(pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("+")) {
            for (int i = 0; i < 3; i++) {

                total = tampung[1] + tampung2[1] + tampung3[1] + tampung2[0] + tampung2[1]+tampung2[2];
            }
            System.out.println("(" +tampung[1] + "+" + tampung2[1] + "+" + tampung3[1]+")" +"+"+ "("+tampung2[0]+ "+" + tampung2[1] + "+" + tampung2[2]+")");
            System.out.println("Hasil= "+total);

        }

        if(pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("x")) {
            for (int i = 0; i < 3; i++) {

                total = tampung[1] * tampung2[1] * tampung3[1] * tampung2[0] * tampung2[1] * tampung2[2];
            }
            System.out.println("(" +tampung[1] + "x" + tampung2[1] + "x" + tampung3[1]+")" +"x"+ "("+tampung2[0]+ "x" + tampung2[1] + "x" + tampung2[2]+")");
            System.out.println("Hasil= "+total);

        }

        if(pola.equalsIgnoreCase("+") && action.equalsIgnoreCase("-")) {
            for (int i = 0; i < 3; i++) {

                total = tampung[1] - tampung2[1] - tampung3[1] - tampung2[0] - tampung2[1] - tampung2[2];
            }
            System.out.println("(" +tampung[1] + "-" + tampung2[1] + "-" + tampung3[1]+")" +"-"+ "("+tampung2[0]+ "-" + tampung2[1] + "-" + tampung2[2]+")");
            System.out.println("Hasil= "+total);

        }








    }
}
