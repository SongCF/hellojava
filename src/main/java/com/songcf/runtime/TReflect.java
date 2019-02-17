package com.songcf.runtime;

import com.songcf.sometype.Exit;
import com.songcf.sometype.HiddenObj;
import com.songcf.sometype.Printer;
import com.songcf.test.TTest;
import java.lang.reflect.Method;

public class TReflect extends TTest {
    public TReflect(){
        super(TReflect.class.getName());
    }
    public void test() {
        //
        showMethods("com.songcf.runtime.TReflect");
        
        //
        callHiddenMethod(HiddenObj.makeHiddenObj(), "privateMethod");
    }

    public void showMethods(String className) {
        Printer.printDesc("showMethods");
        try {
            Class<?> c = Class.forName(className);
            Method[] mL = c.getMethods();
            Printer.println(c.getName()+" methods:");
            for (Method m : mL) {
                Printer.println(m);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            Exit.panic();
        }
    }

    public static void callHiddenMethod(Object obj, String methodName) {
        Printer.printDesc("callHiddenMethod");
        try {
            Method m = obj.getClass().getDeclaredMethod(methodName);
            m.setAccessible(true);
            m.invoke(obj);
        } catch (Exception e) {
            Printer.println(e);
        }
    }
}
