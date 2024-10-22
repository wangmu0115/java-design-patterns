package com.wmirs.java.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Desc
 * @Author WangMu
 * @Create 2024-10-22
 */
public class Example {
    private static final Logger log = LoggerFactory.getLogger(Example.class);


    public static void main(String[] args) {
        log.info("Example log from {}", Example.class.getSimpleName());
    }
}
