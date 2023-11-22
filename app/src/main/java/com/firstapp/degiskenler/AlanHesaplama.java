package com.firstapp.degiskenler;

import java.util.Scanner;

public class AlanHesaplama {
    public static void main( String Args[] ){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Alan hesabına hoş geldiniz...");
        System.out.println("(1) Dikdörtgen Alanı");
        System.out.println("(2) Daire Alanı");

        int tercih = tarayici.nextInt();

        if( tercih == 1 )
        {
            System.out.println("Kısa kenarı giriniz: ");
            int kisa = tarayici.nextInt();

            System.out.println("Uzun kenarı giriniz: ");
            int uzun = tarayici.nextInt();

            System.out.println("Sonuç: " + (kisa * uzun));
        }

        if( tercih == 2 )
        {
            System.out.println("YArı çapını giriniz: ");
            int yariCap = tarayici.nextInt();

            System.out.println("Sonuç: "+ (3.14*yariCap*yariCap));
        }
    }
}
