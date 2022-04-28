package n02ScannerClass;

import java.util.Scanner;

public class n03 {
    public static void main(String[] args) {
        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("dairenin yaricapini giriniz");
        int r = scanner.nextInt();

        double cevre = (2 * 3.14 * r);
        double alan = 3.14 * r * r;

        System.out.println("cevre = " + cevre + "\n" + "alan = " + alan);

    }
}
