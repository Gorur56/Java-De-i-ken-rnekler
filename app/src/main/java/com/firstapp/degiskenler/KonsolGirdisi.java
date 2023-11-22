package com.firstapp.degiskenler;

import java.util.Scanner;

public class KonsolGirdisi {
    public static void main( String args[]){
        System.out.println("Lütfen bir sayı giriniz...");

        Scanner tarayici = new Scanner(System.in); // kullanıcıdan veri alma
        int gelenDeger = tarayici.nextInt();

        System.out.println("sonuc: "+ gelenDeger);

        //String45
        System.out.print("Lütfen adınızı griniz: ");

        String gelenAd = tarayici.next();
        System.out.println("Sonuç: "+gelenAd);

        System.out.print("Boyunuzu giriniz: ");
        double gelenBoy = tarayici.nextDouble();
        System.out.println("Boy: "+ gelenBoy);

        System.out.print("Evli misiniz? ");
        boolean gelenSonuc = tarayici.hasNextBoolean();
        System.out.println("Evli mi: "+ gelenSonuc);


    }
}
