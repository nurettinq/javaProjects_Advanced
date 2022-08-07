package java_question;

public class Q02_MDarray {
    public static void main(String[] args) {

          /*
    int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
    verilen Array icinde
    --> kac tane eleman oldugunu return eden methodu yazdiriniz //cevap : 13 donsun
    */
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
        elemanSayisi(arr);
        System.out.println("array "+ elemanSayisi(arr)+" elemanlidir");
    }
    private static int elemanSayisi(int[][] arr) {
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                count++;
            }
        }return count;
    }
}
