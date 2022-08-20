package ooop;

public class Main {
    public static void main(String[] args) {
        Apartman dairem=new Apartman("evren mah",true,"istanbul","4",5500);
        System.out.println(dairem);
        System.out.println(dairem.depozito(5500));
        Konut2 dairem2=new Apartman("sevren mah",true,"ankara","3",5600);
        System.out.println(dairem2);
        Residans resid=new Kats("nehir mah.",true,"gumushane","5",18800);
        System.out.println(resid);
        Deposito inter=new Kats("ersehir mah.",true,"cangumushane","4",16800);
        System.out.println(inter);

    }
}
