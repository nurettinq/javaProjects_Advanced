package sinavOturum;

import java.io.IOException;

import static sinavOturum.VeriAktarma.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Siniff.sinavSaatleri(derslerVeKodlari(),ogrenciler(),ogretmenler());

    }
}
