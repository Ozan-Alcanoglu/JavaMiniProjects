package org.example.example1;

public class Main {
    public static void main(String[] args) {

        Kargo kargo1=new Kargo("a","b",KargoDurum.HAZIRLANIYOR);
        Kargo kargo2=new Kargo("b","a",KargoDurum.YOLDA);
        Kargo kargo3=new Kargo("a","c",KargoDurum.IPTAL);


        System.out.println(kargo1.bilgiGöster());
        System.out.println(kargo2.bilgiGöster());
        System.out.println(kargo3.bilgiGöster());

        kargo1.durumGüncelle(KargoDurum.IPTAL);

        System.out.println(kargo1.bilgiGöster());

        System.out.println("");
        System.out.println("");
        System.out.println("");

        KargoTakip kargoTakip= new KargoTakip();

        kargoTakip.kargoEkle(kargo1);
        kargoTakip.kargoEkle(kargo2);
        kargoTakip.kargoEkle(kargo3);

        kargoTakip.kargoAra(kargo1.getTakipNo());
    }
}
