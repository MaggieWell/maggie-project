package com.maggie;

/**
 * 工厂类测试
 *
 * @author Maggie.Hao
 * @date 2019/4/30 16:50
 */
public class CourseFactory{

    public ICourse create(String course){
        if (course.equals("java")){
            return new JavaCourse();
        }
        return null;
    }

    public ICourse course(String className){
        try{
            if (!(null == className || "".equals(className))){
                return (ICourse) Class.forName(className).newInstance();

            }
        }catch (Exception e){

        }
        return null;
    }

}
