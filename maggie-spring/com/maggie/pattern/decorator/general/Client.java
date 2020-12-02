package com.maggie.pattern.decorator.general;



/**
 * @Auther  MaggieHao
 * @Date  2020-11-26
 * @Time  22:17
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();//首先创建需要被装饰的原始对象（即要被装饰的对象）
        Decorator decoratorA = new ConcreteDecoratorA(component);//给对象透明的增加功能A并调用
        decoratorA.operation();
        Decorator decoratorB = new ConcreteDecoratorB(component);//给对象透明的增加功能B并调用
        decoratorB.operation();

        Decorator decoratorBandA = new ConcreteDecoratorB(decoratorA);//装饰器也可以具体的装饰对象
        decoratorBandA.operation();

    }

}
