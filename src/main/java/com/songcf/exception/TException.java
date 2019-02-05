package com.songcf.exception;

/*
thinking in java
12.1概念
12.2基本异常
12.3捕获异常
...
 */

public class TException {

    public static void test() {
        System.out.println("\nTException begin...");
        TException exc = new TException();
        exc.tryCatch();
        System.out.println("TException end.");

    }

    protected void tryCatch() {
        try { //如果这里没有捕获，那么tryCatch函数也需要异常声明
            this.throwException();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            this.throwRuntimeException();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

    protected void throwException() throws SomeException {
        throw new SomeException("test SomeException");
    }

    protected void throwRuntimeException() /* throws SomeRuntimeException */ { //RuntimeException 可以不用申明
        throw new SomeRuntimeException();
    }
}


class SomeException extends Exception{
    SomeException(String desc) {
        super(desc);
    }

}

//runtime exception可以不用throws申明
class SomeRuntimeException extends RuntimeException {

}