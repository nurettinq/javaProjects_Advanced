package proje_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KursiyerMain {
    public static void main(String[] args) {
        KursiyerKayitt yeniKayit=new KursiyerKayitt();
        List<Kursiyer>kisi=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        boolean cikilsinmi=false;
        while(!cikilsinmi){
            System.out.println("işleminizi seçiniz :\n1-KrsiyerKayıt" +
                    "\n2-Kursiyer listele\n3-kursiyer ücretleri" +
                    "\n4-ücretsiz kişiler\n5-cikiş");
            int islem= scan.nextInt();
            switch (islem){
                case 1:
                    kisi=yeniKayit.kayitYap();break;
                case 2:
                    yeniKayit.listeYap(kisi);break;
                    case 3:
                        yeniKayit.kursUcretiListesi(kisi);break;
                case 4:
                    yeniKayit.ucretsizKursiyerler(kisi);break;
                    case 5:
                        cikilsinmi=true;break;
                default:
                    System.out.println("hatalı giriş yaptınız");
            }
        }
    }
}
