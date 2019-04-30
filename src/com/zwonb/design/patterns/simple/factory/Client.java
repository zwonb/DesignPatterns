package com.zwonb.design.patterns.simple.factory;

/**
 * 简单工厂
 *
 * 客户端类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Client {

    public static void main(String[] args) {
        int type = 0;
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct(type);
    }

//    /**
//     * 以下的 Client 类包含了实例化的代码，这是一种错误的实现。
//     * 如果在客户类中存在这种实例化代码，就需要考虑将代码放到简单工厂中。
//     */
//    private static Factory createProduct(int type) {
//        switch (type) {
//            case 0:
//                return new ConcreteProduct0();
//            case 1:
//                return new ConcreteProduct1();
//            case 2:
//                return new ConcreteProduct2();
//            default:
//                return null;
//        }
//    }

}
