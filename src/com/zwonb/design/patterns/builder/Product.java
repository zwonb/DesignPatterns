package com.zwonb.design.patterns.builder;

/**
 * 产品类
 *
 * @author zwonb
 * @date 2019/4/30
 */
public class Product {

    private String name;
    private String type;
    private int color;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getColor() {
        return color;
    }

    public Product(Builder builder) {
        name = builder.name;
        type = builder.type;
        color = builder.color;
    }

    /**
     * 产品构造器
     */
    public static class Builder {

        private String name = "default";
        private String type = "default";
        private int color = 0;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setColor(int color) {
            this.color = color;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
