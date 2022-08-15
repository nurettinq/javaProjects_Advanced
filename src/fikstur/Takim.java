package fikstur;

import java.util.*;

public class Takim {
   static List <String> lisre = new ArrayList<>();
   public static void main(String[] args) {

tumHaftalar();


    }
        public static Map<Integer,String> ilkHafta(List<String> lis){
            List<String> lis1 = new ArrayList<String>(Arrays.asList("trabzonspor", "bay", "ankaragücü", "galatasaray", "fenerbahce", "beşiktaş", "konya", "malatya", "antalyaspor", "denizlispor"));

        Map<Integer,String> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        lisre.add("ass");
            boolean flag=false;
       int i=1;
            while(!lis.isEmpty()){

                          int a=new Random().nextInt(lis.size());
      int b=new Random().nextInt(lis.size());

            if(a!=b){
                String x=lis.get(a);
                String y=lis.get(b);
             //   if(!lisre.contains(x+ "vs" + y)&&!lisre.contains(y+ "vs" + x))
                lisre.add(x+ "vs" + y);
                lisre.add(y+ "vs" + x);

                for (String ara:lisre){
                if(!map1.values().contains(ara)){
                    flag=true;}else{
                    lis=lis1;
                    map1.clear();
                }
                    if(flag){

            lis.remove(x);
            lis.remove(y);
            map1.put(i,x+ "vs" + y);
                    i++;

    }

            } }}
            map2=new HashMap<>(map1);
       return map2;}


    private static void tumHaftalar() {
        System.out.println("bitti");
        List<String> list = new ArrayList<>(Arrays.asList("trabzonspor","bay","ankaragücü","galatasaray","fenerbahce","beşiktaş","konya","malatya","antalyaspor","denizlispor"));
        Map<String, Set<String>> mapHaftalar = new HashMap<>();
        for(int i=0; i<list.size()-1; i++) {

            Set sss = ilkHafta(list).entrySet();
            mapHaftalar.put(i+1 + ".hafta", sss);
            list = new ArrayList<String>(Arrays.asList("trabzonspor", "bay", "ankaragücü", "galatasaray", "fenerbahce", "beşiktaş", "konya", "malatya", "antalyaspor", "denizlispor"));
        }
        TreeMap sonHali=new TreeMap(mapHaftalar);
        System.out.println(sonHali);
        System.out.println(lisre);

      //  System.out.println(mapHaftalar.values());
    }
}
