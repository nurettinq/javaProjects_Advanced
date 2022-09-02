package sinavOturum;


import java.util.*;


public class Transaction {

    public static List<String> dersKodunaGore(Map<String,Ogrenci>abc,String dersKodu){

        List< String> dersKodunaOgrenciler = new ArrayList<>();

        for (Map.Entry<String,Ogrenci> w:abc.entrySet()
             ) {
            if (dersKodu.equals(w.getValue().ogrenciDers)){
                dersKodunaOgrenciler.add(w.getValue().ogrenciAdiSoyadi);
            }}
        return dersKodunaOgrenciler;
    }  public static List<String> farkliDErslereGirenler(Map<String, Ogrenci>ogrenciVeDersleri, Map<String, String> dersVeKodlari, List<String>list){
        Set<String> e=new HashSet<>();
        Set<String> c=new HashSet<>();
        for (Map.Entry<String, String> w : dersVeKodlari.entrySet()) {
            c.add(w.getKey());
        }
        for (String s : list) {

            for (Map.Entry<String, Ogrenci> each : ogrenciVeDersleri.entrySet()) {
                if (s.equals(each.getValue().ogrenciAdiSoyadi)) {
                    e.add(each.getValue().ogrenciDers);
                }}}
        c.removeAll(e);

        return new ArrayList<String>(c);
    }


}