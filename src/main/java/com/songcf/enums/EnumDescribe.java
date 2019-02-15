package com.songcf.enums;


import com.songcf.sometype.Printer;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum EnumDesc {
    ONE,
    TWO,
}

public class EnumDescribe {
    public void showEnumDescribe() {
        Printer.printDesc("枚举继承自Enum，values方法编译器自动添加");
        try {
            showDescribe(EnumDesc.class);
            showDescribe(Enum.class);

            Printer.println("");
            Printer.println("---javap EnumDesc:");
            Runtime rt = Runtime.getRuntime();
            rt.exec("javap EnumDesc");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    protected void showDescribe(Class<?> enumClass) {
        Printer.println("---showDescribe: " + enumClass.getName());
        Printer.println("interface:");
        for (Type t :enumClass.getGenericInterfaces()) {
            Printer.println(t);
        }
        Printer.println("base: " + enumClass.getSuperclass());
        Printer.println("method:");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
        }
        Printer.println(methods);
    }
}
