package map;

import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        ObjKalip obje1=new ObjKalip("nurettin",28,"yok");
        Map<String, ObjKalip> mapr = new HashMap<String, ObjKalip>();
        mapr.put("bilgi", obje1);
        System.out.println(mapr);












        HashMap hm = new HashMap();

        hm.put("ÇELĐK FATĐH ", 20893682);
        hm.put("ALATLI MERVE", 20895548);
        hm.put("AYGÜN DAMLA ", 20094828);
        hm.put("BÜYÜKKILIÇ AYKUT",20893085);
        hm.put("CAN FEHĐME ",20793172);
        hm.put("CANER HALĐL ", 20393385);
        TreeMap tm = new TreeMap(hm);

        System.out.println(hm);
        System.out.println(tm);
        System.out.println("********************");

        Set<Map.Entry<String,Integer>> es = hm.entrySet();
        String a;
        for (Map.Entry<String,Integer> e : es) {
            a=e.getKey();
            System.out.println(es.remove(e.getKey()));

        }
        System.out.println(es.remove("BÜYÜKKILIÇ AYKUT=20893085"));
        System.out.println(es);
        Iterator i = es.iterator();
        while (i.hasNext()) {

            Map.Entry me = (Map.Entry) i.next();

            System.out.println(me.getKey() + " : " + me.getValue());
        }
        // AYGÜN DAMLA'nın numarasını düzelt
       // hm.put("AYGÜN DAMLA",20894828);
        //hm.put()
       // System.out.println("AYGÜN DAMLA 'nın numarası : "
         //       + hm.get("AYGÜN DAMLA"));
    }
}