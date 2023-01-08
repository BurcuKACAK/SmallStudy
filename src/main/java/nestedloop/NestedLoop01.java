package nestedloop;

public class NestedLoop01 {
    public static void main(String[] args) {
        // asagdaki sekli nestedsiz loop ile yazdiran bir program yaziniz.
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        System.out.println("=========1. Yol . Nested Loopsuz");
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        for (int i = 1; i <=6 ; i++) {
            System.out.print("*"+ " ");
        }
        System.out.println();
        System.out.println("==========2===nested loop ile");

        for (int i = 1; i<=4 ; i++) {
            System.out.print("*"+" ");
            for (int j = 1; j <=5 ; j++) {

                System.out.print("*" + " ");
            }

            System.out.println();

        }
    
    
    
    }
}
