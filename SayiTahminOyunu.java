package ProjectClass;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 0 ile 100 arasında rastgele bir sayı seç
        int rastgeleSayi = (int) (Math.random() * 101);
        System.out.println(rastgeleSayi);  // Bu satırı sadece testi kolaylaştırmak için ekledik, gerçek oyunda kaldırılabilir
        int[] tahminler = new int[5]; // Kullanıcı tahminlerini saklamak için dizi (bu satırı kodda kullanmıyoruz ama burada)
        int hak = 5; // Kullanıcının tahmin hakkı
        boolean isTrue = false; // Kullanıcının doğru tahmin yapıp yapmadığını kontrol etmek için

        // Oyun kuralları ve başlangıç mesajı
        System.out.println("SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ");
        System.out.println("********************************************************************");
        System.out.println("0-100 arasında random bir tam sayıyı tahmin etmeye çalışacaksınız");
        System.out.println("Random sayıyı tahmin etmek için 5 hakkınız olacak");
        System.out.println("*********************************************************************");
        System.out.println("Hadi başlayalım o zaman");

        // Kullanıcının tahmin yapmasını sağla, tahmin hakkı bitene kadar döngü devam et
        while (hak > 0 && !isTrue) {
            System.out.println("Lütfen bir sayı giriniz: ");
            int number = input.nextInt(); // Kullanıcının tahmin ettiği sayıyı al

            // Kullanıcının tahminini kontrol et
            if (number == rastgeleSayi) {
                System.out.println("Tebrikler " + (6 - hak) + ". hakkınızda bildiniz!");
                isTrue = true; // Doğru tahmin yapıldı, oyunu bitir

            } else if (number > rastgeleSayi) {
                System.out.println("Daha düşük bir sayı girin!"); // Tahmin çok yüksek

            } else {
                System.out.println("Daha büyük bir sayı girin!"); // Tahmin çok düşük
            }
            hak--; // Kalan tahmin hakkını bir azalt

            // Tahmin doğru değilse kalan hakkı göster
            if (!isTrue) {
                System.out.println("Kalan hakkınız: " + hak);
            }

        }

        // Oyun bitiminde kullanıcı tahmini doğru yapamadıysa doğru sayıyı göster
        if (!isTrue) {
            System.out.println("Malesef hakkınız kalmadı! Doğru sayı: " + rastgeleSayi);
        }

        // Scanner'ı kapat
        input.close();

    }
}
