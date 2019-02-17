package com.songcf.sometype;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {
    public static void println(Object str) {
        System.out.println(str);
    }
    public static void printf(String str, Object... obj) {
        System.out.printf(str, obj);
    }

    public static void printDesc(String desc) {
        println("------test info:"+desc+"------");
    }

    public static void print2File(String data) {
        try{
            File file = new File("crash.log");

            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }

            //true = append file
            FileWriter fileWriter = new FileWriter(file.getName());
            fileWriter.write(data);
            fileWriter.close();

            System.out.println("Done");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
