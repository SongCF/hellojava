package com.songcf.generic;

import com.songcf.sometype.CountedObj;
import com.songcf.sometype.Printer;
import com.songcf.test.TTest;

import java.util.Map;

public class TGeneric extends TTest {
    public TGeneric() {
        super(TGeneric.class.getName());
    }

    public void test() {
        Printer.printDesc("接口/类泛型，方法泛型，静态方法泛型，编译器类型自动推导，泛型生成器");

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

        //generator
        Generator<CountedObj> gen = CGenerator.create(CountedObj.class);
        //the same as: Generator<CountedObj> gen = new CGenerator<>(CountedObj.class);
        for (int i=0;i<2;i++) {
            Printer.println(gen.next());
        }

    }
}
