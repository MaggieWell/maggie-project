package com.maggie.pattern.singletontest.lazy;

/**
* Description:全程没有用到synchronized关键字
* author:MaggieHao
* Date:2019-05-08-23:19:00
*
* */
public class LazyInnerClassSingleton {
    private static LazyInnerClassSingleton lazySingleton = null;

    //虽然构造方法私有了，但是逃不过反射的法眼
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException(("不允许构建多个实例"));
        }
    }

    //懒汉式单例。LazyHolder里面的逻辑需要等到外部方法调用时才执行
    //巧妙的使用了内部类的特性，JVM底层执行逻辑，完美的避免了线程安全问题
    //性能最优的一种写法
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{

        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}
