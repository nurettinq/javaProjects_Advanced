package team10AirLines2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
public class Ucak {
    private String adiSoyadi, gidilecekYer, gidisDonus, fligtNum, gateNum;
    private int yas;
    private double kmucret = 0.10;
    private double ucret, mesafeUcreti, yasIndirimi, gidisDonusInd;
    public Ucak() {
    }
    public Ucak(String adiSoyadi, String gidilecekYer, String gidisDonus, int yas) {
        this.adiSoyadi = adiSoyadi;
        this.gidilecekYer = gidilecekYer;
        this.gidisDonus = gidisDonus;
        this.yas = yas;
        setGateNum(gidilecekYer);
        setFligtNum();
    }
    public double getUcret() {
        return ucret;
    }
    public double getMesafeUcreti() {
        switch (gidilecekYer) {
            case "B": mesafeUcreti = 500 * kmucret;break;
            case "C": mesafeUcreti = 700 * kmucret;break;
            case "D": mesafeUcreti = 900 * kmucret;break;
        }
        return mesafeUcreti;
    }
    public void setMesafeUcreti(double mesafeUcreti) {
        this.mesafeUcreti = mesafeUcreti;
    }
    public void setUcret(double ucret) {
        this.ucret = ucret;
    }
    public String getGidilecekYer() {
        return gidilecekYer;
    }
    public String getGidisDonus() {
        return gidisDonus;
    }
    public int getYas() {
        return yas;
    }
    public double getKmucret() {
        return kmucret;
    }
    public void setKmucret(double kmucret) {
        this.kmucret = kmucret;
    }
    public double getYasIndirimi() {
        return yasIndirimi;
    }
    public void setYasIndirimi(double yasIndirimi) {
        this.yasIndirimi = yasIndirimi;
    }
    public double getGidisDonusInd() {
        return gidisDonusInd;
    }
    public void setGidisDonusInd(double gidisDonusInd) {
        this.gidisDonusInd = gidisDonusInd;
    }
    public String getFligtNum() {
        return fligtNum;
    }
    public void setFligtNum() {
        this.fligtNum = "" + LocalDate.now().getYear()+ LocalTime.now().getHour();
    }
    public String getGateNum() {
        return gateNum;
    }
    public void setGateNum(String gateNum) {
        Random random = new Random();
        this.gateNum = ""+gidilecekYer+random.nextInt(10);
    }
    @Override
    public String toString() {
        return
                "\n**** 1. Grup Havaalanina Hosgeldiniz ****\n"+
                        "\nFlight No: " + getFligtNum() + "    Gate Number: " + getGateNum()+
                        "\n==================================="+
                        "\nislem Tarihi: "+ LocalDate.now()+
                        "\nFROM: A      Destination: " + getGidilecekYer()+
                        "\nYolcu Adi Soyadi: "+ adiSoyadi +
                        "\nYolcunun Yasi: " + yas +
                        "\nTek yon / Gidis Donus: " + gidisDonus +
                        "\nYas indiminiz: " + yasIndirimi+ " $'dir."+
                        "\nYon indiminiz: " + gidisDonusInd+ " $'dir."+
                        "\nindirim sonrasi odemeniz: " + ucret + " $'dir."+
                        "\n==================================="+
                        "\niyi yolculuklar dileriz\n";
    }
}