package com.songcf.hellojava;

import com.songcf.annotation.TAnnotation;
import com.songcf.base.TInherited;
import com.songcf.base.TInit;
import com.songcf.container.TCollection;
import com.songcf.container.TContainer;
import com.songcf.enums.TEnum;
import com.songcf.exception.TException;
import com.songcf.generic.TGeneric;
import com.songcf.runtime.TDynamicProxy;
import com.songcf.runtime.TReflect;
import com.songcf.runtime.TType;
import com.songcf.string.TString;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        doTest();
    }

    public static void doTest() {
        System.out.println(new Date());
        System.out.println( "Hello World!" );
        //System.getProperties().list(System.out);
        System.out.println("username: "+ System.getProperty("user.name"));
        //System.out.println(System.getProperty("java.library.path"));


        System.out.println("\n=============================================");
        System.out.println("test begin...");
        System.out.println("=============================================\n");

        // init
        TInit.test();
        //inherited
        TInherited.test();
        //container
        new TContainer().test();

        //exception
        TException.test();

        //string
        new TString().test();
        //RTTI
        new TType().test();
        new TReflect().test();
        new TDynamicProxy().test();
        //generic
        new TGeneric().test();
        //enum
        new TEnum().test();

        //annotation
        new TAnnotation().test();


        System.out.println("\ntest end!");
    }
}
