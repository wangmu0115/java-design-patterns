package com.wmirs.java.log;

import ch.qos.logback.classic.Level;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Desc
 * @Author WangMu
 * @Create 2024-10-22
 */
public class HierarchyExample {


    public static void main(String[] args) {
//        ch.qos.logback.classic.Logger parentLogger =
//                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.wmirs.java.log");
//        parentLogger.setLevel(Level.INFO);
//        ch.qos.logback.classic.Logger childLogger =
//                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.wmirs.java.log.children");
//        parentLogger.warn("This message is logged because WARN > INFO.");
//        parentLogger.debug("This message is not logged because DEBUG < INFO.");
//        childLogger.info("INFO == INFO");
//        childLogger.debug("DEBUG < INFO");
        ch.qos.logback.classic.Logger logger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.wmirs.java.log");
        logger.debug("Hi there!");
        ch.qos.logback.classic.Logger rootLogger =
                (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.debug("This message is logged because DEBUG == DEBUG");
        rootLogger.setLevel(Level.ERROR);
        logger.warn("This message is not logged because WARN < ERROR.");
        logger.error("This is logged.");

        String s1 = "Hello";
        Integer i2 = 42;
        Boolean b3 = false;
        try {

        } catch(Exception e) {
            logger.error("this is {}{}{}", s1, i2, b3, e);
        }
    }


}
