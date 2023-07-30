package day3;

public class WhileLoop {

    public static void main(String[] args) {

        //While Loop

        int i = 0; //(1)
        while(i < 5/*kondisi apakah looping akan dilanjutkan*/){ //(2)

            System.out.println(i); //(4)
            i++; //(3)

        }
        i = 0; //di while nilai i yang baru tidak terpengaruh dengan nilai i yang sebelumnya
        System.out.println();

        //Do While Loop
        do{
            System.out.println(i);
            i++; //di fungsi do while ini stepnya di increment dulu baru di cek kondisi i < 5

        } while(i<5);
    }
    //fungsi while di cek baru dijalankan
    //fungsi do while dijalnkan dulu baru di cek

    //PAHAMIII DAAAN

}


