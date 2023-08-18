package mendalamiLatihanLogic;

public class ArraySoal07 {

    public static void main(String[] args) {

        int[] arrDeret = {5,4,3,1,2,7,9,8};

        int jumlah = 0;

        System.out.print("awal: ");
        for (int i = 0; i < arrDeret.length; i++) {
            jumlah += arrDeret[i];
            if (i == arrDeret.length-1){
                System.out.print(arrDeret[i] + "=" + jumlah);
                break;
            }
            System.out.print(arrDeret[i] + "+");
        }

        System.out.println();
        System.out.print("ganjil: ");

        jumlah = 0;
        for (int i = 0; i < arrDeret.length; i++) {

            if (i%2==0){
                continue;
            }
            jumlah += arrDeret[i];
            if (i == arrDeret.length-1){
                System.out.print(arrDeret[i] + "=" + jumlah);
                break;
            }
            System.out.print(arrDeret[i] + "+");
        }

        System.out.println();
        System.out.print("genap: ");

        jumlah = 0;
        for (int i = 0; i < arrDeret.length; i++) {

            if (i%2!=0 || i==0){
                continue;
            }
            jumlah += arrDeret[i];
            if (i == arrDeret.length-2){
                System.out.print(arrDeret[i] + "=" + jumlah);
                break;
            }
            System.out.print(arrDeret[i] + "+");
        }

    }

}
