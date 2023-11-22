package com.firstapp.degiskenler;

import java.util.Scanner;

public class TekCiftDongu {
    public static void main( String Args[] ){
        Scanner tarayici = new Scanner(System.in);

        while (true)
        {
            System.out.println("Hello");

            System.out.println("Bir sayı giriniz: ");
            int sayi = tarayici.nextInt();

            if ( sayi%2 == 0)
            {
                System.out.println("Girilen sayı çifttir.");
            } else if (sayi%2 == 1) {
                System.out.println("Girilen sayı tektir.");
            }

            System.out.println("Çıkış için (1), devam etmek için diğer sayılar...");
            int tercih = tarayici.nextInt();
            
            if ( tercih == 1 )
            {
                System.out.println("Çıkış yapıldı.1");
                break;
            }


        }
    }
}
