package com.songcf.sometype;

public class Printer {
    public static void println(Object str) {
        System.out.println(str);
    }

    public static void printMethodBegin(String methodName) {
        println("------testMethod:"+methodName+"------");
    }
}
