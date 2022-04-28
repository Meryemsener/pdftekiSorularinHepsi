package n02ScannerClass;

import java.util.Scanner;

public class n06 {
    public static void main(String[] args) {
       /*
       Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde

        yazdirin

        Isim – soyisim : Mehmet Bulutluoz
        */


         Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi ve soyisminizi yazin");
        String isim=scanner.next();
        String soyisim=scanner.next();
        System.out.println("Isim - soyisim : "+isim+" "+soyisim);
    }
}
