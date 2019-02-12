package com.songcf.generic;

import com.songcf.sometype.Printer;

public class Class<T> implements Interface<T> {
    protected T mT;
    public void test(T t) {
        mT = t;
        Printer.println(this.getClass().getName()+" generic Class test: " + mT.getClass().getName());
    }
}
