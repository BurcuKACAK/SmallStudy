package nestedloop;

public class NestedLoop04 {
    public static void main(String[] args) {
// soru 6 Asagidaki sekil cizen kodu yaziniz
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int input=6;
        for (int i = 1; i <input ; i++) {       //dis loop == outerloop
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }   //ic loop == inner

            System.out.println();

        }for (int i = 1; i <input ; i++) {       //dis loop == outerloop
            for (int j = 1; j <= input-i ;j++) {
                System.out.print("*" + " ");
            }   //ic loop == inner

            System.out.println("");


        }
    }
}
