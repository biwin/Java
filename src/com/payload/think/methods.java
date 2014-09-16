package com.payload.think;


public class methods {

    public static String printName(String name){
        return "Your name is :" + name;
    }

    public static void main(String[] args) {
        String you = "njeknjak";
        String stat;
        stat = printName(you);
        System.out.println(stat);
    }
}
