package com.songcf.hellojava;

import com.songcf.base.Init;

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


        // init
        System.out.println("=============================================");
        System.out.println("initialize test");
        System.out.println("=============================================");
        Init.test();




        System.out.println("End!");
    }
}
