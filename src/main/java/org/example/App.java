import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int deger = 0 ;
        while(deger==0) {
            System.out.println("Cümleyi tersten yazmak için 1'e,");
            System.out.println("Yıldızlarla şekil için 2'ye,");
            System.out.println("Substring almak için 3'e,");
            System.out.println("Tek sayıları toplamak için 4'e,");
            System.out.println("Çift sayıları toplamak 5'e,");
            System.out.println("Çıkmak için 6'ya basın");
            int girilenDeger = in.nextInt();
            if(girilenDeger==1) {
                terstenYaz();
            }
            else if(girilenDeger==2) {
                yıldızCiz();
            }
            else if(girilenDeger==3) {
                substringAl();
            }
            else if(girilenDeger==4) {
                tekSayiTopla();
            }
            else if(girilenDeger==5) {
                ciftSayiTopla();
            }
            else if(girilenDeger==6) {
                deger=1;
                System.out.println("İyi günler.");
            }
            else System.out.println("Hatalı giriş yaptınız, tekrar deneyin!");
        }
    }

    public static void terstenYaz(){
        Scanner in = new Scanner(System.in);
        System.out.println("Yazıyı girin.");
        String girilenDeger=in.nextLine();
        for (int i =girilenDeger.length()-1; i >=0; i--) {
            System.out.print(girilenDeger.charAt(i));
        }
        System.out.println();
    }

    public static void yıldızCiz(){
        Scanner in=new Scanner(System.in);
        System.out.println("Yıldız sayısını girin.");
        int girilenDeger=in.nextInt();
        for (int i = 0; i <girilenDeger-1 ; i++) {
            if (i==0) {
                for (int j = 0; j < girilenDeger; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("*");
        }
    }

    public static void substringAl(){
        Scanner in = new Scanner(System.in);
        System.out.println("Yazıyı girin.");
        String girilenDeger=in.nextLine();
        System.out.println("Aralığı alınacak 2 indisi girin.");
        int ilkIndis=in.nextInt();
        int ikinciIndıs=in.nextInt();
        System.out.println(girilenDeger.substring(ilkIndis,ikinciIndıs));
    }

    public static void tekSayiTopla(){
        Scanner in = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        int sayi=in.nextInt();
        int tektoplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (i%2==0)
                continue;
            tektoplam+=i;
        }
        System.out.println("Kendinden önceki tek sayıların toplamı: "+tektoplam);
    }

    public static void ciftSayiTopla(){
        Scanner in = new Scanner(System.in);
        System.out.println("Sayıyı giriniz.");
        int sayi=in.nextInt();
        int cifttoplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (i%2==1)
                continue;
            cifttoplam+=i;
        }
        System.out.println("Kendinden önceki çift sayıların toplamı: "+cifttoplam);
    }
}