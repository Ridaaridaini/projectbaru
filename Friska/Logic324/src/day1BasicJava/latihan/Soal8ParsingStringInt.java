package day1BasicJava.latihan;

public class Soal8ParsingStringInt {
    public static void main(String[] args) {
        String strA ="10";
        String strB = "3";
        double intA = Integer.parseInt(strA);
        double intB = Integer.parseInt(strB);
        double hasilbagi = intA / intB;


        System.out.println(intA);
        System.out.println(intB);
        System.out.println("hasil bagi: "+ hasilbagi);

    }
}
