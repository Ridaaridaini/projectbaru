import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        //terdiri dari 5 hingga 10 karakter
        //hanya berisi karakter alfanumerik dan garis bawah (_)

        Scanner scanner = new Scanner(System.in);
        System.out.print("username: ");
        String[] username = scanner.nextLine().toLowerCase().replace(" ","").split("");
//        String spesialChar = "[]$&+,:;=\\\\\\\\\\\\\\\\?@#|/'<>.^*()%!-";
        String abjad = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
        String[] arrAbj = abjad.split(",");
        String angka = "1,2,3,4,5,6,7,8,9,0";
        String[] arrAngka = angka.split(",");

        String kal = "";
        int a=0;

        for (int i = 0; i < username.length; i++) {
            if(username.length>=5 && username.length<=10){
                if(username[i].contains(arrAbj[i]) || username[i].contains(arrAngka[i]) && username[i].contains("_")) {
                        a=a+1;
                        kal = kal + username[i];
            }

        }
        }
//        System.out.println(kal);
        if(a==0){
            System.out.println("invalid");
        }else {
            System.out.println("valid");
        }




    }
}
