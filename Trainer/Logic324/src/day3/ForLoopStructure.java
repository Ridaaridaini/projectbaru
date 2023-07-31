package day3;

public class ForLoopStructure {

    public static void main(String[] args) {

        for (int i = 0; /*deklarasi*/ //optional (1) //i = 0 1 2 3 4 5
             i < 5; /*kondisi apakah perulangan akan dilanjutkan*/ //optinal (default true) (2)
             i++ //i = i + 1 /*Incremental*/ //optional (3)
        ){
            //Body perulangan (4)
            System.out.println(i);
        }
        //i = 1; //tidak bisa karna i dideklarasikan hanya di dalam body for

        //alur
        //(1) (2) (true) (4) (3) (2) (true) (4) (3) (2) (false) -> perulangan berhenti

        //console
        //0
        //1
        //2
        //3
        //4
    }

}
