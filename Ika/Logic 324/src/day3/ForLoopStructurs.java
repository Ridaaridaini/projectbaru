package day3;

public class ForLoopStructurs {
    public static void main(String[] args) {


        for(int i=0 /*deklarasi*/ /*optional tapi default true  / (1)*/;
            i<5 /*kondisi apakah perulangan akan dilanjutkan*//*optional (default true) / (2)*/;
            i++/* i=I+1*//*incremental (3)*/){
            // hanya bisa digunakan di body perulangan/for saja //optional

            //body perulangan (4)
            System.out.println(i);

            // alur
            //(1) (2) (true) (4) (3) (2) (true) (4) (3) (2) (false) --> perulangan berhentii

        }
        //i tidak bisa diakses disini karena kondisi i hanya bisa diakses di bodi for saja.
        //console
        //0
        // 1
        // 2
        // 3
        // 4


    }
}
