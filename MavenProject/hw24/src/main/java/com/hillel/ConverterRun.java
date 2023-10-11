package com.hillel;

import java.util.logging.Level;

public class ConverterRun {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(DateTransformer.convert());

        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("log.txt", Level.INFO, 50,"[%d-%m-%Y %H:%M:%S][%L] Massage: %s");

        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);

        fileLogger.log(LoginLevel.INFO,"massage for DEBUG");
        fileLogger.log(LoginLevel.DEBUG,"massage for INFO");

        try{
            fileLogger.log(LoginLevel.DEBUG,"massage for DEBUG, but file will be close");
        } catch (FileMaxSizeReachedException e){
            System.out.println(e.getMessage());
        }


    }
}
