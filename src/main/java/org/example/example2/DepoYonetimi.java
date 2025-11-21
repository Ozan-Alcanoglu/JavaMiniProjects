package org.example.example2;

import java.util.*;

public class DepoYonetimi {

    Map<String, Urun> urunler = new HashMap<>();

    Set<Urun> kritikUrunler = new HashSet<>();

    public DepoYonetimi() {
    }

    public void urunEkle(Urun urun){
        urunler.put(urun.getÜrünKodu(),urun);
        if (urun == null) return;

        if (urun.kritikMi()){
            kritikUrunler.add(urun);
        }
    }

    public void urunGuncelle(String urunKodu, int degisimMiktari){
        Urun urun=urunler.get(urunKodu);

        if(urun.kritikMi()){
            urun.setStokAdedi(urun.getStokAdedi()+degisimMiktari);
            if (!urun.kritikMi()){
                kritikUrunler.remove(urun);
            }
        }
        else {
            urun.setStokAdedi(urun.getStokAdedi()+degisimMiktari);
            if (urun.kritikMi()){
                kritikUrunler.add(urun);
            }
        }
    }

    public void kritikUrunleriGoster(){
        for(Urun urun:kritikUrunler){
                System.out.println(urun.getÜrünKodu()+" ve ürün adı: "+urun.getÜrünAdı()+"\n");

        }
    }
}
