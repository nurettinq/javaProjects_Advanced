package filmtahmiini;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmini {

    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

     */
     static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("~~~FİLM TAHMİN OYNUNA HOŞGELDİNİZ~~~~");
        System.out.println(" 0 ile "+filmler.size()+ "  e kadar bi tahminde bulununuz");
        int filmIndex=scan.nextInt();
        String tahminFilm=filmler.get(filmIndex);
        System.out.println("tahmin edeceğiniz film :"+tahminFilm.length()+"harflidir");
        int tahminHakki=2*tahminFilm.length();
        System.out.println("tahminHakki = " + tahminHakki);
        int count=1;
      do{
          tahminHakki--;
            System.out.println(tahminFilm.length()+"harfli yabancı filmi tahmin etmek için harf giriniz");
            String tahmin=scan.next().toUpperCase();
            if(tahmin.equals(tahminFilm)){
                System.out.println("tebrikler  "+count+". defa da doğru tahminde buldunuz");
                System.out.println("doğru tahmin :"+tahminFilm);
                break;
            }else{
                if (tahminHakki!=0){
                    System.out.println("yanlış tahmin : "+tahmin);
                    System.out.println("yanlış tahmin ettiniz kalan tahmin hakkınız : "+tahminHakki);
                System.out.println("yanlış tahmin sayısı : "+count);

                }else{
                    System.out.println("tahmin hakkınız kalmadı !!!");
                    System.out.println("yanlış tahmin :"+tahmin);
                    System.out.println("sectiğiniz film :"+tahminFilm);

                }

            }count++;



      }while(tahminHakki>0);

    }
}
