package com.payload.j4p;

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Double far, cel;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter temp in far.");
        far = in.nextDouble();

        cel = (far - 32) * 5.0/9.0;
        System.out.println("The temperature in Cel is :" + cel);

    }


}

