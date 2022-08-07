package java_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_ArrayLisst {
    public static void main(String[] args) {
        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */
        int[]arr={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        sumConsecutive(arr);
        System.out.println(sumConsecutive2(arr));
    }

    private static ArrayList<Integer> sumConsecutive2(int[] arr) {
        List<Integer> aarl = new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7 ));
        ArrayList<Integer>sumreturn=new ArrayList<>();
        int count=0;
        int sumConsec=1;
        while(arr.length-sumConsec>=count){
            int toplam=0;
            for (int i = 0; i <=count ; i++) {
                toplam+=arr[sumConsec-1+i];


            }count++;
            sumreturn.add(toplam);
            sumConsec+=count;
        }


   return sumreturn;
    }
    private static void sumConsecutive(int[] arr) {
        int[]arr2=new int[(int)Math.pow((arr.length*2-1),0.5)];
        for (int i = 0; i < arr2.length ; i++) {
            for (int j = i*(i+1)/2; j <= i+ i*(i+1)/2 ; j++) {
                arr2[i]+=arr[j];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
