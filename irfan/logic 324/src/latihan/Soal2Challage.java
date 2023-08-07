package latihan;

import java.util.Scanner;

public class Soal2Challage {
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
                System.out.print("Masukkan rute: ");
                String rute = scanner.nextLine().toLowerCase();         // toko - tempat 1 - tempat 4 - toko

                // Split rute menjadi array tempat yang dikunjungi
                String[] tempatArray = rute.split("-");          // {"toko","tempat1","tempat4"}

                // Hitung total jarak per liter bensin yang ditempuh
                double totalJarak = 0; // jarak = 2.0 + 4.5

                for (int i = 0; i < tempatArray.length - 1; i++) { // i =0 1 2 // false // tempatArray = 2
                    String tempatAwal = tempatArray[i].trim();    // tepat awal = toko  . tempat1
                    String tempatTujuan = tempatArray[i + 1].trim(); // tempat tujuan = tempat1 . tempat4


//                    System.out.println(tempatAwal+" "+tempatTujuan);
                    if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat1")) || (tempatAwal.equals("tempat1") && tempatTujuan.equals("toko"))) {
                        totalJarak += jarakTokoTempat1;

                        if (tempatTujuan.equals("toko")){
                            break;
                        }


                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat2")) || (tempatAwal.equals("tempat2") && tempatTujuan.equals("toko"))){
                            totalJarak += jarakTokoTempat2;

                        if (tempatTujuan.equals("toko")){
                            break;
                        }

                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat3")) || (tempatAwal.equals("tempat3") && tempatTujuan.equals("toko"))){
                        totalJarak += jarakTokoTempat3;

                        if (tempatTujuan.equals("toko")){
                            break;
                        }

                    }else if ((tempatAwal.equals("toko") && tempatTujuan.equals("tempat4")) || (tempatAwal.equals("tempat4") && tempatTujuan.equals("toko"))){
                        totalJarak += jarakTokoTempat4;
//
                        if (tempatTujuan.equals("toko")){
                            break;
                        }

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
                double bensinYangDibutuhkan = totalJarak / jarakPerLiter; // 6.5 / 2.5 = 2.6

                System.out.println("jarak: " + totalJarak + " km");
                System.out.println("Total bensin yang dibutuhkan: " + bensinYangDibutuhkan + " liter");
//                System.out.println(totalJarak+"");
            }
        }
