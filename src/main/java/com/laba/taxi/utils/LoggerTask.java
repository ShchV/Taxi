package com.laba.taxi.utils;

public class LoggerTask implements Runnable {
    private final String threadName;

    public LoggerTask(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        LoggerService logger = LoggerService.getInstance();
        for (int i = 0; i < 3; i++) {
            logger.log("Thread " + threadName + " - iteration " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.log("Thread " + threadName + " interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }
}

