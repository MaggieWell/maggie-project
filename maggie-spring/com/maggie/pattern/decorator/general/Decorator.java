package com.maggie.pattern.decorator.general;


/**
 * @Auther  MaggieHao
 * @Date  2020-11-25
 * @Time  22:44
 */
public abstract class Decorator extends Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation(){
        //转发请求给组件对象，可以再转发前后执行一些附加动作
        component.operation();
    }
}
