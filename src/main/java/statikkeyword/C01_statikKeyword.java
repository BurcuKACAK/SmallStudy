package statikkeyword;

public class C01_statikKeyword {
    /*
   soru 1)bir static birde non-static(instance) variable olusturun
   ve arasindaki farklari inceleyin
    */
    static int sayi=21;
    int rakam=5;

    public static void main(String[] args) {
        System.out.println(sayi);
        C01_statikKeyword obj1=new C01_statikKeyword();
        System.out.println(obj1.rakam);//5
        System.out.println(obj1.sayi);//21
        obj1.rakam++;
        sayi++;
        System.out.println(obj1.rakam);//6
        System.out.println(obj1.sayi);//22
        C01_statikKeyword obj2=new C01_statikKeyword();
        System.out.println(obj2.rakam);//5
        System.out.println(obj2.sayi);//22



    }

}
