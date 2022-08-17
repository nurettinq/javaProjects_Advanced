package deneme;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class DosyaOku extends Ogrenci {
    public static void main(String[] args) throws FileNotFoundException {
        String file="src\\deneme\\courses.csv";
        BufferedReader reader =null;
        String line="";
        Map<String, String>derskod= new HashMap<String, String>();
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line=reader.readLine()) != null){
                String [] row=line.split(",");

                    derskod.put(row[0], row[1]);
            }
                System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(derskod.keySet());
        System.out.println(derskod.values());

        String file2="src\\deneme\\studentCourse.csv";
        BufferedReader reader2 =null;
        String line2="";
        Map<String, Ogrenci>ogrenciDers= new HashMap<String, Ogrenci>();

        try {
            reader2 = new BufferedReader(new FileReader(file2));
            while((line2=reader2.readLine()) != null){
                String [] rows=line2.split(",");


                ogrenciDers.put(rows[0], new Ogrenci(rows[1], rows[2]));
            }
            System.out.println();


        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try{
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ogrenciDers.keySet());
        System.out.println(ogrenciDers.values());
    }
}
