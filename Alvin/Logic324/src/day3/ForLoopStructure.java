package day3;

public class ForLoopStructure {
    public static void main(String[] args) {
        for (
                int i = 0; //deklarasi variable lokal, hanya dapat digunakan di dalam perulangan //optional (1)
                i < 5; //kondisi i apakah perintah akan dilajutkan //optional, default = true (2)
                i++ // incremental i = i + 1 //optional (3)
        ){
            // body looping (4)
            System.out.println(i);
        }

        //alur
        // (1) -> (2) true -> (4) -> (3) -> (2) true -> (4) -> (3) -> (2) true -> (4) -> (3) -> (2) true -> (4) -> (3) -> (2) true -> (4) -> (3) -> (2) false -> end looping

        //comsole
        //0
        //1
        //2
        //3
        //4


    }
}
