package com.payload.think;


public class methods {

    public static String printName(String name){
       String output = "Your name is :" + name;
        return output;
    }

    public static void main(String[] args) {
        String you = "njeknjak";
        String stat;
        stat = printName(you);
        System.out.println(stat);
    }
}
