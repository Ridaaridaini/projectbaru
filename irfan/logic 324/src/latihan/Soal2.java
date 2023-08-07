package latihan;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Jarak antar tempat dalam kilometer
                double jarakTokoTempat1 = 2.0;
                double jarakTokoTempat2 = 2.5;
                double jarakTokoTempat3 = 4 ;
                double jarakTokoTempat4 = 6.5;

                double jarakTempat1Tempat2 = 0.5;
                double jarakTempat1Tempat3 = 2;
                double jarakTempat1Tempat4 = 4.5;

                double jarakTempat2Tempat3 = 1.5;
                double jarakTempat2Tempat4 = 4;

                double jarakTempat3Tempat4 = 2.5;

                // Jarak yang dapat ditempuh per liter bensin dalam kilometer
                double jarakPerLiter = 2.5;

                // Input rute
                System.out.println("Masukkan rute: ");
                String rute = scanner.nextLine().toLowerCase();

                // Split rute menjadi array tempat yang dikunjungi
                String[] tempatArray = rute.split("-");

                // Hitung total jarak per liter bensin yang ditempuh
                double totalJarak = 0;
                for (int i = 0; i < tempatArray.length - 1; i++) {
                    String tempatAwal = tempatArray[i].trim();
                    String tempatTujuan = tempatArray[i + 1].trim();

//                    System.out.println(tempatAwal+" "+tempatTujuan);
                    if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat1")) || (tempatAwal.equals("tempat1") && tempatTujuan.equals("toko"))) {
                        totalJarak += jarakTokoTempat1;

                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat2")) || (tempatAwal.equals("tempat2") && tempatTujuan.equals("toko"))){
                            totalJarak += jarakTokoTempat2;

                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat3")) || (tempatAwal.equals("tempat3") && tempatTujuan.equals("toko"))){
                        totalJarak += jarakTokoTempat3;

                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat4")) || (tempatAwal.equals("tempat4") && tempatTujuan.equals("toko"))){
                        totalJarak += jarakTokoTempat4;
//

                    } else if ((tempatAwal.equals("tempat1") && tempatTujuan.equals("tempat2")) || (tempatAwal.equals("tempat2") && tempatTujuan.equals("tempat1"))){
                        totalJarak += jarakTempat1Tempat2;

                    } else if ((tempatAwal.equals("tempat1") && tempatTujuan.equals("tempat3")) || (tempatAwal.equals("tempat3") && tempatTujuan.equals("tempat1"))){
                        totalJarak += jarakTempat1Tempat3;

                    } else if ((tempatAwal.equals("tempat1") && tempatTujuan.equals("tempat4")) || (tempatAwal.equals("tempat4") && tempatTujuan.equals("tempat1"))){
                        totalJarak += jarakTempat1Tempat4;


                    } else if ((tempatAwal.equals("tempat2") && tempatTujuan.equals("tempat3")) || (tempatAwal.equals("tempat3") && tempatTujuan.equals("tempat2"))) {
                        totalJarak += jarakTempat2Tempat3;
                    } else if ((tempatAwal.equals("tempat2") && tempatTujuan.equals("tempat4")) || (tempatAwal.equals("tempat4") && tempatTujuan.equals("tempat2"))) {
                        totalJarak += jarakTempat2Tempat4;


                    } else if ((tempatAwal.equals("tempat3") && tempatTujuan.equals("tempat4")) || (tempatAwal.equals("tempat4") && tempatTujuan.equals("tempat3"))) {
                        totalJarak += jarakTempat3Tempat4;


                    } else {
//                        System.out.println(tempatArray+""+tempatTujuan);
                        if(tempatArray[0].trim().equals(tempatTujuan)){
                            totalJarak = totalJarak * 2;

                        }
//                        System.out.println("Rute tidak valid!");
//                        return;
                    }
                }

                // Hitung jumlah bensin yang dibutuhkan
                double bensinYangDibutuhkan = totalJarak / jarakPerLiter;

                System.out.println("Total bensin yang dibutuhkan: " + bensinYangDibutuhkan + " liter");
//                System.out.println(totalJarak+"");
            }
        }
