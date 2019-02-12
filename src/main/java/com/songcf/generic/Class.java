package com.songcf.generic;

import com.songcf.sometype.Printer;

public class Class<T> implements Interface<T> {
    public void test(T t) {
        Printer.println(this.getClass().getName()+" generic Class test: " + t.getClass().getName());
    }
}
