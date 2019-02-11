package com.songcf.sometype;

public class Exit {
    public static void panic(String info) {
        Printer.println("=======================================");
        Printer.println("=================PANIC!================");
        if (!info.isEmpty()) {
            Printer.println(info);
        }
        Printer.println("=======================================");
        System.exit(-1);
    }

    public static void panic() {
        panic("");
    }
}
