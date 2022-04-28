package n23InterviewQuestions;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String dogruPin="ebr.1234";
        int girisHakki=3;

        while(true){
            System.out.println("Pin giriniz : ");
            String girilenPin = scan.nextLine();
            if(dogruPin.equals(girilenPin)){
                System.out.println("Hosgeldiniz.");
                break;
            } else {
                System.out.println("Yanlis girdiniz.");
                girisHakki--;
                System.out.println("Kalan " + girisHakki + " kalmistir.");

            }
            if(girisHakki==0){
                System.out.println("Hakkiniz bitti. Blok old.");
                break;
            }
        }
    }
}
