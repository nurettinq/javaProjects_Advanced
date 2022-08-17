package fikstur;

import java.util.*;

public class Fikstur_1 {

    static Scanner scan = new Scanner(System.in);
    static int takimSayisi;
    public static void main(String[] args) {
        System.out.println("liginiz kaç takımlı olsun");
        takimSayisi = scan.nextInt();
        Set<String> takimlar = new HashSet<>();
        while (takimlar.size() != takimSayisi) {
            System.out.println("takımları giriniz");
            String takim = scan.next();
            takimlar.add(takim);
        }
          if(takimSayisi%2!=0){
        takimlar.add("bay");
              takimSayisi++;}
          List<String> takimlarList=new ArrayList<>(takimlar);
        List<String> karmaTakimlar=new ArrayList<>();
        for (int i = 0; i <takimSayisi ; i++) {
            int rnd=new Random().nextInt(takimlarList.size());
            String x=takimlarList.get(rnd);
            karmaTakimlar.add(x);
            takimlarList.remove(x);
        }  haftalariHesapla(karmaTakimlar);
}
        private static void haftalariHesapla(List<String> son) {
        int j=1;
        while(j<=2*takimSayisi-2){
        System.out.println(j+".hafta");
            System.out.println(son);
        String x="", y="";
            for (int k = 0; k <takimSayisi/2 ; k++) {
                if(k==0&&j%2!=0){
                    y = son.get(takimSayisi - k - 1);
                    x = son.get(k);
                }
                 else if (k % 2 == 0) {
                    x = son.get(takimSayisi - k - 1);
                    y = son.get(k);
                } else {
                    y = son.get(takimSayisi - k - 1);
                    x = son.get(k);
                }
                if (j < takimSayisi) {
                    System.out.println(x + " vs " + y);
                } else {
                    System.out.println(y + " vs " + x);
                }
        }String Eleman=son.get(1);
            son.remove(Eleman);
            son.add(Eleman);

        j++;}}


        }


