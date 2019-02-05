package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger logger = null;
    public String lastLog;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println(lastLog);
    }

    public String getLastLog() {
        return lastLog;
    }

}
