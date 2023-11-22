package com.firstapp.degiskenler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main( String Args[] ){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");

        int tercih = tarayici.nextInt();

        if ( tercih > 4 )
        {
            System.out.println("Böyle bir seçim yoktur!!!");
            return;
        }

        System.out.println("Birinci Sayıyı giriniz: ");
        int sayi1 = tarayici.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = tarayici.nextInt();

        if ( tercih == 1 )
        {
            System.out.println("Sonuç: "+ (sayi1+sayi2));
        }
        else if ( tercih == 2 )
        {
            System.out.println("Sonuç: "+ (sayi1-sayi2));
        }
        else if ( tercih == 3 )
        {
            System.out.println("Sonuç: "+ (sayi1*sayi2));
        }
        else if ( tercih == 4 )
        {
            System.out.println("Sonuç: "+ (sayi1/sayi2));
        }

    }
}
