package com.songcf.string;

import com.songcf.test.TTest;

public class TString extends TTest {
    public TString() {
        super(TString.class.getName());
    }
    public void test() {
        this.testStringBuilder();
        this.testPrint();
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

    protected void testPrint() {
        System.out.println("---testPrint");
        Integer i = 10;
        String s = "string";
        //println
        System.out.println("i:" + i + ", s:" + s);
        //printf, format
        System.out.printf("i:%d, s:%s", i, s);
        System.out.format("i:%d, s:%s", i, s);
    }
}
