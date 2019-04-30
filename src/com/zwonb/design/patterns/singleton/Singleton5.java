package com.zwonb.design.patterns.singleton;

/**
 * 单例模式 枚举
 *
 * @author zwonb
 * @date 2019/4/30
 */
public enum Singleton5 {

    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        Singleton5 singleton5 = Singleton5.INSTANCE;
        singleton5.setName("zwonb");
        System.out.println(singleton5.getName());

        Singleton5 instance = Singleton5.INSTANCE;
        instance.setName("hello");
        System.out.println(instance.getName());

        System.out.println("=================");
        System.out.println(singleton5.getName());
        System.out.println(instance.getName());

        System.out.println("=================");
        try {
            Singleton5[] enumConstants = Singleton5.class.getEnumConstants();
            for (Singleton5 constant : enumConstants) {
                System.out.println(constant.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
