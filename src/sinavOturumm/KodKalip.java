package sinavOturumm;

import java.util.List;

public class KodKalip {

    List<String> ogrenciad;
    List<String> ogretmenad;
    String saat;
    String sınıf;
    String dersKodu;
    String dersAd;
 String ogretmen;


    public KodKalip( List<String> ogretmenad, List<String> ogrenciad, String saat, String dersKodu, String dersAd) {
       //this.ogretmen = ogretmen;
        this.ogrenciad = ogrenciad;
        this.saat = saat;
        //this.sınıf = sınıf;
        this.dersKodu = dersKodu;
        this.dersAd = dersAd;
        setSınıf(ogrenciad);
        setOgretmen(ogrenciad,ogretmenad);
    }

    public void setOgretmen(List<String> ogrenci, List<String> ogretmenad) {
        if(ogrenciad.size()<30){
            String og=ogretmenad.get(0);
            this.ogretmen = og;
        }else if(ogrenciad.size()<60){
            String og=ogretmenad.get(0);
            String og2=ogretmenad.get(1);
            this.ogretmen = og+"\n"+og2;

        }else if(ogrenciad.size()<90){
            String og=ogretmenad.get(0);
            String og2=ogretmenad.get(1);
            String og3=ogretmenad.get(2);
            this.ogretmen = og+"\n"+og2+"\n"+og3;        }
    }

    public void setSınıf(List<String> ogrencia) {
        if(ogrenciad.size()<30){
            this.sınıf = "C-101";
        }else if(ogrenciad.size()<60){
            this.sınıf = "C-101\nC-102";
        }else if(ogrenciad.size()<90){
            this.sınıf = "C-101\nC-102\nC-103";
        }
    }
}
