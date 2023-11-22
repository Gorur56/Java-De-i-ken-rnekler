package com.firstapp.degiskenler;

import java.util.Scanner;

public class SwitchToolBarMenu {
    public static void main( String Args[] ){
        Scanner tarayici = new Scanner(System.in);

        System.out.println("(1) Sil");
        System.out.println("(2) Güncelle");
        System.out.println("(1) Yedekle");

        int tercih = tarayici.nextInt();

        switch (tercih){
            case 1:
                System.out.println("Sistem Silindi.");
                break;
            case 2:
                System.out.println("Sistem Güncellendi.");
                break;
            case 3:
                System.out.println("Sistem Yedeklendi.");
                break;
            default:
                System.out.println("Tercih bulunamadı!!!");
        }
    }
}
