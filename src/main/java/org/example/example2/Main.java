package org.example.example2;

public class Main {

    public static void main(String[] args) {

        Urun a=new Urun("a",100,20);
        Urun b=new Urun("b",10,50);
        Urun c=new Urun("c",5,10);
        Urun d=new Urun("d",20,20);

        DepoYonetimi depoYonetimi= new DepoYonetimi();

        depoYonetimi.urunEkle(a);
        depoYonetimi.urunEkle(b);
        depoYonetimi.urunEkle(c);
        depoYonetimi.urunEkle(d);

        depoYonetimi.kritikUrunleriGoster();

    }
}
