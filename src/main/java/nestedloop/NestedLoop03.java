package nestedloop;

import java.util.Scanner;

public class NestedLoop03 {
    /*
    Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
         *
         * *
         * * *
         * * * *
         * * * * *

      // nested for loop ya diktorgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz end point belirleriz
           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz
     */

    public static void main(String[] args) {
   /*     int input=6;
        for (int i = 1; i <input ; i++) {       //dis loop == outerloop
            for (int j = 1; j <=i; j++) {
                System.out.print("*"+" ");
            }   //ic loop == inner

            System.out.println();

        }
        System.out.println("==================");
/*
        int input1=6;
        for (int i = 1; i <input1 ; i++) {       //dis loop == outerloop
            for (int j = 1; j <=input1 ; j++) {
                System.out.print("*"+" ");
            }   //ic loop == inner

            System.out.println();
        }

        /*Soru 4) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        1
        22
        333
        4444
        55555
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print(i+" ");
            }
            System.out.println();




    }
}}
