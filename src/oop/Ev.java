package oop;

public class Ev extends Konut implements Kiralanabilir{
    private final double sigorta=1000;
    public Ev(String adres, String sehir, String postaKodu, double aylikKira) {
        super(adres, sehir, postaKodu, aylikKira);

    }

    @Override
    public void evinYası(int yas) {
        System.out.println("evin yası"+yas);
    }

    public double depozito(){
        return aylikKira+uygulamaUcreti+sigorta;
   }
}
