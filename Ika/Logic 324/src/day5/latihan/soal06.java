package day5.latihan;

public class soal06 {
    public static void main(String[] args) {
        //"Diberikan deret dengan element 1 2 3 4 5 6 7.
        //hitung jumlah element index ke 0, 1 dan 3.
        //Output : Total 7"

        int[] arrA = {1,2,3,4,5,6,7};
        int sum=0;

        for (int i = 0; i < arrA.length; i++) {
            if(i==0 || i==1 || i==3){
                sum = sum + arrA[i];
            }else{
                continue;
            }
        }
        System.out.println("jumlah : "+ sum);


    }

}
