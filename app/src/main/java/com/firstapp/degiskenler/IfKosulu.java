package com.firstapp.degiskenler;

public class IfKosulu {
    public static void main(String Args[]){
        int yas = 17;
        String isim = "Ahmet";

        if( yas > 18 || isim == "ahmet"){ // Büyük küçük harf önemli bu yüzden false dönecek.
            System.out.println("Reşitsiniz...");
        }
        else{
            System.out.println("Reşit değilsiniz...");
        }

        if( isim.equals("Ahmet")){ // Büyük küçük harf önemli bu yüzden false dönecek.
            System.out.println("Merhaba Ahmet!!!");
        }
        else{
            System.out.println("Merhaba Mehmet!!!");
        }
    }
}
