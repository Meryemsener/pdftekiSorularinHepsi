package n02ScannerClass;

import java.util.Scanner;

public class n09 {
    public static void main(String[] args) {
        /*
         * kullanicinin ad soyad yas boy kilosunu  yazdiriniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("adinizi yazin");
        String isim=scanner.next();
        System.out.println("Soyadinizi yazin");
        String soyisim=scanner.next();
        System.out.println("yasinizi yazin");
        int yas= scanner.nextInt();
        System.out.println("boyunuzu yazin");
        int boy=scanner.nextInt();
        System.out.println("kilonuzu yazin");
        double kilo=scanner.nextDouble();
        System.out.println("adiniz : "+isim+"\n"+"soyadiniz : "+soyisim+"\n"+"yasiniz : "+yas+"\n"+"boyunuz : "+boy+"\n"+"kilonuz : "+kilo+"\n");
    }

}
