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
        try { //FIXME 如果这里没有捕获，那么tryCatch函数也需要异常声明
            this.throwException();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        try {
            this.throwRuntimeException();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }finally {
            System.out.println("test finally 1");
        }

        //FIXME not supported no catch
//        try {
//            this.throwException();
//        } finally {
//            System.out.println("test finally last exception");
//        }

        try {
            return;
        }catch (Exception e) {
            e.printStackTrace(System.out);
        } finally { //FIXME finally -- 无论try中是否抛出异常都会执行，即使return也会执行。
            System.out.println("exec finally by try return!");
        }

        System.out.println("前面return了，这里不会打印");

    }

    protected void throwException() throws SomeException {
        throw new SomeException("test SomeException");
    }

    protected void throwRuntimeException() /* throws SomeRuntimeException */ { //FIXME RuntimeException 可以不用申明
        throw new RuntimeException();
    }
}
