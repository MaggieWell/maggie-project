package com.maggie.pattern.openclose;

/**
 * Description:开闭原则，
 *  定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭。用抽象构建框架，用实现扩展细节
 *  有点：提高系统的可复用性及可维护性
 * author:MaggieHao
 * Date:2020-05-28
 * Time:22:09
 */
public class OpenClosePrincipleTest {
    public static void main(String[] args) {
        ICourse iCourse = new ICourseImplement(1,"数学",10.1);
        ICourse iCourse1 = new JavaICourseImplement(1,"数学",10.1);

        System.out.println("课程ID：" + iCourse.getId() +",课程名称："+iCourse.getName()+",价格："+iCourse.getPrice());
        System.out.println("课程ID：" + iCourse1.getId() +",课程名称："+iCourse1.getName()+",价格："+iCourse1.getPrice());
    }
}
