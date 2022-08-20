package oop;

public abstract class Konut {
  protected String adres;
  protected String sehir;
  protected String postaKodu;
  protected double aylikKira;
    public Konut(String adres, String sehir, String postaKodu, double aylikKira) {
        this.adres = adres;
        this.sehir = sehir;
        this.postaKodu = postaKodu;
        this.aylikKira = aylikKira;
    }
   public abstract void evinYası(int yas);


    @Override
    public String toString() {
        return
                adres +
                "  " + sehir +
                "  " + postaKodu +
                "  " + aylikKira ;

    }
}
