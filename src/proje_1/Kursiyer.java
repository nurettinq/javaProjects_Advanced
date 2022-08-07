package proje_1;

import java.time.LocalTime;

public class Kursiyer {
    String isim;
    String kursTipi;
    LocalTime kayıtZamanı;
    int id;

    public Kursiyer(String isim, String kursTipi, LocalTime kayıtZamanı, int id) {
        this.isim = isim;
        this.kursTipi = kursTipi;
        this.kayıtZamanı = kayıtZamanı;
        this.id = id;
    }
}
