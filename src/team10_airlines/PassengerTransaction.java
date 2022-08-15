package team10_airlines;

import java.util.Arrays;
import java.util.List;

public class PassengerTransaction{
    public static void main(String[] args) {
        Passenger pass = new Passenger("nurettin", 68, "D", "GD");
        double biletUcret=hesap(pass.getAge(), pass.getCity(), pass.getTicketType() );
        System.out.println("biletUcret = " + biletUcret);
        System.out.println(pass);
        System.out.println("\n****team10_airlines****");
    }
    public static double hesap( int age,String city,String ticketType){
        List<String> destination= Arrays.asList("B","C","D");
        int[] fiyatlar = {50, 70, 90};
        double price = 0;
        for (int i =0; i < destination.size(); i++) {
                if (city.equals(destination.get(i))) {
                    if (age < 12) {
                        price = fiyatlar[i] * 0.5;
                        System.out.println("yaş indirimi yapılmştır");
                    } else if (age >= 12 && age <= 24) {
                        price = fiyatlar[i] * 0.8;
                        System.out.println("yaş indirimi yapılmştır");
                    } else if (age >= 65) {
                        price = fiyatlar[i] * 0.7;
                        System.out.println("yaş indirimi yapılmştır");
                    } else {
                        price = fiyatlar[i];
                    }}}
        if (ticketType.equalsIgnoreCase("GD")) {
            price = price *2* 0.8;
            System.out.println("gidiş dönüş indirimi yapılmıştır");
        }else if(age>24&&age<65){
            System.out.println("indirimsiz yolcu");}
    return price;}}