package com.hillel;

import java.util.logging.Level;

public class FileLoggerConfiguration {
    private String path; // ../result.log
    private LoginLevel level;
    private Integer maxFileSize; // in byte
    private String logFormat;

    public FileLoggerConfiguration(String path, LoginLevel level, Integer maxFileSize, String logFormat) {
        this.path = path;
        this.level = level;
        this.maxFileSize = maxFileSize;
        this.logFormat = logFormat;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LoginLevel getLevel() {
        return level;
    }

    public void setLevel(LoginLevel level) {
        this.level = level;
    }

    public Integer getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public String getLogFormat() {
        return logFormat;
    }

    public void setLogFormat(String logFormat) {
        this.logFormat = logFormat;
    }
}
