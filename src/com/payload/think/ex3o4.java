package com.payload.think;

public class ex3o4 {

    public static void main(String[] args) {
        String day = "Saturday";
        String date = "September 16";
        int year = 2014;

        printAmerican(day,date,year);
        printEurooean(year,date,day);
    }

    public static void printAmerican(String s1, String s2, int i1){
        System.out.println(s1 + ", " + s2 + ", " + i1);
    }
    public static void printEurooean(int i1, String s1, String s2){
        System.out.println(i1 + ", " + s1 + ", " + s2);
    }
}
