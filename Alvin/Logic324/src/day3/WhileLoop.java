package day3;

public class WhileLoop {

    public static void main(String[] args) {

        int i = 0; //deklarasi variable i, variable i bersifat global(1)
        while (i < 5){ //kondisi apakah looping akan dilanjutkan (2)
            //body (3)
            System.out.print(i);

            i++; //increment (4)
        }
        //cetak: 01234


        System.out.println();


        int j = 0; //deklarasi variable, variable bersifat global
        do {
            // body (2)
            System.out.print(j);
            j++; //increment (3)
        }while (j<5); // (4) kondisi apakah looping berlanjut atau tidak

        //cetak: 01234

    }

}
