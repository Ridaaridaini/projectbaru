package day7.latihan01A;

import java.util.Scanner;

public class soal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan pin bank: ");
        String pin = scanner.nextLine();
        int saldo=0;
        int trasfer;
        String pinBank ="123456";
        String rekening ="1234567890";
        int biayaAdmin = 7_500;

        if (!pin.equals(pinBank)) {
            System.out.println("pin anda salah");
            System.exit(0);
        }

        if(pin.equals(pinBank)){
            System.out.print("masukan saldo: ");
            int inputsaldo = scanner.nextInt();
            saldo=saldo+inputsaldo;

            scanner.nextLine();
            System.out.print("masukan rekening tujuan: ");
            String inputrekening = scanner.nextLine();

            if (inputrekening.length()==10 && inputrekening.equals(rekening)){
                System.out.println("======pilihan transfer(1 atau 2)========== ");
                System.out.println("1. Antar Rekening \n.2.Antar Bank");
                System.out.print("pilihan: ");
                int pilihan = scanner.nextInt();

                if (pilihan==1){
                    System.out.print("masukan transfer : ");
                    trasfer = scanner.nextInt();
                    if(saldo>trasfer){
                        saldo=saldo-trasfer;
                        System.out.println("Transfer berhasil, sisa saldo " + saldo);
                    }else {
                        System.out.println("saldo tidak cukup");
                    }
                } else if (pilihan==2) {
                    scanner.nextLine();
                    System.out.print("masukan kode bank: ");
                    String kodeBank = scanner.nextLine();
                    System.out.print("masukan transfer : ");
                    int nominalTrasfer = scanner.nextInt();
                    if(saldo>nominalTrasfer+biayaAdmin){
                        saldo=saldo-(nominalTrasfer+biayaAdmin);
                        System.out.println("Transfer berhasil, sisa saldo " + saldo);
                    }else {
                        System.out.println("saldo tidak cukup");
                    }

                }

            }else{
                System.out.println("NOMOR REKENING TIDAK VALID");
                System.exit(0);
            }

        }

    }
}
