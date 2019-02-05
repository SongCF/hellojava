package com.songcf.container;

import java.util.*;


public class TCollection {
    public static void test () {
        Collection<Integer> iC1 = new ArrayList<>(Arrays.asList(1,2,3));
        Integer[] iL1 = {11,12,13};
        iC1.addAll(Arrays.asList(iL1));

        Collections.addAll(iC1, 21,22,23);
        Integer[] iL2 = {31,32,33};
        Collections.addAll(iC1, iL2);

        List<Integer> iL3 = Arrays.asList(41,42,43);
        iL3.set(1, 99);
    }
}
