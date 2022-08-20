package ooop;

public class Apartman extends Konut2 implements Deposito,Asansor{
        protected boolean görevli;

    public Apartman(String adres,boolean görevli, String sehir, String katSayisi, int aylikKira) {
        super(adres, sehir, katSayisi, aylikKira);
        this.görevli = görevli;
    }

    @Override
    public int depozito(int kira) {
        return kira*2;
    }


    @Override
    public boolean AsansorVarMi() {
        return false;
    }
}

