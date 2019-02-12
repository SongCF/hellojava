package com.songcf.generic;

import com.songcf.sometype.Printer;
import com.songcf.test.TTest;

import java.util.Map;

public class GenericTest extends TTest {
    public GenericTest() {
        super(GenericTest.class.getName());
    }

    public void test() {
        Printer.printDesc("接口/类泛型，方法泛型，静态方法泛型，编译器类型自动推导");

        Interface<String> itf = new Class<String>();
        itf.test("interface call test");

        Method m = new Method();
        m.test("method call test");
        m.genericMethod("method call genericMethod");

        Map<Integer,String> autoMap = Method.newMap(); //FIXME newMap编译器会自动做类型推倒
        autoMap.put(1, "a");
        autoMap.put(2, "b");
        Printer.println("auto type map:"+autoMap);

        Method.genericStaticMethod(1, "a");
        Method.<Integer, String>genericStaticMethod(2, "b");
    }
}
