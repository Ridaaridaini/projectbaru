package day3;

public class ForLoopStructure {

    public static void main(String[] args) {

        for(int i = 0; /*deklarasi*/ //optional (boleh ada atau tidak) (1)
            i < 5; /*kondisi apakah  perulangan akan dilanjutkan*/  //optional juga (default true) (2)
            i++ )//i=i+1/*incremental*/ ) //optional (3)
        {
            System.out.println(i); //(4)

            //alur output : (1) (2) (true) (4) (3) (2) (false) -> perulangan berhenti
        }
            //i hanya bisa dideklarasikan dalam body for, maka di luar (kurung kurawal selanjutnya) itu tidak bisa
    }
}
