package com.firstapp.degiskenler;

import java.util.Random;

public class HazirKomutlar {
    public static void main( String Args[]){
        int i = -5;

        //Math işelmler

        System.out.println("mutlak değer: "+ Math.abs(i));
        System.out.println("PI sayısı: "+ Math.PI);
        System.out.println("Üslü sayılar 2 üzeri 3: "+ Math.pow(2.0,3.0));
        System.out.println("Köklü sayılar 81: "+ Math.sqrt(81));


        //Random sayı üretme
        Random r = new Random();

        for (int k = 0; k < 5; k++)
        {
            int sayi = r.nextInt(10); // 0-9 arası random sayı üretir.
            System.out.println(sayi);
        }




    }
}
