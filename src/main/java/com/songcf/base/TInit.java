package com.songcf.base;

class ObjA {
    protected int testProtected = 0; //同一包内的其他类可以访问
    ObjA(String name) {
        System.out.println(name +" constructor");
    }

    protected void SetValue(int a) {
        testProtected = a;
    }
}

public class TInit {
    public static void test () {
        System.out.println("\nInitOrder begin...");
        InitOrder.test();
        System.out.println("InitOrder end.");

        System.out.println("\nInitFinal begin...");
        InitFinal.test();
        System.out.println("InitFinal end.");
    }
}

// order
class InitOrder {

    //initialize order

    //直接初始化
    ObjA a1;
    ObjA a2 = new ObjA("a2-origin");
    static ObjA b1;
    static ObjA b2 = new ObjA("b2-origin");

    //块初始化
    {
        a1 = new ObjA("a1-block");
        a2 = new ObjA("a2-block");
    }

    //静态块
    static {
        b1 = new ObjA("b1-block");
        b2 = new ObjA("b2-block");
    }

    InitOrder() {
        System.out.println("Init constructor");
        System.out.println("test protected: " + a1.testProtected);
    }

    protected static void test() {
        new InitOrder();
    }
}

//final

class InitFinal{

    //final (可以在定义处、块、构造函数 3个地方初始化)
    final int I4 = 10;
    final int I1;
    static final int I2;
    final ObjA I3; //final对象只是指针不能变，对象的值可以变

    {
        I3 = new ObjA("final I3");
    }

    static {
        I2 = 2;
    }

    InitFinal() {
        I1 = 1;
    }

    protected static void test() {
        InitFinal obj = new InitFinal();
        System.out.println("final I0: "+obj.I4);
        System.out.println("final I1: "+obj.I1);
        System.out.println("final I2: "+obj.I2);
        System.out.println("final I3: "+obj.I3);
        obj.I3.SetValue(1);
    }
}
