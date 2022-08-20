package ooop;

import oop.Konut;

public abstract class Residans extends Konut2 implements Deposito{
protected boolean laundry;
    public Residans(String adres, boolean laundry, String sehir, String katSayisi, int aylikKira) {
        super(adres, sehir, katSayisi, aylikKira);
        this.laundry=laundry;

    }

      public int depozito(int kira){
      return kira*4;
  }
  abstract boolean resepsiyonvarMi();

    @Override
    public String toString() {
        return "Residans{" +
                "laundry=" + laundry +
                ", adres='" + adres + '\'' +
                ", sehir='" + sehir + '\'' +
                ", KatSayisi='" + KatSayisi + '\'' +
                ", aylikKira=" + aylikKira +
                '}';
    }
}