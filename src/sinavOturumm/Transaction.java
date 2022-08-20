package sinavOturumm;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static sinavOturumm.VeriAktarma.derslerVeKodlari;
import static sinavOturumm.VeriAktarma.ogrenciler;

public class Transaction {
    /*
    1 - Derslere göre öğrencileri belirleyeceğiz
    2 - Öğrencileri sınıflara atayacağız
    3 - Öğretmenleri sınıflara atayacağız
    4 -

     */

    public static Map<String, Integer> dersBelirleme() throws IOException {

        Map<String, Integer> derslereGoreOgrenciler = new HashMap<>();

        for (Map.Entry<String, String> each : derslerVeKodlari().entrySet()
        ) {
            int count = 0;
            int count2 = 0;
            String dersKodu = each.getKey();

            for (Map.Entry<String, Ogrenci> each2 : ogrenciler().entrySet()) {

                String ogrenciDersi = each2.getValue().ogrenciDers;

                if (ogrenciDersi.equals(dersKodu)) {
                    count++;
                }
            }
            derslereGoreOgrenciler.put(dersKodu, count);

        }
        System.out.println(derslereGoreOgrenciler);
        return derslereGoreOgrenciler;
    }

    public static Map<String,String> dersKodunaGore(Map<String,Ogrenci>abc,String dersKodu){

        Map<String,String> sinavaGoreOgrenciler=new HashMap<>();

        for (Map.Entry<String,Ogrenci> w:abc.entrySet()
        ) {
            if (dersKodu.equals(w.getValue().ogrenciDers)){
                sinavaGoreOgrenciler.put(w.getValue().ogrenciAdiSoyadi,dersKodu);
            }


        }

        return sinavaGoreOgrenciler;
    }

    public static int birOgrencininKacDersiVar() throws IOException {
        int count=0;
        int count2=0;
        for (Map.Entry<String,Ogrenci> w:ogrenciler().entrySet()
        ) {
            count=1;


            for (Map.Entry<String,Ogrenci> x:ogrenciler().entrySet()
            ) {
                if (!(w.getValue().ogrenciDers.equals(x.getValue().ogrenciDers))&&w.getValue().ogrenciAdiSoyadi.equals(x.getValue().ogrenciAdiSoyadi)){

                    count++;


                }
            }
            System.out.print(count);
            count2++;



        }
        System.out.println();
        System.out.println(count2);
        return count;
    }
}