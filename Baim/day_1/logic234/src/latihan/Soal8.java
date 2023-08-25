package latihan;

import java.util.Scanner;

public class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinUser = 123456;

        System.out.print("Silahkan masukan PIN atm anda: ");
        int pinInput = scanner.nextInt();
        if (pinInput == pinUser) {
            System.out.print("Masukkan nominal setor tunai: ");
            int setorTunai = scanner.nextInt();

            System.out.println("Pilihan Transfer: ");
            System.out.println("1. Antar Rekening");
            System.out.println("2. Antar Bank");
            System.out.print("Masukkan Pilihan Anda: ");
            int pilihTransfer = scanner.nextInt();

            switch (pilihTransfer) {
                case 1:
                    System.out.print("Masukkan rekening tujuan: ");
                    int rekeningTujuan = scanner.nextInt();
                    int digitRekening = String.valueOf(rekeningTujuan).length();

                    if (digitRekening == 10) {
                        System.out.print("Masukkan uang yang akan ditransfer: ");
                        int uangTransfer = scanner.nextInt();

                        if (uangTransfer <= setorTunai) {
                            int sisaSaldo = setorTunai - uangTransfer;
                            System.out.println("Transfer Berhasil, sisa saldo anda adalah: Rp." + sisaSaldo);
                        } else {
                            System.out.println("Saldo tidak mencukupi");
                        }
                        ;
                    } else {
                        System.out.println("Masukkan rekening yang sesuai");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan kode bank: ");
                    int kodeBank = scanner.nextInt();
                    int adminTransfer = 7500;

                    System.out.print("Masukkan rekening tujuan: ");
                    int rekeningBankTujuan = scanner.nextInt();
                    int digitRekeningBank = String.valueOf(rekeningBankTujuan).length();

                    if (digitRekeningBank == 10) {
                        System.out.print("Masukkan uang yang akan ditransfer: ");
                        int uangTransfer = scanner.nextInt();

                        if (uangTransfer-adminTransfer <= setorTunai) {
                            int sisaSaldo = setorTunai - uangTransfer - adminTransfer;
                            System.out.println("Transfer Berhasil, sisa saldo anda adalah: Rp." + sisaSaldo);
                        } else {
                            System.out.println("Saldo tidak mencukupi");
                        }
                        ;
                    } else {
                        System.out.println("Masukkan rekening yang sesuai");
                    }
                    break;

                default:
                    System.out.println("Masukkan pilihan yang sesuai");
                    break;
            }
        } else {
            System.out.println("Pin yang anda masukkan salah!");
        }
    }
}
