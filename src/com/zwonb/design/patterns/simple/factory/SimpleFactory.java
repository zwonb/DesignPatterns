package com.zwonb.design.patterns.simple.factory;

/**
 * 简单工厂实现类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        switch (type) {
            case 0:
                return new ConcreteProduct0();
            case 1:
                return new ConcreteProduct1();
            case 2:
                return new ConcreteProduct2();
            default:
                return null;
        }
    }
}
