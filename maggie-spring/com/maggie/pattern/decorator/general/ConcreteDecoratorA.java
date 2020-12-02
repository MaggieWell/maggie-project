package com.maggie.pattern.decorator.general;

/**
 * @Auther MaggieHao
 * @Date 2020-11-25
 */

public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    private void operationFirst(){}
    private void operationLast(){}
    @Override
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加动作
        operationFirst();
        super.operation();// 这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法
        operationLast();
    }
}
