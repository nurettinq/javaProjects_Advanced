package okul_proje;

public class OgretmenBilgiler {
    String isim;
    String soyad;
    String tel;
    String brans;
    int yas;

    public OgretmenBilgiler(String isim, String soyad, String tel, String brans, int yas) {
        this.isim = isim;
        this.soyad = soyad;
        this.tel = tel;
        this.brans = brans;
        this.yas = yas;
    }

    public OgretmenBilgiler() {
    }

    @Override
    public String toString() {
        return "OgretmenBilgiler{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyad='" + soyad + '\'' +
                ", \ntel='" + tel + '\'' +
                ",\n brans='" + brans + '\'' +
                ",\n yas=" + yas +
                '}';
    }
}
