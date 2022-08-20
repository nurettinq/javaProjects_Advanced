package deneme;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class DosyaOku {
    public static void main(String[] args) throws FileNotFoundException {
        String file="src\\deneme\\courses.csv";
        BufferedReader reader =null;
        String line="";
        Map<String, String>derskod= new HashMap<String, String>();
        List<String> dersKo=new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(file));
            while((line=reader.readLine()) != null){
                String [] row=line.split(",");

                    derskod.put(row[0], row[1]);
                    dersKo.add(row[0]);
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
        //System.out.println(derskod.keySet());
       // System.out.println(derskod.values());

        String file2="src\\deneme\\studentCourse.csv";
        BufferedReader reader2 =null;
        String line2="";
        Map<String, Ogrenci4>ogrenciDers= new HashMap<String, Ogrenci4>();

        try {
            reader2 = new BufferedReader(new FileReader(file2));
            while((line2=reader2.readLine()) != null){
                String [] rows=line2.split(",");
                Ogrenci4 ogrenci4 = new Ogrenci4(rows[1], rows[2]);

                ogrenciDers.put(rows[0], ogrenci4);

            }
           // System.out.println();


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
        System.out.println(ogrenciDers.size());
      //  System.out.println(ogrenciDers.keySet());
        Map<String,List>deeee=new HashMap<>();
        List<String> ayniDers=new ArrayList<>();


        for (int i = 0; i <dersKo.size() ; i++) {
            int count=0;
            System.out.println(dersKo.get(i)+"sınava girecekler");
            ayniDers.removeAll(ayniDers);
        for(Map.Entry<String, Ogrenci4> entry:ogrenciDers.entrySet()){
            Ogrenci4 b=entry.getValue();

            if(b.ogrDers.equals(dersKo.get(i))){
                ayniDers.add(b.ogrenciAdSoyad);
            count++;
            }
           }
        deeee.put(""+count+dersKo.get(i),ayniDers);



        }  for(Map.Entry<String, List> ass:deeee.entrySet()){
            List b=ass.getValue();
            System.out.println(ass.getKey());
            System.out.println(b);
        }





            String file3="src\\deneme\\teachers.csv";
            BufferedReader reader3 =null;
            String line3="";
            Map<String, Ogrenci4>ders =new HashMap<String, Ogrenci4>();




     }


    }
