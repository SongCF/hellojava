package com.songcf.hellojava;

import com.songcf.base.TInherited;
import com.songcf.base.TInit;
import com.songcf.container.TCollection;
import com.songcf.exception.TException;
import com.songcf.runtime.TProxy;
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
    public static void main( String[] args )
    {
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
        TCollection.test();

        //exception
        TException.test();

        //string
        new TString().test();
        //RTTI
        new TType().test();
        new TReflect().test();
        new TProxy().test();


        System.out.println("\ntest end!");
    }
}
