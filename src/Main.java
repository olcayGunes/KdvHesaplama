import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat, kdvliFiyat, kdvTutari, kdv18=0.18, kdv8=0.08, uygulanacakKdvOrani;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Fiyatını Giriniz: ");
        fiyat = input.nextDouble();
        uygulanacakKdvOrani = fiyat>1000 ? kdv8 : kdv18;
        kdvTutari = fiyat*uygulanacakKdvOrani;
        kdvliFiyat = fiyat+kdvTutari;
        System.out.println("KDV Tutarı: "+kdvTutari);
        System.out.println("KDV'li Fiyat: "+kdvliFiyat);
    }
}
