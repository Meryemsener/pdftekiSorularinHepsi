package n02ScannerClass;

import java.util.Scanner;

public class n07 {
    public static void main(String[] args) {
       //Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("isminizi yazin");
        char ch = scanner.next().charAt(0);
        System.out.println(ch);
    }
}
