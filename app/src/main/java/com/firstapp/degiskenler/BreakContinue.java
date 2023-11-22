package com.firstapp.degiskenler;

public class BreakContinue {
    public static void main( String Args[] ){
        for(int i = 0; i < 6; i++)
        {
            System.out.println("index: "+ i);

            if (i == 3)
            {
                break; // Döngüyü bitirir.
            }
        }

        System.out.println("\n");

        for(int i = 0; i < 6; i++)
        {
            System.out.println("index: "+ i);

            if (i == 3)
            {
                continue; // Döngüyü başa alır devam eder. 4 ve 5 te devam edecek.
                          // yani buraya girdiğinde aşağıdaki satırı çalıştırmayacak.
            }

            System.out.println("continue koşuluna girdi.");
        }
    }
}
