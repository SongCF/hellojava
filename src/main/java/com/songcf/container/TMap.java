package com.songcf.container;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TMap {
    public void test() {
        testMap();
    }

    protected void testMap() {
        Map<String, Integer> m1 = new TreeMap<>();
        Map<String, Integer> m2 = new HashMap<>();
        Map<String, Integer> m3 = new LinkedHashMap<>();
    }
}
