package com.firstapp.degiskenler;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerKonsolGirdi {
    public static void main( String Args[]){
        Scanner tarayici = new Scanner(System.in);

        int [] sayilar = new int[5];

        for ( int i = 0; i < sayilar.length; i++ )
        {
            System.out.println(i + 1 + ". Bir Sayı giriniz: ");
            int sayi = tarayici.nextInt();

            sayilar[i] = sayi;
        }

        Arrays.sort(sayilar);

        for (int k:sayilar)
        {
            System.out.println("Girilen sayılar:" + k);
        }

    }
}
