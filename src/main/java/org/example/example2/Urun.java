package org.example.example2;

import java.util.UUID;

public class Urun {

    public String getÜrünKodu() {
        return ürünKodu;
    }

    private String ürünKodu= UUID.randomUUID().toString();
    private String ürünAdı;
    private int stokAdedi;
    private int kritikEsik ;

    public String getÜrünAdı() {
        return ürünAdı;
    }

    public void setÜrünAdı(String ürünAdı) {
        this.ürünAdı = ürünAdı;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    public int getKritikEsik() {
        return kritikEsik;
    }

    public void setKritikEsik(int kritikEsik) {
        this.kritikEsik = kritikEsik;
    }

    public Urun(String ürünAdı, int stokAdedi, int kritikEsik) {
        this.ürünAdı = ürünAdı;
        this.stokAdedi = stokAdedi;
        this.kritikEsik = kritikEsik;
    }

    public void stokAzalt(int miktar){
        this.stokAdedi=stokAdedi-miktar;
    }

    public void stokArttır(int miktar){
        this.stokAdedi=stokAdedi+miktar;
    }

    public boolean kritikMi(){

        return this.stokAdedi <= this.kritikEsik ;
    }


}
