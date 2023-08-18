package simulasiFT1;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
     //Diketahui Andi, Budi, Cindy, Dedi, & Eki memiliki nilai sebagai berikut
        //Andi = 85, Budi = 70, Cindy = 90, Dedi = 75, Eki = 100
        //Tentukan apakah dalam sebuah input sudah memiliki bobot yang sesuai
        //Contoh :
        //Input1 : Andi Budi Dedi
        //Input2 : 100 70 50
        //Output : false true false
        //Contoh 2:
        //Input1 : Andi Budi Cindy Eki
        //Input2 : 100 70 50 100
        //Output : false true false true

        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan nama siswa : ");
        String nama = scanner.nextLine().toLowerCase();

        System.out.print("masukan nilai siswa: ");
        String nilai = scanner.nextLine();

        String[] arrNama = nama.split(" ");
        String[] arrNilai = nilai.split( " ");
        for (int i = 0; i < arrNama.length; i++) {
//            System.out.println(arrNama[i]);
//            System.out.println(arrNilai[i]);

            if(arrNama[i].equalsIgnoreCase("andi")){
                if(arrNilai[i].equals("85")){
                    System.out.print("true ");
                }else{
                    System.out.print("false ");
                }
            } else if ((arrNama[i].equalsIgnoreCase("budi"))) {
                if(arrNilai[i].equals("70")){
                    System.out.print("true ");
                }else{
                    System.out.print("false ");
                }
            } else if (arrNama[i].equalsIgnoreCase("Cindy")) {
                if(arrNilai[i].equals("90")){
                    System.out.print("true ");
                }else{
                    System.out.print("false ");
                }
            } else if (arrNama[i].equalsIgnoreCase("Dedi")) {
                if(arrNilai[i].equals("75")){
                    System.out.print("true ");
                }else{
                    System.out.print("false ");
                }
            } else if (arrNama[i].equalsIgnoreCase("Eki")) {
                if(arrNilai[i].equals("100")){
                    System.out.print("true ");
                }else{
                    System.out.print("false ");
                }
            }
        }

    }
}
