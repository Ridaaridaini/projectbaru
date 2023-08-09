package latihan;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Tapilkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
        Integer pil=input.nextInt();
        double porsi=0;
        int jumOrang=0,jumwt=0;
        while(pil==1){
            System.out.println("Tipe Customer :(pilihan bentuk nomor");
            System.out.println("1. Laki-laki Dewasa");
            System.out.println("2. Perempuan Dewasa");
            System.out.println("3. Remaja");
            System.out.println("4. Anak-anak ");
            System.out.println("5.Balita");
            Integer tipe=input.nextInt();
            input.nextLine();
            if (tipe==1){
                System.out.print("Jumlah Orang: ");//3
                int orang=input.nextInt();
                jumOrang=jumOrang+orang;
                porsi=porsi+(orang*2.0);
                //System.out.println(porsi);
                System.out.println("Tambahkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
                int pilSel=input.nextInt();
                if(pilSel==2){
                    pil=2;
                }
                continue;
            }
            if (tipe==2) {
                System.out.print("Jumlah Orang: ");
                int orang=input.nextInt();
                jumwt=jumwt+orang;
                jumOrang = jumOrang + orang;
                porsi = porsi + (orang * 1.0);
                //System.out.println(porsi);
                System.out.println("Tambahkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
                int pilSel = input.nextInt();
                if (pilSel == 2) {
                    pil = 2;
                }
                continue;
            }
            if (tipe==3) {
                System.out.print("Jumlah Orang: ");
                int orang = input.nextInt();
                jumOrang = jumOrang + orang;
                porsi = porsi + (orang * 1.0);
                //System.out.println(porsi);
                System.out.println("Tambahkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
                int pilSel = input.nextInt();
                if (pilSel == 2) {
                    pil = 2;
                }
                continue;
            }
            if (tipe==4) {
                System.out.print("Jumlah Orang: ");
                int orang = input.nextInt();
                jumOrang = jumOrang + orang;
                porsi = porsi + (orang * 0.5);
                //System.out.println(porsi);
                System.out.println("Tambahkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
                int pilSel = input.nextInt();
                if (pilSel == 2) {
                    pil = 2;
                }
                continue;
            }
            if (tipe==5) {
                System.out.print("Jumlah Orang: ");
                int orang = input.nextInt();
                jumOrang = jumOrang + orang;
                porsi = porsi + (orang * 1.0);
                //System.out.println(porsi);
                System.out.println("Tambahkan pilihan: (tombol: 1.Ya dan 2.Tidak)");
                int pilSel = input.nextInt();
                if (pilSel == 2) {
                    pil = 2;
                }
                continue;
            }
        }
        if (jumOrang>5 && jumOrang%2==1){
           porsi=porsi+jumwt;
        }
        System.out.println(+porsi+" Porsi");
    }
}
