package com.laba.taxi.utils;

import java.util.logging.Logger;

public class LoggerService {

    private static final Logger logger = Logger.getLogger(LoggerService.class.getName());

    private LoggerService() {
    }

    private static class Holder {
        private static final LoggerService INSTANCE = new LoggerService();
    }

    public static LoggerService getInstance() {
        return Holder.INSTANCE;
    }

    public void log(String message) {
        logger.info(" LoggerService " + message);
    }
}

