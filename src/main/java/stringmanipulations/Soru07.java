package stringmanipulations;

public class Soru07 {
    public static void main(String[] args) {
         /*
    soru7) girilen Stringdeki tum rakamları "*" ile degistirin
         */


            String str = "bu4a654k17654";
            str=str.replaceAll("\\d","*");
            System.out.println(str);
    }
}
