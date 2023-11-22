package com.firstapp.degiskenler;

public class TurDonusumu {
    public static void main( String Args[]){
        //explicit Dönüşüm

        double x = 67.48;
        long y = (long)x;
        int z = (int)y;

        System.out.println("double: "+ x);
        System.out.println("double to long: "+ y);
        System.out.println("Long to int: "+ z);

        //unexplicit Dönüşüm

        int a = 67;
        long b = a;
        double c = b;

        System.out.println("double: "+ a);
        System.out.println("double to long: "+ b);
        System.out.println("Long to int: "+ c);


        // Sayısal'dan String 'e Dönüşüm. 3 yöntem vardır. En sık kullanılanı valueof

        int sayi = 56;

        String yazi1 = String.valueOf(sayi); // String referans bir tip olduğu için
        String yazi2 = Integer.toString(sayi);
        String yazi3 = sayi + "";

        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);

        // String 'ten Sayısal Dönüşüm

        String metin = "78";

        int sayi1 = Integer.parseInt(metin);
        int sayi2 = Integer.valueOf(metin);

        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
