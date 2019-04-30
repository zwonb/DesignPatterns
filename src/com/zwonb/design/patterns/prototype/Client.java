package com.zwonb.design.patterns.prototype;

/**
 * 客户端
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("zwonb");
        Prototype clone = prototype.myClone();
        System.out.println(clone.toString());
    }
}
