package com.songcf.generic;

import com.songcf.sometype.Printer;

import java.util.HashMap;
import java.util.Map;

public class Method extends Class {
    public <T> void genericMethod(T t) {
        Printer.println(Method.class.getName() + ": generic Method genericMethod, t="+t.getClass().getName());
    }

    //返回值会做类型推到
    public static <K,V> Map<K,V> newMap() {
        return new HashMap<K,V>();
    }

    public static <K,V> void genericStaticMethod(K k, V v) {
        Printer.printf("%s: generic Method genericStaticMethod, k[%s]=%s, v[%s]=%s\n",
                Method.class.getName(),k.getClass().getName(), k, v.getClass().getName(), v);
    }
}
