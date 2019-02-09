package com.songcf.test;

public abstract class TTest {
    TestInfo mInfo;
    public TTest(String info) {
        mInfo = new TestInfo(info);
    }
    public abstract void test();
}

class TestInfo {
    public TestInfo(String info) {
        System.out.println("\n<<TEST>> " + info + " begin...");
    }
}