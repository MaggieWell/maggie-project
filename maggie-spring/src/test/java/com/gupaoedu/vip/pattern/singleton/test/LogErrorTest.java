package com.gupaoedu.vip.pattern.singleton.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Tom.
 */
public class LogErrorTest{

    private static final Logger LOGGER = LoggerFactory.getLogger(LogErrorTest.class);

    public static void main(String[] args){
        try{
            int a = 1 / 0;
        }catch (Exception e){
            LOGGER.error("", e);
        }

    }
}
