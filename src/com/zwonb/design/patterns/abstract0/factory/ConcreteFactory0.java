package com.zwonb.design.patterns.abstract0.factory;

/**
 * 具体工厂类
 * 负责创建 0类型 产品
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class ConcreteFactory0 extends AbstractFactory {
    @Override
    AbstractProductA createProductA() {
        return new ProductA0();
    }

    @Override
    AbstractProductB createProductB() {
        return new ProductB0();
    }
}
