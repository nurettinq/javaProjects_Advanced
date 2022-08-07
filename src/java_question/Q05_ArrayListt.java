package java_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_ArrayListt {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int []input={61,53,54,48,55,64,49,78};
        List<Integer> list=new ArrayList<>(Arrays.asList(61,53,54,48,55,64,49,78));
        List maxSAyilar=new ArrayList<>();
        int n=3;

        for (int i = 0; i <n ; i++) {
            int max=list.get(0);
            for (int j = 0; j < list.size() ; j++) {
                if(max<list.get(j)){
                    max=list.get(j);
                }
            }
            maxSAyilar.add(max);
          list.remove(list.indexOf(max));
        }
        System.out.println("dizinin en buyuk "+n+" elemani "+maxSAyilar);

    }
}
