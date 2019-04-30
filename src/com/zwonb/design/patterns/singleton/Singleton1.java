package com.zwonb.design.patterns.singleton;

/**
 * 单例模式 饿汉式-线程安全
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    /**
     * 线程不安全问题主要是由于 instance 被实例化多次，
     * 采取直接实例化 instance 的方式就不会产生线程不安全问题。
     * 但是直接实例化的方式也丢失了延迟实例化带来的节约资源的好处。
     */
    public static Singleton1 getInstance() {
        return instance;
    }
}
