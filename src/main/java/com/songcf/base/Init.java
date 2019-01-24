package com.songcf.base;

class ObjA {
    ObjA(String name) {
        System.out.println(name +" constructor");
    }
}

public class Init {

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

    Init() {
        System.out.println("Init constructor");
    }

    public static void test() {
        new Init();
    }
}
