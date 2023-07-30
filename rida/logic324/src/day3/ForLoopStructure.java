package day3;

public class ForLoopStructure {
    public static void main(String[] args) {
        //alur
        //(1)(2)(true)(4)(3)(2)(true)(4)(3)(2)(false)->perulangan berhenti
        for (int i=0 /*deklarasi(1)*/;i<5/*kondisi(apakah perulangan akan dilanjutkan(2)*/;i++/*Incremental(i=i+1)(3)*/){
            //deklarasi yang dibuat pada steatment for dan didalam for tidak dapat digunakan diluar body for
            //steatment didalam kurung for bersifat opsional pada(kodisi)defoult true)
            //Body perulangan(4)
            System.out.println(i);

        }
        //i=1; tidak bisa karna 1 hanya dapat di deklarasi di dalam body

    }
}
