package n02ScannerClass;

import java.util.Scanner;

public class n01 {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

    }
}
