package org.example.example4;

public class Main {

    public static void main(String[] args) {

        Sozluk sozluk= new Sozluk();


        sozluk.kelimeEkle("elma");
        sozluk.kelimeEkle("alma");
        sozluk.kelimeEkle("kasa");
        sozluk.kelimeEkle("kedi");
        sozluk.kelimeEkle("kelimeler");
        sozluk.kelimeEkle("kalem");
        sozluk.kelimeEkle("elmas");

        sozluk.kelimeGecerliMİ("elmaz");

        sozluk.benzerKelimeBul("kasa");
    }
}
