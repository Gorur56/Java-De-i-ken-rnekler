package com.firstapp.degiskenler;

public class GenelKacisKarakteri {
    public static void main(String args[]){
        String yazi = "Mehmet \"80\" notunu aldı."; //içine çift tırnak yazmak istersek
        System.out.println(yazi);

        String dosyaYolu = "c:\\users\\masaüstü"; // Slash yapmak istersek iki slash koymak gerekiyor.
        System.out.println(dosyaYolu);

        String tab = "Merhaba \t nasılsın?"; // 8 karakter boşluk bırakır.
        System.out.println(tab);
    }
}
