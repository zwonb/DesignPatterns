package com.zwonb.design.patterns.factory.method;

/**
 * 具体工厂类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class ConcreteFactory1 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
