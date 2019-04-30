package com.zwonb.design.patterns.factory.method;

/**
 * 工厂方法
 *
 * 产品抽象类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public abstract class Factory {

    public abstract Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
    }
}
