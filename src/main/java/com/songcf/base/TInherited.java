package com.songcf.base;


import com.songcf.exception.*;

public class TInherited {
    public static void test() {
        Base b1 = new BaseChild1();
        Base b2 = new BaseChild1("b2");
    }
}


class Base {
    protected String baseStr1;
    Base() {
        baseStr1 = "default";
        System.out.println("Base constructor1 "+baseStr1);
    }
    Base(String arg) {
        baseStr1 = arg;
        System.out.println("Base constructor2 arg "+baseStr1);
    }

    public void test() {
        System.out.println("Base:test");
    }

    public void testThrow() throws SomeException {
        System.out.println("Base:testThrow");
        if (true) {
            throw new SomeException("Base:testThrow");
        } else {
            throw new RuntimeException("Base:testThrow");
        }
    }
}

class BaseChild1 extends  Base{
    BaseChild1() {
        System.out.println("BaseChild1 constructor1");
    }
    BaseChild1(String arg) {
        super(arg);
        System.out.println("BaseChild1 constructor2 arg");
    }

    public void test() {
        System.out.println("BaseChild1:test");
    }

    public void testThrow() throws SomeException { //子类的throw必须是父类throw的子集
        System.out.println("BaseChild1:testThrow");
        throw new SomeException("BaseChild1:testThrow");
    }
}

abstract class Abs1 {

}

interface Interface1 {

}