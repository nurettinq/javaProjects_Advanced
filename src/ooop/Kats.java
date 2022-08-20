package ooop;

public class Kats extends Residans{


    public Kats(String adres, boolean laundry, String sehir, String katSayisi, int aylikKira) {
        super(adres, laundry, sehir, katSayisi, aylikKira);
    }

    @Override
    boolean resepsiyonvarMi() {
        return false;
    }

    @Override
    public String toString() {
        return "Kats{" +
                "laundry=" + laundry +
                ", adres='" + adres + '\'' +
                ", sehir='" + sehir + '\'' +
                ", KatSayisi='" + KatSayisi + '\'' +
                ", aylikKira=" + aylikKira +
                '}';
    }
}
