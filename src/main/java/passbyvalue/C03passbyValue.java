package passbyvalue;

public class C03passbyValue {
    public static void main(String[] args) {
        /*

         */
        int [] b={2,5};
        sayiyiDegistir(b);
        System.out.println(b[0]);



    }

    public static void sayiyiDegistir(int[] a) {
        a[0]=7;

    }

}
