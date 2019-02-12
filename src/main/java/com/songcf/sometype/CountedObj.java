package com.songcf.sometype;

public class CountedObj {
    private static long count = 0;
    private final long id = count++;
    public long id() {
        return id;
    }
    public String toString() {
        return CountedObj.class.getName()+":"+id;
    }
}
