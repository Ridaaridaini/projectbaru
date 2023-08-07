package day7.latihan01B;

import java.util.Scanner;

public class soal05Sama01A {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("\n1.memesan \n2.tidak memesan \npilihan ( Y atau N): ");
        String n = scanner.nextLine();
        double jumlahporsi = 0;
        int jumlahOrang = 0;

        if (n.equalsIgnoreCase("n")) {
            System.exit(0);
        }

        while (n.equalsIgnoreCase("y")) {
            System.out.println("======pilihan jenis pelanggan=======");
            System.out.println("1. laki-laki dewasa");
            System.out.println("2. perempuan dewasa");
            System.out.println("3. Remaja");
            System.out.println("4. anak-anak");
            System.out.println("5. balita ");
            System.out.println();
            System.out.print("jenis pelanggan (1-5): ");
            int pelanggan = scanner.nextInt();
            switch (pelanggan) {
                case 1:
                    System.out.print("laki-laki dewasa: ");
                    int orang = scanner.nextInt();
                    jumlahOrang = jumlahOrang + orang;
                    jumlahporsi = jumlahporsi + (orang * 2.0);
//                    System.out.println(jumlahporsi);
//                    System.out.println(jumlahOrang);
                    break;

                case 2:
                    System.out.print("perempuan dewasa: ");
                    orang = scanner.nextInt();
                    jumlahOrang = jumlahOrang + orang;
                    jumlahporsi = jumlahporsi + (orang * 1.0);
//                    System.out.println(jumlahporsi);
//                    System.out.println(jumlahOrang);
                    break;

                case 3:
                    System.out.print("Remaja : ");
                    orang = scanner.nextInt();
                    jumlahOrang = jumlahOrang + orang;
                    jumlahporsi = jumlahporsi + (orang * 1.0);
//                    System.out.println(jumlahporsi);
//                    System.out.println(jumlahOrang);
                    break;

                case 4:
                    System.out.print("anak-anak: ");
                    orang = scanner.nextInt();
                    jumlahOrang = jumlahOrang + orang;
                    jumlahporsi = jumlahporsi + (orang * 1.0);
//                    System.out.println(jumlahporsi);
//                    System.out.println(jumlahOrang);
                    break;

                case 5:
                    System.out.print("masukan jumlah balita: ");
                    orang = scanner.nextInt();
                    jumlahOrang = jumlahOrang + orang;
                    jumlahporsi = jumlahporsi + (orang * 1.0);
//                    System.out.println(jumlahporsi);
//                    System.out.println(jumlahOrang);
                    break;

            }
            scanner.nextLine();
            System.out.println("\n1.memesan \n2.tidak memesan \npilihan ( Y atau N): ");
            n = scanner.nextLine();
        }

        if (jumlahOrang % 2 != 0 || jumlahOrang >= 5) {
            System.out.println("jumlah porsi "+jumlahporsi+1);
        } else {
            System.out.println("jumlah porsi "+jumlahporsi);
        }
    }
}
