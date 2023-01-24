package statikkeyword;

import java.util.Scanner;

public class StaticBlock {
    static int sayi;

    public static void scanner(){
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int rakam= scan.nextInt();
        System.out.println(rakam);
    }


    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

        scanner();
    }

    static {
        sayi=5;
    }

        /*
        static block class uyelerinin tamamindan once calisir
        (main methoddan bile)
        static block'un konumu onemsiz
        class'in icinde birden fazla static block varsa yukardan aşşagıya dogru iner
        static blocklar genellikle classla ilgili on ayarlamalari yapmamizi saglar
        veya static variabla'lara deger atamak icin kullanilir
         */

}
