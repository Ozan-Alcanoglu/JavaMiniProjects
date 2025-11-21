package org.example.example1;

import java.util.UUID;

public class Kargo {

    private String takipNo= UUID.randomUUID().toString();

    private String gönderenAdi;
    private String aliciAdi;
    private KargoDurum durum;

    public Kargo(String gönderenadi,String aliciadi, KargoDurum durum){
        this.gönderenAdi=gönderenadi;
        this.aliciAdi=aliciadi;
        this.durum=durum;
    }

    public String getTakipNo(){
        return this.takipNo;
    }

    public String getGönderenAdi(){
        return this.gönderenAdi;
    }

    public String getAliciAdi(){
        return this.aliciAdi;
    }

    public KargoDurum getDurum(){
        return this.durum;
    }

    public void setAliciAdi(String aliciAdi) {
        this.aliciAdi = aliciAdi;
    }

    public void setDurum(KargoDurum durum) {
        this.durum = durum;
    }

    public void setGönderenAdi(String gönderenAdi) {
        this.gönderenAdi = gönderenAdi;
    }


    public String durumGüncelle(KargoDurum yeniDurum){
        this.durum=yeniDurum;
        return "Durum Güncellendi";
    }


    public String  bilgiGöster(){
        return "takipno: "+ takipNo+"\n"+
         "gönderen: "+ gönderenAdi+"\n"+
         "takipno: "+ aliciAdi+"\n"+
         "durum: "+ durum.toString();
    }

}


enum KargoDurum {
    YOLDA,
    HAZIRLANIYOR,
    IPTAL
}