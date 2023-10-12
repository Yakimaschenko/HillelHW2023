package com.hillel;

import java.util.logging.Level;

public class ConverterRun {
    public static void main(String[] args) {
//        System.out.println(DateTransformer.convert());

//        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("log.txt", Level.INFO, 500,"%s %s Massage: %s");
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("log.txt", LoginLevel.INFO, 200,"%s %s Massage: %s");

        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);

        fileLogger.log(LoginLevel.INFO,"massage for level - INFO");
        fileLogger.log(LoginLevel.DEBUG,"massage for level - DEBUG");

        //        try{
//            fileLogger.log(LoginLevel.DEBUG,"This massage for DEBUG, but the file will be full");
//        } catch (FileMaxSizeReachedException e){
//            System.out.println(e.getMessage());
//        }

    }
}
