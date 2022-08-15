package fikstur;

import java.util.*;

public class Pojo {
    public static void main(String[] args) {


    Map<String, String> map = new HashMap<String, String>();
    map.put("foo", "bar");
    map.put("fo", "bers");
    map.put("f", "resat");
        Map<String, String> map1= new HashMap<String, String>();
        map1.put("foo", "bar");
        map1.put("fo", "bers");
        System.out.println(map.values().equals(map1.values()));
        List<String> lisre = new ArrayList<String>();
        lisre.add("sdfsd");
        lisre.add("nurullah");
        lisre.add("nurettin");
        lisre.add("bar");
        lisre.add("nurullah");
        String a="nurullah";
        System.out.println(lisre.contains(a));
        int ar=new Random().nextInt(lisre.size());
        System.out.println(ar);
        for (String adds : lisre)
            System.out.println(map.values().contains(adds));
        Set<String> set = new HashSet<String>();
        set.add("nurettin");
        set.add("musa");
        set.add("salif");
        set.add("ntin");
        set.add("nurettin");
      LinkedHashSet set2 = new LinkedHashSet(lisre);
      LinkedHashSet set3 = new LinkedHashSet(set);
      LinkedList list = new LinkedList(lisre);
        System.out.println(list);

    }}
