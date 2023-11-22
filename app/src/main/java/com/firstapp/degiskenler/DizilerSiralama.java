package com.firstapp.degiskenler;

import java.util.Arrays;

public class DizilerSiralama {
    public static void main( String Args[]){
        String isimler[] = {"zeynep","Ayşe", "Zeki", "Mehmet", "Sevim", "Yücel"};

        for( String s:isimler)
        {
            System.out.println("İsimler: "+ s);
        }

        Arrays.sort(isimler); //A 'dan Z 'ye doğru sıralar.

        for (String isim:isimler)
        {
            System.out.println("İsim: "+ isim);
        }

        int sayılar[] = {15,60,40,25,70,35};

        Arrays.sort(sayılar); //küçükten büyüğe doüru sıralar.

        for (int sayi:sayılar)
        {
            System.out.println("sayi: "+ sayi);
        }
    }
}
