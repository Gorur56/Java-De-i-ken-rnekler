package com.firstapp.degiskenler;

public class PrimitifKopyalama {
    public static void main(String args[]){
        int sayi1 = 30;
        int sayi2 = sayi1; // Burada sayi1 'i sayi2 'ye kopyaladık.

        sayi1 = sayi1 + 5;

        sayi1++;

        System.out.println(sayi1);
    }
}
