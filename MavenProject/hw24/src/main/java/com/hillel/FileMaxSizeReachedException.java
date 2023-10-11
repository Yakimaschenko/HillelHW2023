package com.hillel;

public class FileMaxSizeReachedException extends RuntimeException{
    public FileMaxSizeReachedException(Integer maxFileSize, int length, String message) {
        super(message);
    }
}
