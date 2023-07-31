package day4.latihan.loop;

import java.util.Scanner;

public class pembahasanSoal10 {
    public static void main(String[] args) {
        // sekelompok orang ingin membeli es kopi susu dengan menggunakan promo diskon 50%
        // (maksimal diskon Rp 100.000 minimal order Rp 40.000) ditambahkan cashback 10%
        // cashback dari harga akhir yang dibayarkan maksimal cashback Rp 30.000
        // berapkah cup yang bisa dibeli jika mereka tidak ingin membayar lebih besar
        // dari nominal diskonnya? dan berapa saldo akhirnya setelah order diterima oleh customer
        // input : saldo OPO
        // contoh : saldo OPO =Rp 60.000
        // output : jumlah cup = 6, saldo akhir = Rp 11.400
        // harga kopi 18.000 ditambah ca

        Scanner scanner= new Scanner(System.in);
        System.out.print("masukan saldo: ");
        int saldo = scanner.nextInt();

        int hargaCup = 18_000;
        double diskon = 0.5;
        double persenCashback = 0.1;
        int jumlahCup =1;
        int maksimalDiskon = 100_000;
        int maxCashback=30_000;
        int sisaSaldo;


        //chek saldo apakah cukuo untuk membeli
        if(saldo<27000){
            System.out.println("tidak jadi membeli saldo kurang!");
        }else {//jika saldo mencukupi
            //logic menghitung jumlah cup
            while (saldo >= hargaCup*jumlahCup*diskon //cek apakah saldo masih cukup
                    && maksimalDiskon > jumlahCup*hargaCup*diskon){ //cek apakah sudah mendekati maksimal sidkon
                jumlahCup = jumlahCup+1;
            }
            jumlahCup=jumlahCup-1;// karena kelebihan 1 maka cup harus dikurangi 1
            System.out.println("jumlah cup: " + jumlahCup);

            //logic menghitung sisa saldo
            double hargaBayar = hargaCup*jumlahCup*diskon;
            double cashback = hargaBayar*persenCashback;

            if(cashback>maxCashback){
                cashback=maxCashback;
            }

            sisaSaldo = (int) (saldo-hargaBayar+cashback);
            System.out.println("jumlah cup " + jumlahCup +", Saldo akhir Rp." + sisaSaldo);


        }


    }
}
