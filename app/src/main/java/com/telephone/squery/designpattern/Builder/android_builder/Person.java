package com.telephone.squery.designpattern.Builder.android_builder;

/**
 * Created by Administrator[Squery] on 2015/12/1.
 */

/**
 * 这种模式是对java builder的一个封装 这种模式比较常用  规避掉了中间的 director这个环节
 *
 * 这种模式  主要流程是 1.定义一个静态内部类Builder，内部类的成员变量和外部类的一样
 *                    2. Builer类通过一系列的方法用于成员变量的赋值，并返回当前对象本身（this）
 *                    3. Builer类提供了一个build方法用于创建对应的外部类，该方法内部调用了外部类的一个私有构造函数，该构造函数的参数就是内部类Builer自己
 *                    4. 外部类提供了一个私有构造函数供内部类调用，在该构造函数中完成成员变量的赋值，取值为Builer对象中对应的值
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private Person(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.height=builder.height;
        this.weight=builder.weight;
    }

    static class Builder {
        private String name;
        private int age;
        private double height;
        private double weight;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(double height) {
            this.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
