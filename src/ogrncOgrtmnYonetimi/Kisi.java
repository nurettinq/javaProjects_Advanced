package ogrncOgrtmnYonetimi;

public class Kisi {
   private String adSoyad;
   private String kimlikNo;
   private int yas;

    public Kisi(String adSoyad, String kimlikNo, int yas) {
       // this.adSoyad = adSoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        setAdSoyad(adSoyad);
    }
    public Kisi(){}

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas<0){

        this.yas =-1* yas;
    }}

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
