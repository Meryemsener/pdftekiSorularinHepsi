package n02ScannerClass;

import java.util.Scanner;

public class n05 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

        Isminiz : Mehmet
        Soyisminiz : Bulut
        Kursumuza katiliminiz alinmistir,tesekkur ederiz*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz");
        String isim = scanner.next();
        String soyisim = scanner.next();

        System.out.println("Isminiz : " + isim + "\n" + "Soyisminiz : " + soyisim + "\n" + "Kursumuza katiliminiz alinmistir.");
    }
}
