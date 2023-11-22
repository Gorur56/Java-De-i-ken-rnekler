package com.firstapp.degiskenler;

import java.util.Arrays;

public class Diziler {
    public static void main( String Args[]){
        int plakalar [] = new int [5];

        plakalar[0] = 1;
        plakalar[1] = 12;
        plakalar[2] = 47;
        plakalar[3] = 34;
        plakalar[4] = 56;

        System.out.println(Arrays.toString(plakalar));

        String meyveler [] = {"elma", "armut", "çilek", "portakal"};

        System.out.println(Arrays.toString(meyveler));
        System.out.println(meyveler[2]);

        meyveler[1] = "Mandalina";

        System.out.println(Arrays.toString(meyveler));

        double boy [] = {1.26,1.70,1.90,1.68 };

        System.out.println(Arrays.toString(boy));

    }
}
