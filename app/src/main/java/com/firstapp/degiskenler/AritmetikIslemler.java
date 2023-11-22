package com.firstapp.degiskenler;

public class AritmetikIslemler {
    public static void main( String args[]){
        // Dairenin alanını hesaplayan algoritma

        double sonuc;
        double pi = 3.14;

        int yariCap = 2;

        sonuc = pi * yariCap * yariCap;

        System.out.println("Dairenin Alanı" + sonuc);

        //kuvvet hesaplayan algoritma

        int kuvvet;
        int kutle = 67;
        int ivme = 10;

        kuvvet = kutle * ivme;

        System.out.println("Kuvvet: " + kuvvet);

    }
}
