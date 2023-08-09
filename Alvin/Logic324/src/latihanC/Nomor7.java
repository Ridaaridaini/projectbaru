package latihanC;

import java.util.Scanner;

public class Nomor7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("z: ");
        int z = scanner.nextInt();

        System.out.print("x: ");
        int x = scanner.nextInt();

        if (z == x){
            System.out.print("nggak usah di potong");
            System.exit(0);
        }

        String geometri = "";

        int i = 0;
        int potong = 0;
        while (z >= x){
            if (z == x){
                break;
            }

            geometri += z + " ";
            z = z/2;
            potong++;
            i++;
        }

        System.out.println(geometri);
        System.out.println(potong);

    }

}
