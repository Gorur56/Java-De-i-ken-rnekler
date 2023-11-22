package com.firstapp.degiskenler;

import java.util.Scanner;

public class DizilerKarneUygulaması {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        String [] dersler = new String[3];

        int notlar [] = new int[3];


        for (int i = 0;i<dersler.length; i++)
        {
            System.out.println((i+1) + ". dersi giriniz: ");
            String ders = tarayici.next();

            dersler[i] = ders;

            System.out.println((i+1) + ". notu giriniz: ");
            int not = tarayici.nextInt();

            notlar[i] = not;
        }

        double toplam = 0;


        for (int k = 0; k < notlar.length; k++)
        {
            System.out.println(dersler[k] + ": " + notlar[k]);
            toplam = toplam + notlar[k];
        }

        double ortalama = toplam/notlar.length;

        System.out.println("Ortalama: " + ortalama);

        if( ortalama >= 60 )
        {
            System.out.println("Geçtiniz.Tebrikler");
        }
        else if ( ortalama < 60)
        {
            System.out.println("Kaldınız...");

        }
    }
}
