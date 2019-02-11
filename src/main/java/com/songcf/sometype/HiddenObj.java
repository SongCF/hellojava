package com.songcf.sometype;

public class HiddenObj {
    public static HiddenObj1 makeHiddenObj() {
        return new HiddenObj1();
    }
}

class HiddenObj1 {
    public void publicMethod() {
        Printer.println("HiddenObj1:publicMethod");
    }
    private void privateMethod() {
        Printer.println("HiddenObj1:privateMethod");
    }
}