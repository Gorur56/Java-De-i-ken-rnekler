package com.firstapp.degiskenler;

public class DizilerDonguler {
    public static void main( String Args[]){
        String sehirler [] = {"Adana","istanbul","Bursa","Niğde"};

        for (int i = 0; i < sehirler.length; i++)
        {
            System.out.println("Şehirler: "+ sehirler[i]);
        }

        String isimler[] = {"Ayşe", "Mehmet", "Sevim", "Yücel"};

        for (String s:isimler) //foreach döngüsü
        {
            System.out.println("İsismler: "+ s);
        }

        int sayılar[] = {15,20,25,30,35};

        for(int sayi:sayılar)
        {
            System.out.println("Sayılar:"+sayi);
        }
    }
}
