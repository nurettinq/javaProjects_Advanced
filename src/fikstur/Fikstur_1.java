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
        takimlar.add("bay");}
        takimSayisi++;
        System.out.println(takimlar);
        List<String> takk=new ArrayList<>(takimlar);
        haftalariHesapla(takk);
}

        private static void haftalariHesapla(List<String> takk) {
        int j=1;
        while(j<2*takimSayisi-1){
        System.out.println(j+".hafta");

            for (int k = 0; k <takimSayisi/2 ; k++) {
                String x=takk.get(takimSayisi-k-1);
                    String y=takk.get(k);
                if(j<takimSayisi){
            System.out.println(x+" vs "+y);
                }else{ System.out.println(y+" vs "+x);}

        }String a=takk.get(1);
            takk.remove(a);
            takk.add(a);

            System.out.println(takk);
        j++;}


        }

    }
