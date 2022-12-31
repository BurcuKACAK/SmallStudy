package forloop;

public class ForLoop3 {
    public static void main(String[] args) {
        //Soru 3) 100'e(dahil) kadar olan tek ve cift sayıları iki ayrı dongu ile yazdırın.

        for (int i = 0; i <100 ; i++) {
            if (i%2==10){
                System.out.print("Cift Sayilar = "+i+" ");
            }
        }
        System.out.println();
        for (int i = 0; i <100 ; i++) {
            if (i%2!=0){
                System.out.print("Tek Sayilar = "+i+" ");
            }

        }
    }
}
