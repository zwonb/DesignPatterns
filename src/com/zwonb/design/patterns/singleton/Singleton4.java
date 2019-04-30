package com.zwonb.design.patterns.singleton;

/**
 * 单例模式 静态内部类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Singleton4 {

    private Singleton4() {
    }

    /**
     * 当 Singleton4 类加载时，静态内部类 Holder 没有被加载进内存。
     * 只有当调用 getInstance() 方法从而触发 Holder.INSTANCE 时 Holder 才会被加载，
     * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
     * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
     */
    public static Singleton4 getInstance(){
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }


}
