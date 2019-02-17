package com.songcf.container;

import com.songcf.sometype.Printer;

import java.util.*;


public class TCollection {
    public void test() {
        testCollection();
        testList();
        testSet();
        testQueue();
    }

    protected void testCollection() {
        Printer.printDesc("testList");
        Collection<Integer> iC1 = new ArrayList<>(Arrays.asList(1,2,3));
        Integer[] iL1 = {11,12,13};
        iC1.addAll(Arrays.asList(iL1));

        Collections.addAll(iC1, 21,22,23);
        Integer[] iL2 = {31,32,33};
        Collections.addAll(iC1, iL2);

        List<Integer> iL3 = Arrays.asList(41,42,43);
        iL3.set(1, 99);
    }

    protected void testList() {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new LinkedList<>();
    }

    protected void testSet() {
        Set<String> s1 = new TreeSet<>();
        Set<String> s2 = new HashSet<>();
        Set<String> s3 = new LinkedHashSet<>();
    }

    protected void testQueue() {
        Queue<String> q1 = new PriorityQueue<>();
        Queue<String> q2 = new LinkedList<>();
    }
}
