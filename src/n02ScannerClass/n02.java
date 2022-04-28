package n02ScannerClass;

import java.util.Scanner;

public class n02 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip
        //yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("karenin bir kenarini giriniz");
        int a = scanner.nextInt();

        int alan = a * a;
        int cevre = a * 4;

        System.out.println(alan + "\n" + cevre);
    }
}
