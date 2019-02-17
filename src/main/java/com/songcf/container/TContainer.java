package com.songcf.container;

import com.songcf.test.TTest;

public class TContainer extends TTest {
    public TContainer() {
        super(TContainer.class.getName());
    }

    public void test() {
        TCollection testCollection = new TCollection();
        testCollection.test();

        TMap testMap = new TMap();
        testMap.test();

        TContainerUtility testUtility = new TContainerUtility();
        testUtility.test();

        TIterator testIterator = new TIterator();
        testIterator.test();

        TComparator testComp = new TComparator();
        testComp.test();
    }
}
