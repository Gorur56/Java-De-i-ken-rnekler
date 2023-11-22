package com.firstapp.degiskenler;

public class Donguler {
    public static void main( String Args[] ){
        for ( int i = 0; i < 4; i++ ) //0-3 arası dönsün
        {
            System.out.println("index: "+ i);
        }

        System.out.println("\n");
        int a = 0;

        while (a < 4)
        {
            System.out.println("index: "+a);
            a++;
        }

        for(int k = 3; k < 7; k++)
        {
            System.out.println("k: "+ k);
        }

        for ( int z = 0; z < 9; z = z + 2)
        {
            System.out.println("z: "+ z);
        }

        int b = 0;

        while ( b < 9 )
        {
            System.out.println("b: "+ b);
            b = b + 2;
        }
    }
}
