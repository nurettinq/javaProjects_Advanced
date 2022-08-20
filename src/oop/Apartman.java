package oop;

public  class  Apartman extends Konut implements Kiralanabilir{
        private String apartmanNumber;
    public Apartman(String adres, String apartmanNumber,String sehir, String postaKodu, double aylikKira) {
        super(adres, sehir, postaKodu, aylikKira);
        this.apartmanNumber = apartmanNumber;
    }

    public String getApartmanNumber() {
        return apartmanNumber;
    }

    public void setApartmanNumber(String apartmanNumber) {
        this.apartmanNumber = apartmanNumber;
    }

    @Override
    public void evinYası(int yas) {
        System.out.println("evin yaşı"+yas);
    }

    @Override
    public String toString() {
        return adres+
                "  " + apartmanNumber+" "+sehir+" "+postaKodu+" "+ aylikKira;
    }
    public double depozito(){
        return aylikKira+uygulamaUcreti;

    }
}
