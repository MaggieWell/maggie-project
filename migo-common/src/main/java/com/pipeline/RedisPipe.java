package com.pipeline;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试使用redis管道
 *
 * @author Maggie.Hao
 * @date 2019/4/12 10:12
 */
public class RedisPipe {
/*
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisPipe.class);
    */
/*
 * 测试普通模式与PipeLine模式的效率：
 * 测试方法：向redis中插入10000组数据
 *//*

    public static void testPipeLineAndNormal(Jedis jedis)
            throws InterruptedException {
        Logger logger = Logger.getLogger("javasoft");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            jedis.set(String.valueOf(i), String.valueOf(i));
        }
        long end = System.currentTimeMillis();
        logger.info("the jedis total time is:" + (end - start));

        Pipeline pipe = jedis.pipelined(); // 先创建一个pipeline的链接对象
        long start_pipe = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            pipe.set(String.valueOf(i), String.valueOf(i));
        }
        pipe.sync(); // 获取所有的response
        long end_pipe = System.currentTimeMillis();
        logger.info("the pipe total time is:" + (end_pipe - start_pipe));

        BlockingQueue<String> logQueue = new LinkedBlockingQueue<String>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            logQueue.put("i=" + i);
        }
        long stop = System.currentTimeMillis();
        logger.info("the BlockingQueue total time is:" + (stop - begin));
    }
*/

}
