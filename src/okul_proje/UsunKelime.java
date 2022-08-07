package okul_proje;

import java.util.Scanner;

public class UsunKelime {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle= scan.nextLine();
        System.out.println("enUzunKelime(cumle) = " + enUzunKelime(cumle));

    }

    private static String enUzunKelime(String cumle) {
        String[] arr=cumle.split(" ");
        String max="";
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length()>max.length()){
            max=arr[i];
            }

        }

    return max;
    }
}
