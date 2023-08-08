package latihan.challenge;

public class SoalN9 {
    public static void main(String[] args) {
        Integer[] arrn= new Integer[9];
        int b=3;
        for (int i = 0; i < arrn.length; i++) {
            if (i%4==3){
                arrn[i]=b;
                System.out.print("* ");
            }else{
                arrn[i]=b;
                b=b+3;
                System.out.print(arrn[i]+" ");
            }
        }
    }
}
