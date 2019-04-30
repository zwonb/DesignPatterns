package com.zwonb.design.patterns.abstract0.factory;

/**
 * 抽象工厂类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public abstract class AbstractFactory {

    abstract AbstractProductA createProductA();

    abstract AbstractProductB createProductB();
}
