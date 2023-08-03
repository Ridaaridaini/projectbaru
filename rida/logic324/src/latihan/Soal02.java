package latihan;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        /*Diketahui:
        Toko ke tempat1= 2km
        Tempat1 ke tempat 2 =0,5km
        Tempat2 ke tempat 3 = 1,5 km
        Tempat3 ke tempat 4 = 2,5 km
        1 liter bensin dapat digunakan untuk 2,5 km
         */
        String a="tempat1",b="tempat2", c="tempat3", d="tempat4";
        double tokoKetmp1,tmp1Ketmp2,tmp2Ketmp3,tmp3Ketmp4;
        tokoKetmp1=2.0;
        tmp1Ketmp2=0.5;
        tmp2Ketmp3=1.5;
        tmp3Ketmp4=2.5;
        Scanner input= new Scanner(System.in);
        System.out.println("perjalanan dimulai dari toko dan berakhir ditoko");
        System.out.println("masukkan tujuan pertama: ");
        String tempat1=input.nextLine();
        System.out.println("masukkan tujuan selanjutnya: ");
        String tempat2= input.nextLine();
        System.out.println("selanjutnya: ");
        String tempat3=input.nextLine();
        System.out.println("selanjutnya: ");
        String tempat4=input.nextLine();
        if (tempat1.equalsIgnoreCase(a)&&tempat2.equalsIgnoreCase(b)&&tempat3.equalsIgnoreCase(c)&&tempat4.equalsIgnoreCase(d)){
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3+tmp3Ketmp4)*2)/2.5;
            System.out.println(total+" Liter");
        } else if (tempat1.equalsIgnoreCase(a)&&tempat2.equalsIgnoreCase(b)&&tempat3.equalsIgnoreCase(c)) {
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3)*2)/2.5;
            System.out.println(total+" Liter");
        } else if (tempat1.equalsIgnoreCase(a)&&tempat2.equalsIgnoreCase(b)) {
            double total=((tokoKetmp1+tmp1Ketmp2)*2)/2.5;
            System.out.println(total+" Liter");
        } else if (tempat1.equalsIgnoreCase(a)) {
            double total=((tokoKetmp1)*2)/2.5;
            System.out.println(total+" Liter");
        }
        if (tempat1.equalsIgnoreCase(b)&&tempat2.equalsIgnoreCase(c)&&tempat3.equalsIgnoreCase(d)){
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3+tmp3Ketmp4)*2)/2.5;
            System.out.println(total+" Liter");
        }else if (tempat1.equalsIgnoreCase(b)&&tempat2.equalsIgnoreCase(c)) {
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3)*2)/2.5;
            System.out.println(total+" Liter");
        } else if (tempat1.equalsIgnoreCase(b)) {
            double total=((tokoKetmp1+tmp1Ketmp2)*2)/2.5;
            System.out.println(total+" Liter");
        }
        if (tempat1.equalsIgnoreCase(c)&&tempat2.equalsIgnoreCase(d)){
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3+tmp3Ketmp4)*2)/2.5;
            System.out.println(total+" Liter");
        }else if (tempat1.equalsIgnoreCase(c)) {
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3)*2)/2.5;
            System.out.println(total+" Liter");
        }
        if (tempat1.equalsIgnoreCase(d)){
            double total=((tokoKetmp1+tmp1Ketmp2+tmp2Ketmp3+tmp3Ketmp4)*2)/2.5;
            System.out.println(total+" Liter");
        }
    }
}
