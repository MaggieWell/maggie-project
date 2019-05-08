package com.maggie.factorytest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 工厂类测试
 *
 * @author Maggie.Hao
 * @date 2019/4/30 16:50
 */
public class JavaCourse implements ICourse{
private static final Logger LOGGER = LoggerFactory.getLogger(JavaCourse.class);
    public void record(){

        LOGGER.info("this is Java Course!");

    }

}
