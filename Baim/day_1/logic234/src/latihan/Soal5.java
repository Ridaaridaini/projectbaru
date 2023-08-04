package latihan;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prLakilaki = 2;
        int prPerempuan = 1;
        int prRemaja = 1;
        float prAnak = 0.5f;
        int prBalita = 1;
        
        System.out.print("Masukkan jumlah laki-laki dewasa:");
        int lakiLaki = scanner.nextInt();
        
        System.out.print("Masukkan jumlah perempuan dewasa:");
        int perempuan = scanner.nextInt();
        
        System.out.print("Masukkan jumlah remaja:");
        int remaja = scanner.nextInt();
        
        System.out.print("Masukkan jumlah anak-anak:");
        int anak = scanner.nextInt();
        
        System.out.print("Masukkan jumlah balita:");
        int balita = scanner.nextInt();

        int jumlahOrang = lakiLaki + perempuan + remaja + anak + balita;
        float jumlahPorsi = 0;

        if(jumlahOrang%2==0){
            jumlahPorsi += (lakiLaki*prLakilaki) + (perempuan*prPerempuan) + (remaja*prRemaja) + (anak*prAnak) + (balita*prBalita);
        } else if(jumlahOrang >= 5 && jumlahOrang%2 == 1 ) {
            jumlahPorsi += (lakiLaki*prLakilaki) + (perempuan*(prPerempuan+1)) + (remaja*prRemaja) + (anak*prAnak) + (balita*prBalita);
        }

        System.out.println("Jumlah porsi: " + jumlahPorsi);
    }
}
