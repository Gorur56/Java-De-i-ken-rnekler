package com.firstapp.degiskenler;

public class DegiskenKapsami {

    int sayi = 256; //Global bir değişkendir.
                    // Bu class içindeki static olanlar hariç tüm fonksiyonlar erişebilir.
                    // Static erişmemesinin nedeni statik tanımlanmamasıdır.
    public static void main( String args[]){
        // sayi 'yı burada çağıramayız.
    }

    public void method1(){
        //Burada sayi 'yi çağırabiliriz.
        String yazi = "Metin"; // Local değişkendir. Sadece bu kapsamda kullanılabiliir.
    }

    public void  method2(){

    }
}
