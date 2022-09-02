package sinavOturum;

import java.io.IOException;
import java.util.*;

import static sinavOturum.Transaction.dersKodunaGore;
import static sinavOturum.Transaction.farkliDErslereGirenler;
import static sinavOturum.VeriAktarma.ogrenciler;

public class Siniff extends KodKalip{

    public static void sinavSaatleri(Map<String, String> a, Map<String, Ogrenci> vv, List<String> ogretmen) throws IOException {

        List<String> kodlar = new ArrayList<>();
        List<String> ogrenciList = new ArrayList<>();
        List<String> derssskkkodu = new ArrayList<>();
        List<String> ikinciOturumIcinDersListi = new ArrayList<>();
        Map<String, KodKalip> kodaGoreOturum = new HashMap<>();
        for (Map.Entry<String, String> w : a.entrySet()) {

            kodlar.add(w.getKey());
        }
        int count = 0;

        List<String> oturumSaatleri = new ArrayList<>();
        oturumSaatleri.add("pazartesi 09:00");
        oturumSaatleri.add("pazartesi 14:00");
        oturumSaatleri.add("sali 09:00");
        oturumSaatleri.add("sali 14:00");
        oturumSaatleri.add("carsamba 09:00");
        oturumSaatleri.add("carsamba 14:00");
        oturumSaatleri.add("persembe 09:00");
        oturumSaatleri.add("persembe 14:00");
        oturumSaatleri.add("cuma 09:00");
        oturumSaatleri.add("cuma 14:00");

        while (!kodlar.isEmpty()) {
            int n = new Random().nextInt(kodlar.size());
            String dersKodu = kodlar.get(n);
            derssskkkodu.add(dersKodu);
            kodlar.remove(dersKodu);
            ogrenciList=dersKodunaGore(ogrenciler(),dersKodu);

            int oturum=1;

                KodKalip dersss = new KodKalip(ogretmen, ogrenciList, count, oturum,oturumSaatleri, dersKodu, a.get(dersKodu));
            System.out.printf("%-30s",dersss.oturumSaati);
            System.out.printf("%-15s",dersss.dersKodu);
            System.out.printf("%-30s",dersss.dersAd);
            System.out.printf("%-45s",dersss.ogretmen);
            System.out.printf("%-30s",dersss.sinif);
            //System.out.println(dersss.ogrenciad);

            System.out.println();
                kodaGoreOturum.put(dersKodu, dersss);
            ikinciOturumIcinDersListi=farkliDErslereGirenler(vv,a,ogrenciList);
            if(ikinciOturumIcinDersListi.size()!=0){
                dersKodu=ikinciOturumIcinDersListi.get(0);
                if(!dersKodu.contains(dersKodu)){
                derssskkkodu.add(dersKodu);
              oturum=2;
                ogrenciList=dersKodunaGore(ogrenciler(),dersKodu);
                kodlar.remove(dersKodu);
                KodKalip derss2 = new KodKalip(ogretmen, ogrenciList, count,oturum, oturumSaatleri, dersKodu, a.get(dersKodu));
                System.out.printf("%-30s",derss2.oturumSaati);
                System.out.printf("%-15s",derss2.dersKodu);
                System.out.printf("%-30s",derss2.dersAd);
                System.out.printf("%-45s",derss2.ogretmen);
                System.out.printf("%-30s",derss2.sinif);
                  //  System.out.println(derss2.ogrenciad);

                System.out.println();

                kodaGoreOturum.put(dersKodu, derss2);
      }}    count++;



            }
    }
}