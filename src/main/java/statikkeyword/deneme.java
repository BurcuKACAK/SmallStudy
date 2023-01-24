package statikkeyword;

public class deneme {
    /*
   soru2)assagidaki classlar calistirildiginda ne olur inceleyelim
    */
    int x;
    static int y;
    deneme(int i){
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        new deneme(2);
        deneme dnm=new deneme(3);
        System.out.println(dnm.x+","+dnm.y);



    }
}
