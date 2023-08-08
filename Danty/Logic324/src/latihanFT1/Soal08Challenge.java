package latihanFT1;

import java.util.Scanner;

public class Soal08Challenge {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String PIN = "123456"; //Karena hanya dipakai untuk login
        int biayaAdmin = 7500;
        int saldo = 0;

        int masukkanPin = 0;


        while (masukkanPin < 3) {

            System.out.print("Masukkan PIN : ");
            String pin = input.nextLine();

            masukkanPin = masukkanPin + 1;

            if (pin.equalsIgnoreCase(PIN)) {

                System.out.print("Uang yang disetor = ");
                int setor = input.nextInt();
                int saldoBaru = saldo + setor;

                System.out.print("Pilihan Transfer : (1) Antar Rekening (2) Antar Bank : ");
                int bank = input.nextInt();

                input.nextLine();

                if (bank == 1) {

                    System.out.print("Masukkan Rekening Tujuan : ");
                    String rekening = input.nextLine();

                    if (rekening.length() == 10) {

                        System.out.print("Masukkan nominal transfer = ");
                        int transfer = input.nextInt();
                        int saldoBaru2 = saldoBaru - transfer;

                        if (transfer <= saldoBaru) {

                            System.out.println("Transaksi Anda Berhasil, saldo Anda saat ini Rp." + saldoBaru2);
                            System.exit(0);

                        } else {

                            System.out.println("Saldo Anda tidak mencukupi");
                            System.exit(0);

                        }

                    } else {

                        System.out.println("Rekening Tujuan Anda Salah");
                        System.exit(0);

                    }
                    break;

                } else if (bank == 2) {

                    System.out.print("Masukkan Kode Bank : ");
                    int kode = input.nextInt();

                    input.nextLine();

                    System.out.print("Masukkan Rekening Tujuan : ");
                    String rekening = input.nextLine();

                    if (rekening.length() == 10) {

                        System.out.print("Masukkan nominal transfer : ");
                        int transfer = input.nextInt();
                        int saldoBaru2 = saldoBaru - (transfer + biayaAdmin);

                        if (transfer <= saldoBaru) {

                            System.out.println("Transaksi berhasil, saldo Anda saat ini Rp." + saldoBaru2);
                            System.exit(0);

                        } else {
                            System.out.println("Saldo Anda tidak mencukupi");
                            System.exit(0);
                        }

                    } else {

                        System.out.println("Rekening Tujuan Anda Salah");
                        System.exit(0);
                    }

                }


                break;


            } else if (!pin.equalsIgnoreCase(PIN)) {

                continue;

            }

        }
        System.out.println("REKENING DI BLOKIR");

    }


}


