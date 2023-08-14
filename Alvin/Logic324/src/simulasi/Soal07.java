package simulasi;

import java.util.Scanner;

public class Soal07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("sisi persegi: ");
        int sisiPersegi = scanner.nextInt();

        System.out.print("rusuk kubus: ");
        int rusuKubus = scanner.nextInt();

        int luasPersegi = sisiPersegi*sisiPersegi;

        int luasMukaKubus = 6*(rusuKubus*rusuKubus);

        double srosot = (double) luasMukaKubus /luasPersegi;

        System.out.println(srosot);

    }

}
