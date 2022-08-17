package deneme;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Kss {
    public static void main(String[] args) {
        Map<Integer,Lss> kayit=new HashMap<>();
        kayit.put(1,new Lss("nure","nuri","noru","nuris"));
        kayit.put(2,new Lss("nure1","nuri1","noru1","nuris1"));
        kayit.put(3,new Lss("nure2","nuri2","noru2","nuris2"));
        kayit.put(4,new Lss("nure3","nuri3","noru3","nuris3"));
        kayit.get(1).name="nurettin";
        System.out.println(kayit);



    }
}
