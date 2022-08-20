package sinavOturumm;

import javax.swing.*;
import java.io.IOException;

import static sinavOturumm.VeriAktarma.derslerVeKodlari;
import static sinavOturumm.VeriAktarma.ogrenciler;

public class Main {
    public static void main(String[] args) throws IOException {
       // JFrame frame = new JFrame("nurettin");
       // frame.setSize(1024,900);
       // frame.setLocationRelativeTo(null);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setVisible(true);
        //Transaction.dersBelirleme();
        System.out.println(Siniff.sinavSaatleri(derslerVeKodlari(),ogrenciler()));
    }
}
