package com.zwonb.design.patterns.abstract0.factory;

/**
 * 客户端
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Client {

    public static void main(String[] args) {
        ConcreteFactory0 factory0 = new ConcreteFactory0();
        AbstractProductA productA = factory0.createProductA();
        AbstractProductB productB = factory0.createProductB();
    }
}
