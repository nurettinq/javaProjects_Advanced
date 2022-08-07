package java_question;

import java.util.Scanner;

public class Q01_HackerDili {
    public static void main(String[] args) {
        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("cumleyi giriniz");
        String sentence=scan.nextLine();
        hackerLanguage(sentence);

    }

    private static void hackerLanguage(String sentence) {
        String []harf=new String[sentence.length()];
        for (int i = 0; i <harf.length ; i++) {
            harf[i] = sentence.substring(i,i+1);

            if(harf[i].contains("s")){
                harf[i]="5";
            }
            if(harf[i].contains("a")){
                harf[i]="4";}
            if(harf[i].contains("e")){
                harf[i]="3";
            }
            if(harf[i].contains("i")){
                harf[i]="1";
            }
            if(harf[i].contains("o")){
                harf[i]="0";
            }
            System.out.print(harf[i]);
        }

    }
}
