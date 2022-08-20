package sinavOturumm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class deneme {

    public static void main(String[] args) {
        Map<String, List> ogrencilerMap = new HashMap<>();
        List<String> ogrencilerList = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            ogrencilerList.clear();
            for (int j = 0; j <5 ; j++) {
                ogrencilerList.add(""+j);



            }
            ogrencilerMap.put(""+i, ogrencilerList);

        } System.out.println(ogrencilerMap);




        /*
        Ogrenci ogrenci1=new Ogrenci("nurettin","sosyal");
        Ogrenci ogrenci2=new Ogrenci("fatma","hukuk");
        Ogrenci ogrenci3=new Ogrenci("sümeyye","hukuk");
        ogrencilerMap.put("hukuk",ogrenci1);
        ogrencilerMap.put("hukuk",ogrenci2);
        ogrencilerMap.put("hukuk",ogrenci3);
        System.out.println(ogrencilerMap);*/
    }
}
