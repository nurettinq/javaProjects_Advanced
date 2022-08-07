package ogrncOgrtmnYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Ogrenci> ogrenciListesi=new ArrayList<>();
    static List<Ogretmen>ogretmenListesi=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static int sayac=1000;
    static String kisiTuru;

    public static void girisPaneli(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        System.out.println("işleminizi seçiniz  :");
        String secim=scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
                case "2":
                    kisiTuru="OGRETMEN";
                    islemMenusu();
                    break;
            case "Q":
                cikisIslem();

                break;
            default:
                System.out.println("hatalı işlem yaptınız. :(");
                girisPaneli();


        }
    }

    private static void cikisIslem() {
        System.out.println("~~~~GÜLE GÜLE~~~~");
    }

    public static void islemMenusu(){
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ\n");
        System.out.println("işlem tercihinizi giriniz");
        int secilenIşlem=scan.nextInt();
        switch (secilenIşlem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                ara();
                islemMenusu();
                break;

            case 3:
                listele();
                islemMenusu();

                break;

            case 4:
                islemMenusu();

                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatalı giris yaptınız");
                islemMenusu();
                break;



        }
    }

    private static void ara() {
        System.out.println("1-isme göre\n2-ogrenci no ya göre");
        int istek = scan.nextInt();
        if (istek == 1) {
            System.out.println("ismi giriniz");
            String b= scan.nextLine();
            String isim = scan.nextLine().toUpperCase();
for (Ogrenci a: ogrenciListesi){
            if (a.getAdSoyad().equals(isim)) {
                System.out.println(ogrenciListesi.get(ogrenciListesi.indexOf(isim)).ogrenciNo + "   " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(isim)).getAdSoyad() + "   " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(isim)).getSinif() + "     " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(isim)).getYas() + "    " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(isim)).getKimlikNo());
            } else System.out.println("okulumuzda böyle bir ogrenci yoktur!!");}
        } else if (istek == 2) {
            System.out.println("ogrenci nosunu giriniz");
            String c=scan.nextLine();
            String no = scan.nextLine();
            for(Ogrenci a : ogrenciListesi){
            if (a.getOgrenciNo().equals(no)) {
                System.out.println(ogrenciListesi.get(ogrenciListesi.indexOf(no)).ogrenciNo + "   " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(no)).getAdSoyad() + "   " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(no)).getSinif() + "     " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(no)).getYas() + "    " +
                        ogrenciListesi.get(ogrenciListesi.indexOf(no)).getKimlikNo());

            }else System.out.println("okulumuzda böyle bir ogrenci yoktur!!");
        }}else System.out.println("böyle bir aramamız yoktur !!");
        ara();
    }
    private static void listele() {
        if(kisiTuru.equals("OGRENCI")){
            for (Ogrenci a : ogrenciListesi){
                System.out.println(a.getOgrenciNo()+" "+a.getAdSoyad()+"  "+a.getKimlikNo()+"  "+a.getSinif()+"  "+a.getYas());

            }

        }else{
            for (Ogretmen a:ogretmenListesi){
                System.out.println(a.getSicilNo()+" "+a.getAdSoyad()+"  "+a.getKimlikNo()+"  "+a.getBolum()+"  "+a.getYas());


            }
        }

        }


    private static void ekle() {
        System.out.println("     ******  "+kisiTuru+" ekleme sayfası    ***** ");
        System.out.println("ad soyad giriniz");
        String a=scan.nextLine();
        String adSoyad=scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kimlikNo=scan.nextLine();
        System.out.println("yas giriniz");
        int yas=scan.nextInt();
        if(kisiTuru.equals("OGRENCI")){
            ++sayac;
            String ogrncNo=sayac+"";
            System.out.println("sınıf giriniz");
            String sinif=scan.next();

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,ogrncNo,sinif);
            ogrenciListesi.add(ogrenci);
        }else{
            System.out.println("sicil no giriniz");
            String sicilNo=scan.next();
            System.out.println("bolum giriniz");
            String bolum=scan.next();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogretmenListesi.add(ogretmen);
        }

    }

}
