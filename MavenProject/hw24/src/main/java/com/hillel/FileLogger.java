package com.hillel;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLogger {

    private FileLoggerConfiguration config;
    private int logLenght;

    public FileLogger(FileLoggerConfiguration config) {
        this.config = config;
    }
    // 1 - create log file using path, if not exist

    void log(LoginLevel level, String message) {
        if (!Files.exists(Paths.get(config.getPath()))) {
            try {
                Files.createFile(Paths.get(config.getPath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (level.equals(LoginLevel.INFO) || level.equals(LoginLevel.DEBUG)) {

            String log = String.format("%s %s Message: %s \n", DateTransformer.convert(), level, message);
            logLenght = log.length() + logLenght;


            if (logLenght > config.getMaxFileSize()) {
                throw new FileMaxSizeReachedException(config.getMaxFileSize(), log.length(), config.getPath());
            }

            try {
                FileWriter fileWriter = new FileWriter(config.getPath(),true);
                fileWriter.write(log);
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(log);
        }
    }

    }

