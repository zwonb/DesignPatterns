package com.zwonb.design.patterns.singleton;

/**
 * 单例模式 懒汉式-线程安全
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    /**
     * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 instance 已经被实例化了。
     * 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
     */
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
