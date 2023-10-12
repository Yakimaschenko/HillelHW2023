package com.hillel;

public class FileMaxSizeReachedException extends RuntimeException{
    public FileMaxSizeReachedException(Integer maxFileSize, int length, String path) {
        super(String.format("Max file size: %s, current size: %s, name file: %s", maxFileSize,length,path));
    }
}
