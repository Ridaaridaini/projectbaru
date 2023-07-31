package day5.latihan5;

public class Soal7 {
    public static void main(String[] args) {
        int [] array = {5,4,3,1,2,7,9,8};

        int jumlahAngka = 0;
        for (int i = 0; i < array.length; i++) {
            jumlahAngka += array[i];
        }

        System.out.println(jumlahAngka);

        int jumlahAngkaIndexGenap = 0;
        for (int i = 1; i < array.length; i++) {
            if(i % 2 == 0){
//                System.out.println(array[i]);
                jumlahAngkaIndexGenap = jumlahAngkaIndexGenap + array[i];
//                System.out.println(jumlahAngkaGanjil);

            }

        }

        System.out.println(jumlahAngkaIndexGenap);

        int jumlahAngkaIndexGanjil = 0;
        for (int i = 0; i < array.length; i++) {
            if (i %2 != 0){
                jumlahAngkaIndexGanjil = jumlahAngkaIndexGanjil + array[i];
            }
        }

        System.out.println(jumlahAngkaIndexGanjil);


    }
}
