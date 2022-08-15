package fikstur;

import java.util.*;

public class YEni {
    static Scanner scan = new Scanner(System.in);
    static int takimSayisi;
    public static void main(String[] args) {
        System.out.println("liginiz kaç takımlı olsun");
       takimSayisi = scan.nextInt();
        Set<String> takimlar = new HashSet<String>();
        if(takimSayisi%2!=0){
            takimlar.add("bay");
        }
        while (takimlar.size() != takimSayisi) {
            System.out.println("takımları giriniz");
            String takim = scan.next();
            takimlar.add(takim);

        }
        System.out.println(takimlar);
        List<String> takk=new ArrayList<String>(takimlar);
        List<String> tak2=new ArrayList<String>(takk);
        System.out.println(takk);

        haftalar(takk,firstWeek(tak2));

    }
    private static List firstWeek(List<String> takimlariOlustur) {
    List<String> karsilama=new ArrayList<String>();
int i=0;
        while(!takimlariOlustur.isEmpty()) {

            int a = new Random().nextInt(takimlariOlustur.size());
            int b = new Random().nextInt(takimlariOlustur.size());

            if (a != b) {
                String x = takimlariOlustur.get(a);
                String y = takimlariOlustur.get(b);
                //   if(!lisre.contains(x+ "vs" + y)&&!lisre.contains(y+ "vs" + x))

                takimlariOlustur.remove(x);
                takimlariOlustur.remove(y);
                i++;
              karsilama.add(x+" vs "+y);
              karsilama.add(y+" vs "+x);

            }

      }


return karsilama;}
 public static List<String> haftalar(List<String> ta, List<String> tak){
        List<String> son=new ArrayList<String>();
        int i=1;
        boolean flag=false;
        while(i<takimSayisi){
     for (String a:tak) {
         for(String b:son) {
             if(a.equals(b)){
                 flag =true;
             }
         }}if(!flag){
                i++;
         System.out.println(i+".hafta");
         son.addAll(tak);
         System.out.println(tak);
                System.out.println(ta);
                firstWeek(ta);
     }else{
         firstWeek(ta);
            }



}  return son; }}