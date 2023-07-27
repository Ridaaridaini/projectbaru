//package day2.latihan2;
//
//import java.util.Scanner;
//
//public class Soal10 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.println("Masukkan pin anda: ");
//        String pinInput = input.nextLine();
//        String pin = "12345";
//        if (!pinInput.equals(pin) ){
//            System.out.println("PIN anda salah");
//            System.exit(0);
//        }
//        System.out.println("Masukkan jumlah uang yang akan disetor: ");
//        long jumSetor = input.nextLong();
//        long Sid
//        long sisaSaldo = sisaSaldo + jumSetor;
//        System.out.println("Setoran berhasil!");
//        System.out.println("Pilihan Transfer : ");
//        System.out.println("ketik 1 untuk Antar Rekening");
//        System.out.println("ketik 2 untuk Antar Bank ");
//        int pilihanTf = input.nextInt();
//        if(pilihanTf == 1){
//                System.out.println("Masukkan nomor rekening yang dituju : ");
//                String tujuan1 = input.nextLine();
//                if(tujuan1.length() != 10) {
//                    System.out.println("Rekening Tujuan anda tidak valid ");
//                    System.exit(0);
//                }
//                System.out.println("Masukkan nominal transfer");
//                long nominalTf = Scanner
//
//                    int jumTf1 = input.nextInt();
//
//                    if(jumSetor >= jumTf1){
//                        int sisaSaldo = jumSetor - jumTf1;
//                        System.out.println("Transaksi berhasil, saldo Anda saat ini Rp " + sisaSaldo);
//                    }
//                    else{
//                        System.out.println("Saldo anda tidak mencukupi");
//                    }
//                }
//                else{
//                    System.out.println("Rekening tujuan anda tidak valid");
//                }
//            }
//
//        }
//
//
//
