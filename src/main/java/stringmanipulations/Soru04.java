package stringmanipulations;

public class Soru04 {
    public static void main(String[] args) {
        /*soru 4)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
karakter sayısının toplamını yazdırınız.
*/

        String isim1 = "Ahmet Furkan";
        String isim2= "Omer Faruk";
        String isim3 = "Ayse Nur";

        int a1 = isim1.replaceAll("\\s" , "").length();
        int a2 = isim2.replaceAll("\\s" , "").length();
        int a3 = isim3.replaceAll("\\s" , "").length();

        System.out.println("Toplam Bosluksuz Karakter Sayisi Toplami ="+(a1+a2+a3));
    }
}
