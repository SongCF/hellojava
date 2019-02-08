package com.songcf.base;


import com.songcf.exception.*;

public class TInherited {
    public static void test() {

        //
        Base b1 = new BaseChild1();
        Base b2 = new BaseChild1("b2");
        (new Base()).test();
        b1.test();

        //
        Abs a1 = new AbsChild1();
        a1.test();
        a1.test(1);
        a1.test("I am Cheff");
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

class BaseChild1 extends Base {
    BaseChild1() {
        System.out.println("BaseChild1 constructor1");
    }
    BaseChild1(String arg) {
        super(arg); //如果没有调用，将会调用默认的父类构造器
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

abstract class Abs {
    abstract public void test();
    public void test(Integer i) {
        System.out.println("Abs:test Integer arg " + i);
    }
    public void test(String str) {
        System.out.println("Abs:test String arg " + str);
    }
}

class AbsChild1 extends Abs{
    public void test() {
        System.out.println("AbsChild1:test");
    }
    public void test(Integer i) {
        System.out.println("AbsChild1:test Integer arg " + i);
    }
}

interface Interface1 {

}