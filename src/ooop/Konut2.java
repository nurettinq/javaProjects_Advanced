package ooop;

public class Konut2 {
  protected String adres;
  protected String sehir;
  protected String KatSayisi;
  protected int aylikKira;

    public Konut2(String adres, String sehir, String katSayisi, int aylikKira) {
        this.adres = adres;
        this.sehir = sehir;
        KatSayisi = katSayisi;
        this.aylikKira = aylikKira;
    }

    @Override
    public String toString() {
        return "Konut{" +
                "adres='" + adres + '\'' +
                ", sehir='" + sehir + '\'' +
                ", KatSayisi='" + KatSayisi + '\'' +
                ", aylikKira=" + aylikKira +
                '}';
    }
}