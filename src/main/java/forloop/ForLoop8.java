package forloop;

public class ForLoop8 {
    public static void main(String[] args) {
        /*
        soru 8) Input olarak girilen bir stringi forLoop kullanarak ters cevirin.

         */
        String str = "Java gun gectikce guzellesiyor";
        String str1 = "";
        for (int i = str.length()-1; i >=0 ; i--) {

            str1+=str.substring(i,i+1);

        }
        System.out.println(str1);

    }
}
