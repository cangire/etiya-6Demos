public class Main {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayı3=2;

        int enBuyuk=sayi1;
        if(enBuyuk<sayi2)
        {enBuyuk=sayi2;
        }
        if (enBuyuk<sayı3){
            enBuyuk=sayı3;
        }
        System.out.println("En büyük = "+enBuyuk);

    }
}