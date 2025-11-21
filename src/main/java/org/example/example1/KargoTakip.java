package org.example.example1;

import java.util.ArrayList;
import java.util.List;

public class KargoTakip {

    private List<Kargo> kargoListesi= new ArrayList<Kargo>();

    public String kargoEkle(Kargo kargo){
        kargoListesi.add(kargo);
        return "Kargo Eklendi";
    }

    public String kargoAra(String takipNo){

        for(Kargo kargo:kargoListesi){
            if (kargo.getTakipNo().equals(takipNo)){
                System.out.println("kargo bulundu: \n"+kargo.bilgiGöster());
            }
        }

        return "mevcut değil";
    }
}