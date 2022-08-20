package deneme;

public class Ogrenci4 {
    String ogrenciAdSoyad;
    String ogrDers;

    public Ogrenci4(String ogrenciAdSoyad, String ogrDers) {
        this.ogrenciAdSoyad = ogrenciAdSoyad;
        this.ogrDers = ogrDers;
    } public Ogrenci4(){}

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciAdSoyad='" + ogrenciAdSoyad + '\'' +
                ", ogrDers='" + ogrDers + '\'' +
                '}';
    }
}
