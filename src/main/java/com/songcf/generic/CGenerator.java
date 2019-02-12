package com.songcf.generic;


interface Generator<T> {
    T next();
}


public class CGenerator<T> implements Generator<T> {
    private java.lang.Class<T> type;
    CGenerator(java.lang.Class<T> t) {
        this.type = t;
    }

    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(java.lang.Class<T> type) {
        return new CGenerator<>(type);
    }
}
