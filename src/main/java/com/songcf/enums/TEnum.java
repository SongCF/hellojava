package com.songcf.enums;

import com.songcf.test.TTest;

public class TEnum extends TTest {
    public TEnum() {
        super(TEnum.class.getName());
    }

    public void test() {
        EnumDescribe desc = new EnumDescribe();
        desc.showEnumDescribe();
    }
}
