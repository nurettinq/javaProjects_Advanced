package okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {

        System.out.println("hoşgeldiniz okulumuza");
        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        System.out.println("soyadınızı giriinz");
        String soyad=scan.nextLine();
        System.out.println("yaşınızı giriniz");
        int yas=scan.nextInt();
        System.out.println("branşınızı giriniz");
        String brans=scan.next();

        System.out.println("telefon numaranıozı giriniz");
        String tel=scan.next();
        //  scan.nextLine(); dummy hayalet komut
        OgretmenBilgiler adayOgretmen=new OgretmenBilgiler(isim,soyad,tel,brans,yas);
        List<OgretmenBilgiler> ogretmenlist=new ArrayList<OgretmenBilgiler>();
        ogretmenlist.add(adayOgretmen);
        System.out.println("ogretmenlist = " + ogretmenlist);
    }
}
