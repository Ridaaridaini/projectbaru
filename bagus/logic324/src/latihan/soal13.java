package latihan;
import java.util.Scanner;
public class soal13 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan harga beli: ");
                double hargaBeli = scanner.nextDouble();

                System.out.print("Masukkan harga jual: ");
                double hargaJual = scanner.nextDouble();


                double keuntungan = ((hargaJual - hargaBeli) / hargaBeli) * 100;

                System.out.println("Persentase keuntungan: " + keuntungan + "%");

                scanner.close();
            }
        }
