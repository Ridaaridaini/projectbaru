package day2;

public class PerbandinganString {
    public static void main(String[] args) {
        String str1 = "bagus";
        String str2 = "iman";
        String str3 = "Bagus";

        boolean cek1 = str1.equals(str2);
        boolean cek2 = str2.equalsIgnoreCase(str3);
        boolean cek3 = !str3.equals(str1);

        System.out.println(cek1);
    }
}
