package com.laba.taxi.utils;

import com.laba.taxi.annotations.EntityInfo;
import com.laba.taxi.user.driver.Driver;

import java.util.logging.Logger;

public class AnnotationReader {
    private static final Logger logger = Logger.getLogger(Driver.class.getName());

    public static void printEntityInfo(Class<?> clazz) {
        if (clazz.isAnnotationPresent(EntityInfo.class)) {
            EntityInfo info = clazz.getAnnotation(EntityInfo.class);
            logger.info("Passenger: " + info.passenger());
            logger.info("Date: " + info.date());
        } else {
            logger.info("No EntityInfo annotation found for " + clazz.getSimpleName());
        }
    }
}
