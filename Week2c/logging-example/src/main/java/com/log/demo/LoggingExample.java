package com.log.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("🚨 This is an ERROR message");
        logger.warn("⚠️ This is a WARNING message");
    }
}
