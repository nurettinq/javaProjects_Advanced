package oop;

public class Main {
    public static void main(String[] args) {
        Konut evim= new Konut("evren mah.", "istanbul", "34450", 5500) {


            @Override
            public void evinYası(int yas) {

            }
        };
        Apartman dairem=new Apartman("evren mah.","23/3","istanbul","34450",5500);
       Ev mustakil=new Ev("gunesli mah","istanbul","34600",6500);
        System.out.printf("$%,.2f\n",mustakil.depozito());
        System.out.println(mustakil);
        System.out.println(evim);
        System.out.printf("$%,.2f\n",mustakil.depozito());
        System.out.println(dairem);
    }

}
