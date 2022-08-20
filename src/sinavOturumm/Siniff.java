package sinavOturumm;

import java.io.IOException;
import java.util.*;

import static sinavOturumm.Transaction.dersKodunaGore;
import static sinavOturumm.VeriAktarma.derslerVeKodlari;
import static sinavOturumm.VeriAktarma.ogrenciler;


public class Siniff {

    public static Map<String, String> sinavSaatleri(Map<String, String> a, Map<String, Ogrenci> vv, List<String> ogretmen) throws IOException {
        List<String> kodlar = new ArrayList<>();

        Map<String, String> kodaGoreOturum = new HashMap<>();

        String oturumSaati = "";

        for (Map.Entry<String, String> w : a.entrySet()) {

            kodlar.add(w.getKey());


        }

        while(!vv.isEmpty()){
            int n = new Random().nextInt(kodlar.size());
            String dersKodu = kodlar.get(n);
            for(Map.Entry<String,Ogrenci>ss:ogrenciler().entrySet()){

            for (Map.Entry<String, String> e :   dersKodunaGore(ogrenciler(), dersKodu).entrySet()){

                if(!ss.getValue().ogrenciAdiSoyadi.contains(e.getKey())){

KodKalip dersss=new KodKalip(ogretmen,)
                    kodaGoreOturum.put(dersKodu,"oyyfdfd");
                vv.remove(e.getKey());
                    kodlar.remove(dersKodu);
                }
            }
            }
        }return kodaGoreOturum;}

    public static String oturumsaati(){
        String oturumSaat="";
           List<String>saat =new ArrayList<>(Arrays.asList("09:00", "14:00") );
        List<String>gun = new ArrayList<>(Arrays.asList("pazartesi", "sali", "carsamba", "persembe", "cuma","pazartesi2", "sali2", "carsamba2", "persembe2", "cuma2"));
        for (String a:saat){
            for (String b:gun) {




                    oturumSaat = ""+a + "gun" +b + "saati";



                 /*   for (Map.Entry<String,Ogrenci>w:ogrenciler().entrySet()) {
                        if (dersKodu.equals(w.getValue().ogrenciDers)&&w.getValue().ogrenciAdiSoyadi.equals()){


                        }

                    }*/



                }

            }

       return oturumSaat; }


    }

