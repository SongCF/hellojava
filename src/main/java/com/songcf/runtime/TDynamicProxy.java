package com.songcf.runtime;

import com.songcf.sometype.Printer;
import com.songcf.sometype.Shape;
import com.songcf.sometype.ShapeCircle;
import com.songcf.test.TTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TDynamicProxy extends TTest {
    public TDynamicProxy() {
        super(TDynamicProxy.class.getName());
    }

    public void test() {
        Shape circle = new ShapeCircle();
        consumer(circle);

        //动态代理，不用每个要代理的接口都去实现一次
        Shape proxy = (Shape) Proxy.newProxyInstance(
                Shape.class.getClassLoader(),
                new Class<?>[] {Shape.class}, //Shape.class.getInterfaces(), TODO 为什么这个不行？
                new DynamicProxyHandler(circle));
        consumer(proxy);
    }

    protected void consumer(Shape s) {
        Printer.printMethodBegin("consumer");
        s.name();
        s.draw();

        //FIXME 凡是可以使用多态的地方都应该使用多态，只有在必要时才使用RTTI或switch。
        if (s instanceof ShapeCircle) {
            ((ShapeCircle)s).shapeCircle();
        }
    }
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        Printer.println(proxy.getClass().getName());
        Printer.println(proxied.getClass().getName());
        return method.invoke(proxied, args);
    }
}