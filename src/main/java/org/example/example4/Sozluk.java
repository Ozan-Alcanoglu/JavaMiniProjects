package org.example.example4;


import java.util.HashSet;
import java.util.Set;

public class Sozluk {

    private Set<String> sozluk= new HashSet<>();

    public void kelimeEkle(String kelime){
        try {
            sozluk.add(kelime);
            System.out.println("kelime eklendi\n");
        }
        catch (Exception e){
            System.out.println("hata oldu la: "+e);
        }
    }

    public void kelimeBul(String kelime){
        try {
            System.out.println(sozluk.contains(kelime) ? "mevcut" : "mevcut değil");
        }
        catch (Exception e ){
            System.out.println("hata: "+e);
        }
    }


    public void kelimeGecerliMİ(String kelime){
        try {
            System.out.println(sozluk.contains(kelime) ? "gecerli" : "gecerli değil");
        }
        catch (Exception e ){
            System.out.println("hata: "+e);
        }
    }

    public void benzerKelimeBul(String kelime){

        for(String benzer:sozluk){

            int aynıharfsayısı=0;

            if (benzer.length()==kelime.length()){
                for(int i=0;i< kelime.length(); i++){

                    if (benzer.charAt(i)==kelime.charAt(i)){
                        aynıharfsayısı+=1;
                    }

                }

                if (aynıharfsayısı==kelime.length()-1 || aynıharfsayısı==kelime.length()){
                    System.out.println(benzer);
                }
            }
        }
    }

}
