package com.laba.taxi.utils;

import com.laba.taxi.annotations.EntityInfo;

import java.util.logging.Logger;

public class AnnotationService {
    private static final Logger logger = Logger.getLogger(AnnotationService.class.getName());

    public void printEntityMetadata(Class<?> clazz) {
        if (clazz.isAnnotationPresent(EntityInfo.class)) {
            EntityInfo info = clazz.getAnnotation(EntityInfo.class);
            logger.info("Info for " + clazz.getSimpleName() + ":");
            logger.info("Passenger: " + info.passenger());
            logger.info("Date: " + info.date());
        } else {
            logger.warning("No EntityInfo annotation present on " + clazz.getSimpleName());
        }
    }
}

