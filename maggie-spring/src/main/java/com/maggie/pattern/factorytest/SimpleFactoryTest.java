package com.maggie.pattern.factorytest;

/**
 * 工厂类测试
 *
 * @author Maggie.Hao
 * @date 2019/4/30 16:50
 */
public class SimpleFactoryTest {


    public static void main(String[] args){
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.course("com.maggie.JavaCourse");
        course.record();
    }

}
