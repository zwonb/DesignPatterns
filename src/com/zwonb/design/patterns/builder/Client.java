package com.zwonb.design.patterns.builder;

/**
 * 客户端
 * 建造者模式
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Client {

    public static void main(String[] args) {
        Product product = new Product.Builder()
                .setName("zwonb")
                .setType("people")
                .setColor(0xffff0000)
                .build();

        String name = product.getName();
        System.out.println(name);
    }
}
