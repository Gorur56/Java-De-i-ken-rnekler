package com.firstapp.degiskenler;

import java.util.Scanner;

public class SwitchCase {
    public static void main( String Args[]){
        //switch ile dört işlem
        Scanner tarayici = new Scanner(System.in);

        System.out.println("Tercih ediniz.");
        System.out.println("(1) Toplama");
        System.out.println("(2) Çıkarma");
        System.out.println("(3) Çarpma");
        System.out.println("(4) Bölme");

        int tercih = tarayici.nextInt();

        System.out.println("Birinci Sayıyı giriniz: ");
        int sayi1 = tarayici.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = tarayici.nextInt();

        switch (tercih){
            case 1:
                System.out.println("Sonuç: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç: "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç: "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sonuç: "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Böyle bir tercih yoktur!!! ");
        }

    }
}
