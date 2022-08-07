package proje_1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KursiyerKayitt {
    static int sayac = 1000;
    List<Kursiyer> kursiyerler = new ArrayList<>();

    public List<Kursiyer> kayitYap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("adınızı ve soyadınızı giriniz");
        String isim = scan.nextLine();
        System.out.println("kurstipini giriniz:\nQA\nDEV\nSALESFORCE\nCYBER SECURİTY");
        String kursTip = scan.nextLine().toUpperCase();
        int id = ++sayac;
        Kursiyer kisi = new Kursiyer(isim, kursTip, LocalTime.now(), id);
        kursiyerler.add(kisi);
        return kursiyerler;
    }

    public void kursUcretiListesi(List<Kursiyer> kurs) {
        for (Kursiyer a : kurs) {
            if (a.id % 5 != 0) {
                if (a.kursTipi.charAt(0) == 'Q') {
                    System.out.println(a.isim + "kurs ücretiniz: 850€");
                }
                if (a.kursTipi.charAt(0) == 'D') {
                    System.out.println(a.isim + "kurs ücretiniz: 950€");
                }
                if (a.kursTipi.charAt(0) == 'C') {
                    System.out.println(a.isim + "kurs ücretiniz: 750€");
                }
                if (a.kursTipi.charAt(0) == 'S') {
                    System.out.println(a.isim + "kurs ücretiniz: 650€");
                }

            } else System.out.println(a.isim + "kurs ücretiniz :0");


        }
    }

    public void listeYap(List<Kursiyer> etka) {
        for (Kursiyer b : etka) {
            System.out.println(b.id + " " + b.isim + "  " + b.kursTipi + "  " + b.kayıtZamanı);


        }
    }

    public void ucretsizKursiyerler(List<Kursiyer> etka2) {
        if(sayac>1004){
        for (Kursiyer c : etka2) {
            if (c.id % 5 == 0) {
                System.out.println("tebrikler " + c.isim + " kursumuz size ücretsizdir");

            }
        }


    }else System.out.println("henüz ücretsiz kursiyer yoktur");}
}
