package com.songcf.string;

import com.songcf.test.TTest;

public class TString extends TTest {
    public TString() {
        super(TString.class.getName());
    }
    public void test() {
        this.testStringBuilder();
    }

    protected void testStringBuilder() {
        System.out.println("---testStringBuilder");
        StringBuilder b = new StringBuilder();
        b.append(1);
        b.append("+");
        b.append("\'2\'");
        b.append("=");
        b.append(1+'2');
        System.out.println(b.toString());
    }
}
